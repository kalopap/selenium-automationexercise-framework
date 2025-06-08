package com.automationexercise.tests;

import com.automationexercise.pages.HomePage;
import org.testng.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
  private HomePage homePage;
    @BeforeClass
    public void homePageSetup(){
        homePage = new HomePage(driver);
    }

    @Test
    public void verifyHomePageTitle(){
        Assert.assertEquals(homePage.getHomePageTitle(), "Automation Exercise");
        //click on Products menu
        homePage.clickOnProductsMenu();
        Assert.assertEquals(homePage.getHomePageTitle(), "Automation Exercise - All Products" );

    }


}
