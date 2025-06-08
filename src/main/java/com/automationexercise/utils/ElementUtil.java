package com.automationexercise.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

    WebDriver driver;

    public ElementUtil(WebDriver driver){
        this.driver = driver;
    }
    public void doClick(By locator){
        driver.findElement(locator).click();
    }
    public String getPageTitle(){
        return driver.getTitle();
    }
    public WebElement getElement(By locator){
        return driver.findElement(locator);
    }
    public boolean isElementDisplayed(By locator){
        return driver.findElement(locator).isDisplayed();
    }
    public void enterText(By locator, String value){
        driver.findElement(locator).sendKeys(value);
    }

}
