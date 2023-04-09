package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import shopmamindom.pages.AbstractPage;

import static utils.Waiters.waitUntilElementIsVisible;

public class PopUpBuyInOneClick extends AbstractPage {

    private static final By BOUGHT_IN_ONE_CLICK = By.xpath("//h1[@class='popup-heading']");

    public PopUpBuyInOneClick(WebDriver driver) {
        super(driver);
    }

    public WebElement getBoughtInOneClick() {
        return waitUntilElementIsVisible (driver, BOUGHT_IN_ONE_CLICK);
    }

    public String getBoughtInOneClickText() {
        return getBoughtInOneClick().getText();
    }
}
