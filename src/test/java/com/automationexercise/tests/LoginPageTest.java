package com.automationexercise.tests;

import com.automationexercise.pages.LoginPage;
import com.automationexercise.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{

    LoginPage loginPage;
    String email = ConfigReader.getProperty("emailAddress");
    String pwd = ConfigReader.getProperty("password");
    @BeforeMethod(alwaysRun = true)
    public void loginPageSetup(){
        loginPage = new LoginPage(driver);
    }

    @Test(groups = {"Sanity"},priority = 1)
    public void verifyInvalidLoginFailure(){
        System.out.println("verifyInvalidLoginFailure");
        loginPage.clickOnLoginMenu();
        loginPage.enterEmailAddress(email);
        loginPage.enterPassword(pwd);
        loginPage.clickOnLoginBtn();
        Assert.assertEquals(loginPage.incorrectEmailPwdMsg(),"Your email or password is incorrect!");
    }



}
