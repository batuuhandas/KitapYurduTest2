package tests;

import com.testinium.kitapyurdu.driver.BaseTests;
import com.testinium.kitapyurdu.pages.HomePage;
import com.testinium.kitapyurdu.pages.LoginPage;
import com.testinium.kitapyurdu.pages.ProductPage;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ProductTest extends BaseTests{
    LoginPage loginPage;
    ProductPage productPage;
    HomePage homePage;
    @Test
    public void productTest(){
        loginPage = new LoginPage();
        productPage = new ProductPage();
        homePage =new HomePage();
        loginPage.login();
        productPage.selectProduct();
    }


}
