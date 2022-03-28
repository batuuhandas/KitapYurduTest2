package com.testinium.kitapyurdu.methods;

import com.testinium.kitapyurdu.driver.BaseTests;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Methods {
    WebDriver driver;
    JavascriptExecutor jsdriver;
    Logger logger = LogManager.getLogger(Methods.class);
    FluentWait<WebDriver> wait;
    WebDriverWait webDriverWait;
    Random random;

    public Methods() {
        driver = BaseTests.driver;
        wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(NoSuchElementException.class);
        jsdriver = (JavascriptExecutor) driver;
    }

    public boolean isDisplayed(By locator) {
        return find(locator).isDisplayed();
    }

    public WebElement findElement(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void click(By locator) {
        findElement(locator).click();
    }

    public void waitBySecond(long seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void acceptPopups(By locator) {
        if (isElementVisible(locator)) {
            click(locator);
        }
    }


    public void sendKeys(By locator, String text) {

        findElement(locator).sendKeys(text);
    }

    public boolean isElementVisible(By locator) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            logger.info("True");
            return true;
        } catch (Exception e) {
            logger.info("False" + e.getMessage());
            return false;
        }

    }


    public void scrollWithAction(By locator) {
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(locator)).build().perform();
    }

    public void dragMouse(By locator) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(locator)).build().perform();

    }

    public WebElement find(By locator) {
        return driver.findElement(locator);
    }

    public Select getSelect(By locator) {
        return new Select(findElement(locator));
    }

    public void selectByText(By locator, String text) {
        getSelect(locator).selectByVisibleText(text);
    }


    public String getAttriubte(By locator, String attributeName) {
        return findElement(locator).getAttribute(attributeName);
    }

    public void printAttriubte(By locator, String attributeName) {
        System.out.println(getAttriubte(locator, attributeName));
    }


    public List<WebElement> findAll(By locator) {
        return driver.findElements(locator);
    }

    public void addFavFourProduct(String locator) {
        for (int i = 5; i < 9; i++) {
            click(By.xpath(locator + "[" + i + "]"));
        }
    }

    public void selectRandomProduct(int randomProductNumber, By locator) {
        waitBySecond(2);
        getAllProducts(locator).get(randomProductNumber).click();
    }

    public int randomProductNumber(By locator) {
        random = new Random();
        return random.nextInt(getAllProducts(locator).size() + 1);
    }

    private List<WebElement> getAllProducts(By locator) {
        return findAll(locator);
    }


}
