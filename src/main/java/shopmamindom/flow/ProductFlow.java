package shopmamindom.flow;

import org.openqa.selenium.WebDriver;
import shopmamindom.pages.ProductPage;

public class ProductFlow {

    public ProductPage getProductPage() {
        return productPage;
    }

    private ProductPage productPage;

    public ProductFlow(WebDriver driver) {
        this.productPage = new ProductPage(driver);
    }

    public void addItemToCart() {
        chooseProduct();
        addToCart();
    }

    public void buyItemInOneClick() {
        chooseProduct();
        buyInOneClick();
    }

    public void chooseProduct() {
        productPage.getChooseProduct().click();
    }

    public void addToCart() {
        productPage.getAddToCart().click();
    }

    public void buyInOneClick() {
        productPage.getBuyInOneClick().click();
    }

}
