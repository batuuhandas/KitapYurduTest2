package com.testinium.kitapyurdu.pages;

import com.testinium.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class ProductPage {
    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage() {
        methods = new Methods();
    }

    public void selectProduct() {
        methods.sendKeys((searchBoxLocator), "oyuncak");
        methods.click(searchButtonLocator);
        methods.waitBySecond(2);
        methods.scrollWithAction(scrollProductLocator);
        //methods.waitBySecond(4);
        methods.addFavFourProduct(favProductLocator);
        methods.waitBySecond(2);
        methods.scrollWithAction(searchButtonLocator);
        methods.waitBySecond(2);
        methods.dragMouse(listButtonLocator);
        methods.waitBySecond(2);
        methods.click(myFavsLocator);
        methods.waitBySecond(2);


    }


    By listButtonLocator = By.cssSelector("div[class='menu top my-list']");
    By myFavsLocator = By.xpath("//a[text()='Favorilerim']");
    By searchBoxLocator = By.cssSelector("input[id='search-input']");
    By searchButtonLocator = By.cssSelector("span[class='common-sprite button-search']");
    By scrollProductLocator = By.xpath("(//a[@class='pr-img-link'])[7]");
    String favProductLocator = "(//i[@class='fa fa-heart'])";


}
