package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waiters {

    private static final int TIME_OUT = 10;

    private Waiters() {
    }

    public static WebElement waitOfElementIsVisible(WebDriver driver, By locator) {
        return new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT))
                .until(ExpectedConditions.visibilityOf(driver.findElement(locator)));
    }

    public static WebElement waitUntilElementIsVisible(WebDriver driver, By locator) {
        return new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT))
                .until(ExpectedConditions.presenceOfElementLocated(locator));
    }

}

