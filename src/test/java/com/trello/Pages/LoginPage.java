package com.trello.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public void setEmail(String email) {
        driver.findElement(By.cssSelector("#user")).sendKeys(email);
    }

    public void setPassword(String password) {
        driver.findElement(By.cssSelector("#password")).sendKeys(password);
    }

    public void clickLogInWithAtlassian() {
        driver.findElement(By.cssSelector("#login")).click();
    }

    public void clickLogInWithGoogle() {
        driver.findElement(By.cssSelector("#google-link")).click();
    }



    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

}
