package com.orange.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomeOrangeHrmPage extends BasePage {

    public HomeOrangeHrmPage(WebDriver driver) {
        super(driver);
    }

    By recruitmentMenu = By.id("menu_recruitment_viewRecruitmentModule");
    By btnAddButton = By.id("btnAdd");
    By resultTable = By.id("resultTable");

    public HomeOrangeHrmPage clickOnRecruitmentMenu() {
        click(recruitmentMenu);
        return this;
    }

    public HomeOrangeHrmPage clickOnBtnAdd() {
        click(btnAddButton);
        return this;
    }

    public AddCandidatePage getAddCandidatePage() {
        return new AddCandidatePage(driver);
    }

    public void downloadResume() throws InterruptedException {
        WebElement baseTable = driver.findElement(resultTable);
        List<WebElement> tableRows = baseTable.findElements(By.tagName("tr"));
        // we are assuming the first row was the last item created
        WebElement webElement = tableRows.get(1).findElement(By.xpath("//a[text()='Download']"));
        webElement.click();
        Thread.sleep(5000);
    }
}