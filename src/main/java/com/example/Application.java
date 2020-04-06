package com.example;

import com.example.pages.HomePage;
import com.example.pages.MenuPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application {
    private static final String KEY_PROPERTY = "webdriver.chrome.driver";
    private static final String VALUE_PROPERTY = "chromedriver.exe";
    private static final String HOME_URL = "https://donerking.by/";

    public static void main(String[] args) {
        System.setProperty(KEY_PROPERTY, VALUE_PROPERTY);
        WebDriver driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        MenuPage menuPage = new MenuPage(driver);
        homePage.openHomePage(HOME_URL);
        menuPage.clickMenu();
    }
}