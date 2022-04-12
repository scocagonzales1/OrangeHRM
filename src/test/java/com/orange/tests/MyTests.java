package com.orange.tests;

import io.qameta.allure.*;
import org.junit.Assert;
import org.junit.Test;

@Feature("Create candidate")
public class MyTests extends BaseTest {

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Test Description: Add the candidate with the required fields.")
    @Story("Basic features")
    public void AddAValidCandidate() {
        loginPage.goToSite()
                .fillUserInfo(System.getProperty("username"), System.getProperty("password"))
                .clickOnLoginButton()
                .getHomeOrangeHrmPage()
                .clickOnRecruitmentMenu()
                .clickOnBtnAdd()
                .getAddCandidatePage()
                .fillForm()
                .uploadFileResume(System.getProperty("resumePath"))
                .clickOnSaveButton()
                .validateUserCreatedByMessage();
                //.validateUserWasCreated() ;
            }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Test Description: Download a resume from a user created .")
    @Story("Basic features")
    public void DownloadCandidateResume() throws InterruptedException {
        loginPage.goToSite()
                .fillUserInfo(System.getProperty("username"), System.getProperty("password"))
                .clickOnLoginButton()
                .getHomeOrangeHrmPage()
                .clickOnRecruitmentMenu()
                .clickOnBtnAdd()
                .getAddCandidatePage()
                .fillForm()
                .uploadFileResume(System.getProperty("resumePath"))
                .clickOnSaveButton()
                .validateUserWasCreated()
                .getHomeOrangeHrmPage()
                .clickOnRecruitmentMenu()
                .downloadResume();

    }
}