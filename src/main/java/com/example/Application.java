package com.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\github\\chrome\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://donerking.by/");
        Thread.sleep(5000);
        driver.findElementByXPath("//body/div[@class='wrapper-footer-down']/div[@class='main-footer-down']/header[@id='mainheader']/div[@class='top-header']/div[@class='container']/div[@class='top-header__menu-container col-xxs-12 col-xs-12 col-sm-12 col-md-6 col-lg-6']/div[@class='top-header__menu hiddable__menu']/div[@class='hassubmenu']/a[1]").click();

    }
}
