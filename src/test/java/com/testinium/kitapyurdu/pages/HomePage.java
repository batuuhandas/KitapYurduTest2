package com.testinium.kitapyurdu.pages;

import com.testinium.kitapyurdu.methods.Methods;
import org.openqa.selenium.By;

import javax.sound.sampled.FloatControl;

public class HomePage {
    Methods methods;

    public HomePage() {
        methods = new Methods();
    }
    public void goToHomePage(){
        methods.click(iconLocator);
    }
    public void goToHobbyPage(){
        methods.click(pointCatalogLocator);
        methods.scrollWithAction(turkeyClassics);
        methods.click(turkeyClassics);
        methods.selectByText(selectLocator,"Yüksek Oylama");
        methods.waitBySecond(2);
        methods.dragMouse(allBooks);
        methods.waitBySecond(3);
        methods.click(hobbyButtonLocator);
        methods.selectRandomProduct(methods.randomProductNumber(allProductLocator),allProductLocator );

    }
    By allProductLocator=By.cssSelector("a[class='pr-img-link']");
    By hobbyButtonLocator=By.xpath("//a[text()='Hobi']");
    By allBooks=By.xpath("//span[text()='Tüm Kitaplar']");
    By selectLocator=By.cssSelector("select[onchange='location = this.value;']");
    By turkeyClassics=By.xpath("(//img[@class='landing-button'])[2]");
    By iconLocator=By.cssSelector("div[class='logo-icon']");
    By pointCatalogLocator=By.cssSelector(".lvl1catalog>a");
}
