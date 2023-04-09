package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import shopmamindom.pages.AbstractPage;

import static utils.Waiters.waitUntilElementIsVisible;

public class PopUpAddedToCart extends AbstractPage {

    private PopUpAddedToCart popUpAddedToCart;

    private static final By ADDED_TO_CART = By.xpath("//div[@id='smca-modal-body']//div[@class='module-title']");

    public PopUpAddedToCart(WebDriver driver) {
        super(driver);
    }

    public WebElement getAddedToCart() {
        return waitUntilElementIsVisible(driver, ADDED_TO_CART);
    }

    public String getAddedToCartText() {
        return getAddedToCart().getText();
    }

}
