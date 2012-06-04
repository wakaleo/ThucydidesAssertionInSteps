package com.yandex.mainpage;

import com.yandex.mainpage.requirements.Application;
import com.yandex.mainpage.steps.UserSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@Story(Application.Report.ErrorInTheStep.class)
@RunWith(ThucydidesRunner.class)
public class ReportWithErrorInTheStepTest {
    @Managed
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://www.yandex.com")
    public Pages pages;

    @Steps
    public UserSteps user;

    @Test
    public void testWithErrors() {
        user.entersRequest("yandex");
        user.searchForRequest();
        user.shouldSeeSerp();
    }
}
