package tests;

import com.testinium.kitapyurdu.driver.BaseTests;
import com.testinium.kitapyurdu.pages.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ProductDetailTest extends BaseTests {

    LoginPage loginPage;
    ProductPage productPage;
    FavoritePage favoritePage;
    HomePage homePage;
    ProductDetailPage productDetailPage;
    @Test
    public void favoriteTest(){
        loginPage = new LoginPage();
        productPage = new ProductPage();
        favoritePage=new FavoritePage();
        homePage=new HomePage();
        productDetailPage=new ProductDetailPage();
        loginPage.login();
        productPage.selectProduct();
        homePage.goToHomePage();
        homePage.goToHobbyPage();
        productDetailPage.addToCart();
        productDetailPage.getCartNumber();
        Assertions.assertEquals("1",productDetailPage.getCartNumber(),"Error.");
        productDetailPage.goToFavorites();
        productDetailPage.deleteTrirdFavProduct();


    }

}