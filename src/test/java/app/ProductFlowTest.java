package app;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import shopmamindom.driver.cash.WebDriverCash;
import shopmamindom.flow.ProductFlow;
import utils.PopUpAddedToCart;
import utils.PopUpBuyInOneClick;

public class ProductFlowTest {

    private static WebDriver driver = WebDriverCash.getDriver("chrome");
    private static ProductFlow productPage = new ProductFlow(driver);
    private static PopUpAddedToCart popUpAddedToCart = new PopUpAddedToCart(driver);
    private static PopUpBuyInOneClick popUpBuyInOneClick = new PopUpBuyInOneClick(driver);

    @BeforeAll
    public static void init() {
        System.out.println("Init");
        driver.manage().window().maximize();
    }

    @BeforeEach
    public void log() {
        System.out.println("Test start");
    }

    @Test
    @DisplayName("Add Item To Cart Test")
    public void AddItemToCart() {
        System.out.println("Add Item To Cart Test");
        driver.get(productPage.getProductPage().getProductPageUrl());
        productPage.addItemToCart();
        Assertions.assertEquals(popUpAddedToCart.getAddedToCartText(), "Товар добавлен в корзину!");
    }

    @Test
    @DisplayName("Buy Item In One Click Test")
    public void BuyItemInOneClick() {
        System.out.println("Add Item To Cart Test");
        driver.get(productPage.getProductPage().getProductPageUrl());
        productPage.buyItemInOneClick();
        Assertions.assertEquals(popUpBuyInOneClick.getBoughtInOneClickText(), "Купить в 1 клик");
    }

    @AfterEach
    public void logAfter() {
        System.out.println("Test finish");
        driver.manage().deleteAllCookies();
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("Done");
        driver.quit();
    }

}
