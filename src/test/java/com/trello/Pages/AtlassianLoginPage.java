package com.trello.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AtlassianLoginPage {

    WebDriver driver;

    public void clearEmail() {
        driver.findElement(By.cssSelector("#username")).clear();
    }

    public void setEmail(String email) {
        driver.findElement(By.cssSelector("#username")).sendKeys(email);
    }

    public void setPassword(String password) {
        driver.findElement(By.cssSelector("#password")).sendKeys(password);
    }

    public void clickSubmit() {
        driver.findElement(By.cssSelector("#login-submit")).click();
    }

    public void clickSignUpSubmit() {
        driver.findElement(By.cssSelector("#signup-submit")).click();
    }

    public AtlassianLoginPage(WebDriver driver) {
        this.driver = driver;
    }

}
