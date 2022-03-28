package com.testinium.kitapyurdu.pages;

import com.testinium.kitapyurdu.methods.Methods;
import org.openqa.selenium.By;

public class FavoritePage {
    Methods methods;

    public FavoritePage() {
        methods = new Methods();
    }

    public String myFavoriteNumber(){
        return methods.find(myFavoriteNumber).getText();
    }



    By myFavoriteNumber=By.cssSelector("span[class='favorite-tag active']>span");
}
