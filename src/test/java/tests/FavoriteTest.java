package tests;

import com.testinium.kitapyurdu.driver.BaseTests;
import com.testinium.kitapyurdu.pages.FavoritePage;
import com.testinium.kitapyurdu.pages.LoginPage;
import com.testinium.kitapyurdu.pages.ProductPage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class FavoriteTest extends BaseTests{
    LoginPage loginPage;
    ProductPage productPage;
    FavoritePage favoritePage;
    @Test
    public void favoriteTest(){
        loginPage = new LoginPage();
        productPage = new ProductPage();
        favoritePage=new FavoritePage();
        loginPage.login();
        productPage.selectProduct();
        Assertions.assertEquals("4",favoritePage.myFavoriteNumber(),"Error.");
    }

}
