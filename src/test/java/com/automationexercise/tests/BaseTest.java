package com.automationexercise.tests;

import com.automationexercise.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;

    //initiate driver object
    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperty("baseURL"));
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        if(driver != null) {
            driver.quit();
        }
    }
}
