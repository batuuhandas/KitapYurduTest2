package com.testinium.kitapyurdu.driver;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import tests.TestLoggerResult;


@ExtendWith(TestLoggerResult.class)
public class BaseTests {
    public static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-plugin");
        chromeOptions.addArguments("--disable-popup-blocking");
        chromeOptions.addArguments("--disable-translate");
        chromeOptions.addArguments("--disable-extensions");
        chromeOptions.setExperimentalOption("w3c", false);


        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.kitapyurdu.com/");

    }

    @AfterClass
    public static void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}

