package com.automationexercise.actions;

import com.automationexercise.pages.LoginPage;
import com.automationexercise.pages.RegisterPage;
import org.openqa.selenium.WebDriver;

public class UserActions {

    WebDriver driver;
    RegisterPage registerPage;
    LoginPage loginPage;
    public UserActions(WebDriver driver){
        this.driver = driver;
        loginPage = new LoginPage(driver);
        registerPage = new RegisterPage(driver);
    }
    public void login(String email, String password){
        loginPage.clickOnLoginMenu();
        loginPage.enterEmailAddress(email);
        loginPage.enterPassword(password);
        loginPage.clickOnLoginBtn();
    }
    public void signUp(String name, String email){
        loginPage.clickOnLoginMenu();
        loginPage.enterSignUpName(name);
        loginPage.enterSignUpEmail(email);
        loginPage.clickOnSignupBtn();
    }
    public void registerUserInfo(String title,String password,String firstName,String lastName, String address){
        if (title.equals("Mr")) {
            registerPage.selectMrTitleOption();
        } else {
            registerPage.selectMrsTitleOption();
        }

        registerPage.enterPasswordText("tester2@123");
        registerPage.enterFirstLastName("Tester2","Selenium");
        registerPage.enterAddress1(address);
    }
    public void registerCountryStateInfo(String country, String state,String city,String zipcode,String mobNum){
        registerPage.selectCountry(country);
        registerPage.enterState(state);
        registerPage.enterCityName(city);
        registerPage.enterZipCode(zipcode);
        registerPage.enterMobileNumber(mobNum);

    }
}
