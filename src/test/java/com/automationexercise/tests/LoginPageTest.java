package com.automationexercise.tests;

import com.automationexercise.pages.LoginPage;
import com.automationexercise.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{

    LoginPage loginPage;
    String email = ConfigReader.getProperty("emailAddress");
    String pwd = ConfigReader.getProperty("password");
    @BeforeClass
    public void loginPageSetup(){
        loginPage = new LoginPage(driver);
    }
    @Test
    public void verifyLoginSuccess(){

        loginPage.clickOnLoginMenu();
        Assert.assertEquals(loginPage.getLoginPageTitle(),"Automation Exercise - Signup / Login");
        loginPage.enterEmailAddress(email);
        loginPage.enterPassword(pwd);
        loginPage.clickOnLoginBtn();
        Assert.assertEquals(loginPage.getLoginPageTitle(),"Automation Exercise");
    }

}
