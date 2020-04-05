package com.example.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MenuPage {
    private final WebDriver webDriver;
    @FindBy(xpath = "//body/div[@class='wrapper-footer-down']/div[@class='main-footer-down']/header[@id='mainheader']/div[@class='top-header']/div[@class='container']/div[@class='top-header__menu-container col-xxs-12 col-xs-12 col-sm-12 col-md-6 col-lg-6']/div[@class='top-header__menu hiddable__menu']/div[@class='hassubmenu']/a[1]")
    private WebElement menu;

    public MenuPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    public void clickMenu() {
        this.menu.click();
    }
}
