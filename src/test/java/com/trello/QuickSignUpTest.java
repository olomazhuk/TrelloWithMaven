package com.trello;

import com.trello.Pages.MainPage;
import org.openqa.selenium.WebDriver;
import com.trello.utilities.DriverFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QuickSignUpTest {

    @Test
    public void quickSignUpTest() {

        String browser = "chrome";
        String url = "https://trello.com/home";
        String email = "qwertest1@test.te";
        WebDriver driver;

        driver = DriverFactory.open(browser);
        driver.get(url);

        MainPage mainPage = new MainPage(driver);
        mainPage.setEmailForQuickSignUp(email);
        mainPage.submitQuickSignUp();

        String currentUrl = driver.getCurrentUrl();

        Assert.assertTrue(driver.getCurrentUrl().startsWith("https://trello.com/signup?email="),
                "Current url is " + currentUrl + "Current URL should starts with \"https://trello.com/signup?email=\"");

        driver.quit();

    }

}
