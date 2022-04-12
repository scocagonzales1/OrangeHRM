package com.orange.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class AddCandidatePage extends BasePage {

    public AddCandidatePage(WebDriver driver) {
        super(driver);
    }

    By firstName = By.id("addCandidate_firstName");
    By lastName = By.id("addCandidate_lastName");
    By email = By.id("addCandidate_email");
    By saveButton = By.id("btnSave");
    By resume = By.id("addCandidate_resume");
    By middleName = By.id("addCandidate_middleName");
    By ContactNo = By.id("addCandidate_contactNo");
    By AddCandidateVacancy = By.id("addCandidate_vacancy");

    public AddCandidatePage fillForm() {
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        String id = String.format("%06d", number);
        writeText(firstName, "silvia" + id.toString());
        writeText(lastName, "silvia" + id.toString());
        writeText(email, "silvia" + id.toString()+ "@gmail.com");

        return  this;
    }

    public AddCandidatePage uploadFileResume(String filePath) {
        writeText(resume, filePath);
        return this;
    }

    public AddCandidatePage clickOnSaveButton() {
        click(saveButton);
        return this;
    }

    public AddCandidatePage validateUserCreatedByMessage() {
        org.junit.Assert.assertEquals(driver.findElement(By.xpath(".//div[@class='message success fadable']")).getText(), "Successfully Saved");
        System.out.println(driver.findElement(By.xpath(".//div[@class='message success fadable']")).getText());
        return this;
    }

    public AddCandidatePage validateUserWasCreated() {
        org.junit.Assert.assertFalse(driver.findElement(firstName).isEnabled());
        org.junit.Assert.assertFalse(driver.findElement(lastName).isEnabled());
        org.junit.Assert.assertFalse(driver.findElement(email).isEnabled());
        return this;
    }

    public HomeOrangeHrmPage getHomeOrangeHrmPage() {
        return new HomeOrangeHrmPage(driver);
    }
}