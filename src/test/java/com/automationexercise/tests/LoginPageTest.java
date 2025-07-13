package com.automationexercise.tests;

import com.automationexercise.pages.LoginPage;
import com.automationexercise.utils.ConfigReader;
import com.automationexercise.utils.LoggerUtil;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{

    LoginPage loginPage;
    Logger log = LoggerUtil.getLogger(LoginPageTest.class);
    String email = ConfigReader.getProperty("emailAddress");
    String pwd = ConfigReader.getProperty("password");
    @BeforeMethod(alwaysRun = true)
    public void loginPageSetup(){
        loginPage = new LoginPage(driver);
        log.info("Web driver initiated for Login Page Tests..");
    }

    @Test(groups = {"Sanity"},priority = 1)
    public void verifyInvalidLoginFailure(){
        log.info("Starting test - verifyInvalidLoginFailure");
        log.info("Clicking on Login Menu button");
        log.info("Entering email address");
        loginPage.clickOnLoginMenu();
        loginPage.enterEmailAddress(email);
        loginPage.enterPassword(pwd);
        loginPage.clickOnLoginBtn();
        Assert.assertEquals(loginPage.incorrectEmailPwdMsg(),"Your email or password is incorrect!");
    }



}
