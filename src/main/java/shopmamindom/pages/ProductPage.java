package shopmamindom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends AbstractPage {

    private String productPageUrl = "https://shop.mamindom.ua/mamin-dom/";

    private static final By CHOOSE_PRODUCT = By.xpath("//div[@class='product-container-wrap']//div[@class='mini-product '][1]");
    private static final By ADD_TO_CART = By.xpath("//button[@id='button-cart']");
    private static final By BUY_IN_ONE_CLICK = By.xpath("//button[@id='button-onClick']");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getChooseProduct() {
        return driver.findElement(CHOOSE_PRODUCT);
    }

    public WebElement getAddToCart() {
        return driver.findElement(ADD_TO_CART);
    }

    public WebElement getBuyInOneClick() {
        return driver.findElement(BUY_IN_ONE_CLICK);
    }

    public String getProductPageUrl() {
        return productPageUrl;
    }

}
