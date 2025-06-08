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



}
