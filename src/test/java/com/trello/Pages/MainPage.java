package com.trello.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    WebDriver driver;

    public void clickLogInButton() {
        driver.findElement(By.cssSelector("a.btn.btn-sm.btn-link.text-white")).click();
    }

    public void clickSignUpButton() {
        driver.findElement(By.cssSelector("a.btn.btn-sm.bg-white.font-weight-bold")).click();
    }

    public  void setEmailForQuickSignUp(String email) {
        driver.findElement(By.cssSelector("#hero input")).sendKeys(email);
    }

    public void submitQuickSignUp() {
        driver.findElement(By.cssSelector("#hero button")).click();
    }

    public MainPage (WebDriver driver) {
        this.driver = driver;
    }

}
