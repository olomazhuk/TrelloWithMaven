package com.trello.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {

    WebDriver driver;

    public void setEmail(String email) {
        driver.findElement(By.cssSelector("#email")).sendKeys(email);
    }

    public void setPassword(String password) {
        driver.findElement(By.cssSelector("#password")).sendKeys(password);
    }

    public void clickContinue() {
        driver.findElement(By.cssSelector("#signup")).click();
    }

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

}
