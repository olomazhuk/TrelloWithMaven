package com.trello;

import com.trello.Pages.MainPage;
import org.openqa.selenium.WebDriver;
import com.trello.utilities.DriverFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SignUpTest {

    @Test
    public void openSignUpPageTest() {

        String browser = "chrome";
        String url = "https://trello.com/home";
        WebDriver driver;

        driver = DriverFactory.open(browser);
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        MainPage mainPage = new MainPage(driver);
        mainPage.clickSignUpButton();

        String expectedUrl = "https://trello.com/signup";

        //Check the URL
        Assert.assertEquals(expectedUrl, driver.getCurrentUrl());

        driver.quit();

    }

}
