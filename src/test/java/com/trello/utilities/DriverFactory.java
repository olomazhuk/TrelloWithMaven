package com.trello.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

    //The method returns the WebDriver object
    public static WebDriver open(String browser) {
        if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "D:\\Private\\Selenium\\geckodriver.exe");
            return new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "D:\\Private\\Selenium\\chromedriver.exe");
            return new ChromeDriver();
        } else {
            System.setProperty("webdriver.ie.driver", "D:\\Private\\Selenium\\IEDriverServer.exe");
            return new InternetExplorerDriver();
        }
    }

}
