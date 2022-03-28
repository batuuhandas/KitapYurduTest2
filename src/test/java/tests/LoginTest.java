package tests;

import com.testinium.kitapyurdu.driver.BaseTests;
import com.testinium.kitapyurdu.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTests {
    LoginPage loginPage;

    @Test
    public void loginTest(){
        loginPage = new LoginPage();
        loginPage.login();
        Assertions.assertTrue(loginPage.isDisplayedMyAccountText(),"Error");
    }


}
