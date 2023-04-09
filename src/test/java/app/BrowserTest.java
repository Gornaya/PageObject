package app;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import shopmamindom.driver.cash.WebDriverCash;
import shopmamindom.flow.LoginFlow;
import shopmamindom.flow.ProductFlow;
import utils.PopUpAddedToCart;
import utils.PopUpBuyInOneClick;


public class BrowserTest {

    private static WebDriver driver = WebDriverCash.getDriver("chrome");

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
    @DisplayName("Website loading in chrome Test")
    public void getDriverChrome() {
        System.out.println("Website loading in chrome Test");
        WebDriverCash.getDriver("chrome").get("https://shop.mamindom.ua/");
    }

    @Test
    @DisplayName("Website loading in edge Test")
    public void getDriverEdge() {
        System.out.println("Website loading in edge Test");
        WebDriverCash.getDriver("edge").get("https://shop.mamindom.ua/");
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
