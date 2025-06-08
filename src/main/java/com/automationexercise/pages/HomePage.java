package com.automationexercise.pages;

import com.automationexercise.base.BasePage;
import com.automationexercise.utils.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    WebDriver driver;
    private By productsMenu = By.xpath("//a[@href='/products']");
       ElementUtil elementUtil;

    public HomePage(WebDriver driver){
        super(driver);
        elementUtil = new ElementUtil(driver);
    }

    public void clickOnProductsMenu(){
        elementUtil.doClick(productsMenu);
    }

    public String getHomePageTitle(){
        return elementUtil.getPageTitle();
    }

}
