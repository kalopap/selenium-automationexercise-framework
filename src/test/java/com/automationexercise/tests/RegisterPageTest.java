package com.automationexercise.tests;

import com.automationexercise.actions.UserActions;
import com.automationexercise.pages.LoginPage;
import com.automationexercise.pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseTest{
    RegisterPage registerPage;
    LoginPage loginPage;
    UserActions userAction;

    @BeforeMethod(alwaysRun = true)
    public void setupSignupPage(){
        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);
        userAction = new UserActions(driver);
    }

    @Test(groups = {"EndToEndTests","Sanity"},priority = 1)
    public void verifyRegisterUserAndDeleteAccount(){
        loginPage.clickOnLoginMenu();
        loginPage.enterSignUpName("Someone2");
        loginPage.enterSignUpEmail("someone2@test.com");
        loginPage.clickOnSignupBtn();
        Assert.assertEquals(registerPage.getRegisterPageTitle(),"Automation Exercise - Signup");
        Assert.assertEquals(registerPage.isEnterInfoTxtPresent(),true);
        registerPage.selectMrTitleOption();
        registerPage.enterPasswordText("someone2@123");
        registerPage.selectNewsLetterCheckBox();
        registerPage.selectOffersCheckBox();
        registerPage.enterFirstLastName("Someone2","Selenium");
        registerPage.enterAddress1("123 ABC Pl NE 34567");
        registerPage.selectCountry("Igsrael");
        registerPage.enterState("Hoku");
        registerPage.enterCityName("Haha");
        registerPage.enterZipCode("34567");
        registerPage.enterMobileNumber("12334678");
        registerPage.clickCreateAccountBtn();
        Assert.assertEquals(registerPage.accountSuccessTxt(),"ACCOUNT CREATED!");
        registerPage.clickOnContinueBtn();
        Assert.assertEquals(loginPage.verifyLoggedInUserName(),"Logged in as Someone2");
        loginPage.clickOnDeleteAccount();
        Assert.assertEquals(loginPage.accountDeletedMsg(),"ACCOUNT DELETED!");
        loginPage.clickOnContinueBtn();
    }


    @Test(groups = {"Sanity"},priority=1)
    public void verifyExistingUserSignup(){
        userAction.signUp("tester1","tester1@test.com");
        Assert.assertEquals(loginPage.getErrorText(),"Email Address already exist!");
    }
}
