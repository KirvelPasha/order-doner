package com.example.pages;


import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver webDriver;

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void openHomePage(String homePageUrl) {
        this.webDriver.get(homePageUrl);
    }
}
