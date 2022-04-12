package com.orange.tests;

import com.orange.pages.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public  WebDriver driver;
    public LoginPage loginPage;

    public WebDriver getDriver() {
        return driver;
    }

    @Before
    public void methodLevelSetup() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DISPLAY\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }

    @After
    public  void teardown() {
        if(driver != null) {
            driver.quit();
        }
    }
}