package com.orange.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    String baseURL = "https://opensource-demo.orangehrmlive.com";

    By signInButtonClass = By.id("btnLogin");
    By txtUserName = By.id("txtUsername");
    By txtPassword = By.id("txtPassword");

    public LoginPage goToSite() {
        driver.get(baseURL);
        return this;
    }

    public LoginPage fillUserInfo(String userName, String password) {
        writeText(txtUserName, userName);
        writeText(txtPassword, password);
        return this;
    }

    public LoginPage clickOnLoginButton() {

        click(signInButtonClass);
        return this;
    }

    public HomeOrangeHrmPage getHomeOrangeHrmPage() {
        return new HomeOrangeHrmPage(driver);
    }
}