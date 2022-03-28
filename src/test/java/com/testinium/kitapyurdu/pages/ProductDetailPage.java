package com.testinium.kitapyurdu.pages;

import com.testinium.kitapyurdu.methods.Methods;
import org.openqa.selenium.By;

public class ProductDetailPage {
    Methods methods;

    public ProductDetailPage() {
        methods = new Methods();
    }

    public String getCartNumber() {
        methods.waitBySecond(2);
        return methods.findElement(cartNumberLocator).getText();
    }

    public void addToCart() {
        methods.click(addCartButton);
    }

    public void goToFavorites() {
        methods.waitBySecond(2);
        methods.dragMouse(listButtonLocator);
        methods.waitBySecond(2);
        methods.click(myFavsLocator);


    }

    public void deleteTrirdFavProduct() {
        methods.click(deleteThirdFavoriteProductLocator);
    }

    By deleteThirdFavoriteProductLocator = By.cssSelector("(//i[@class='fa fa-heart-o'])[3]");
    By listButtonLocator = By.cssSelector("div[class='menu top my-list']");
    By myFavsLocator = By.xpath("//a[text()='Favorilerim']");
    By addCartButton = By.cssSelector("a[class='add-to-cart btn-orange btn-ripple']");

    By cartNumberLocator = By.xpath("(//span[@class='fl'])[2]");
}
