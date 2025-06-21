package com.automationexercise.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

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
    public String getElementText(By locator){
        return driver.findElement(locator).getText();
    }
    public void toggleCheckbox(By locator){
        driver.findElement(locator).click();
    }
    public void selectItemFromDropDownMenu(By locator, String item){
        WebElement drpdwnMenu = driver.findElement(locator);
        Select sel = new Select(drpdwnMenu);
        List<WebElement> allOptions = sel.getOptions();
        for(WebElement option : allOptions){
            if(option.getText().equals(item)){
                System.out.println("The country is available in the dropdown list -"+ option.getText());
                option.click();
                break;
            }
        }
    }

}
