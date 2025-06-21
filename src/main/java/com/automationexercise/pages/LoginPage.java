package com.automationexercise.pages;

import com.automationexercise.base.BasePage;
import com.automationexercise.utils.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    ElementUtil elementUtil;
    private By loginMenu = By.xpath("//a[@href='/login']");
    private By email = By.xpath("//input[@data-qa='login-email']");

    private By pwd = By.xpath("//input[@data-qa='login-password']");
    private By loginBtn = By.xpath("//button[@data-qa='login-button']");
    private By logoutBtn = By.cssSelector("a[href='/logout']");

    //private By loggedInAsUser = By.xpath("//li[normalize-space()='Logged in as Someone2']");
    private By loggedInAsUser = By.xpath("//a[contains(text(),'Logged in as')]");
    private By delAccount = By.cssSelector("a[href='/delete_account']");
    private By deletedText = By.xpath("//b[normalize-space()='Account Deleted!']");
    private By continueBtn = By.cssSelector("a[data-qa='continue-button']");
    private By incorrectEmailPwd=By.xpath("//p[normalize-space()='Your email or password is incorrect!']");
    private By signUpName = By.cssSelector("input[placeholder='Name']");
    private By signUpEmail = By.cssSelector("input[data-qa='signup-email'");
    private By signUpBtn = By.cssSelector("button[data-qa='signup-button']");
    private By emailExistText = By.xpath("//p[normalize-space()='Email Address already exist!']");

    public LoginPage(WebDriver driver){
        super(driver);
        elementUtil = new ElementUtil(driver);
    }
    public String getLoginPageTitle(){
        return elementUtil.getPageTitle();
    }
    public void clickOnLoginMenu(){
        elementUtil.doClick(loginMenu);
            }
    public void enterEmailAddress(String value){
        elementUtil.isElementDisplayed(email);
        elementUtil.enterText(email,value);
    }
    public void enterPassword(String value){
        elementUtil.enterText(pwd, value);
    }
    public void clickOnLoginBtn(){
        elementUtil.doClick(loginBtn);
    }
    public void clickOnLogOutBtn(){
        elementUtil.doClick(logoutBtn);
    }
    public void enterSignUpName(String text){
        elementUtil.enterText(signUpName,text);
    }
    public void enterSignUpEmail(String text){
        elementUtil.enterText(signUpEmail,text);
    }
    public void clickOnSignupBtn(){
        elementUtil.doClick(signUpBtn);
    }
    public String getErrorText(){
        return elementUtil.getElementText(emailExistText);
    }


    public String verifyLoggedInUserName(){
        return elementUtil.getElementText(loggedInAsUser);
    }
    public void clickOnDeleteAccount(){
        elementUtil.doClick(delAccount);
    }
    public String accountDeletedMsg(){
        return elementUtil.getElementText(deletedText);
    }
    public boolean isDeleteAccountPresent(){
        return elementUtil.isElementDisplayed(delAccount);
    }

    public void clickOnContinueBtn(){
        elementUtil.doClick(continueBtn);
    }
    public String incorrectEmailPwdMsg(){
        return elementUtil.getElementText(incorrectEmailPwd);
    }


}
