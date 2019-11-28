package com.trello;

import com.trello.Pages.AtlassianLoginPage;
import com.trello.Pages.LoginPage;
import com.trello.Pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.WebDriverWait;
import com.trello.utilities.DriverFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    @Test
    public void loginPageTest() {

        String browser = "chrome";
        String url = "https://trello.com/home";
        String email = "olomlomaz@gmail.com";
        String password = "Qwerty123321";
        WebDriver driver;

        driver = DriverFactory.open(browser);
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        MainPage mainPage = new MainPage(driver);
        mainPage.clickLogInButton();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setEmail(email);
        loginPage.clickLogInWithAtlassian();

        AtlassianLoginPage atlassianLoginPage = new AtlassianLoginPage(driver);
        atlassianLoginPage.clearEmail();
        atlassianLoginPage.setEmail(email);
        atlassianLoginPage.clickSubmit();
        atlassianLoginPage.setPassword(password);
        atlassianLoginPage.clickSubmit();

//        WebElement message = (new WebDriverWait(driver, 5))
//                .until(new ExpectedCondition<WebElement>(){
//                    @Override
//                    public WebElement apply(WebDriver d) {
//                        return d.findElement(By.cssSelector(".boards-page-board-section-list>li:first-child"));
//                    }});

        Assert.assertEquals("MyBoard",driver.findElement(By.cssSelector(".boards-page-board-section-list>li:first-child div.board-tile-details-name")).getText());

        driver.quit();

    }

}
