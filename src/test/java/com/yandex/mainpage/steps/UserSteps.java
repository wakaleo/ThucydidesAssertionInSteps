package com.yandex.mainpage.steps;

import com.yandex.mainpage.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.Matchers.startsWith;
import static org.junit.Assert.assertThat;

public class UserSteps extends ScenarioSteps {
    public UserSteps(Pages pages) {
        super(pages);
    }

    private HomePage onHomePage() {
        return getPages().currentPageAt(HomePage.class);
    }

    @Step
    public void entersRequest(String request) {
        onHomePage().enterRequest(request);
    }

    @Step
    public void searchForRequest() {
        onHomePage().lookup();
    }

    @Step
    public void shouldSeeSerp() {
        shouldSeePage("http://www.yandex.com/yandsearch?text=");
    }

    public void shouldSeePage(String url) {
        String currentUrl = getDriver().getCurrentUrl();
        assertThat("Wrong serp! " + currentUrl, currentUrl, startsWith(url));
    }
}
