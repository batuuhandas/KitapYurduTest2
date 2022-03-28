package com.testinium.kitapyurdu.pages;

import com.testinium.kitapyurdu.methods.Methods;

import org.openqa.selenium.By;

public class LoginPage {

    Methods methods;

    public LoginPage() {
        methods = new Methods();
    }

    public void login() {
        methods.waitBySecond(2);
        methods.click(homePageLoginButtonLocator);
        methods.acceptPopups(popupsLocator);
        methods.waitBySecond(2);
        methods.sendKeys((emailLocator), "batuuhandas@gmail.com");
        methods.waitBySecond(2);
        methods.sendKeys((passwordLocator), "Test1234");
        methods.waitBySecond(2);
        methods.click(loginButtonLocator);
        methods.waitBySecond(5);
    }
    public boolean isDisplayedMyAccountText() {
        return methods.isDisplayed(myAccountTextLocator);
    }





    //Locators
    By homePageLoginButtonLocator = By.cssSelector(".menu-top-button.login>a");
    By popupsLocator = By.cssSelector("path[style='fill: #ffffff;']");
    By emailLocator = By.id("login-email");
    By passwordLocator = By.id("login-password");
    By loginButtonLocator=By.cssSelector("button[role='button']");
    By myAccountTextLocator=By.cssSelector("h1[class='section']");

}
