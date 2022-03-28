package tests;

import com.testinium.kitapyurdu.driver.BaseTests;
import com.testinium.kitapyurdu.pages.FavoritePage;
import com.testinium.kitapyurdu.pages.HomePage;
import com.testinium.kitapyurdu.pages.LoginPage;
import com.testinium.kitapyurdu.pages.ProductPage;
import org.junit.Test;

public class HomePageTest extends BaseTests {
    LoginPage loginPage;
    ProductPage productPage;
    FavoritePage favoritePage;
    HomePage homePage;
    @Test
    public void favoriteTest(){
        loginPage = new LoginPage();
        productPage = new ProductPage();
        favoritePage=new FavoritePage();
        homePage=new HomePage();
        loginPage.login();
        productPage.selectProduct();
        homePage.goToHomePage();
        homePage.goToHobbyPage();

    }

}
