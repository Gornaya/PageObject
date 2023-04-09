package app;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import shopmamindom.driver.cash.WebDriverCash;
import shopmamindom.flow.LoginFlow;


public class LoginFlowTest {

    private static WebDriver driver = WebDriverCash.getDriver("chrome");
    private static LoginFlow loginPage = new LoginFlow(driver);

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
    @DisplayName("Password Error Text Test")
    public void passwordErrorText() {
        System.out.println("Password Error Text Test");
        driver.get(loginPage.getLoginPage().getUrl());
        loginPage.login("Login@gmail.com", "WrongPassword");
        Assertions.assertEquals(loginPage.getPasswordErrorText(), "Неправильно заполнены поля E-Mail и/или пароль!");
    }

    @Test
    @DisplayName("Login Error Text Test")
    public void loginErrorText() {
        System.out.println("Login Error Text Test");
        driver.get(loginPage.getLoginPage().getUrl());
        driver.manage().window().maximize();
        loginPage.login("Login", "Password");
        Assertions.assertEquals(loginPage.getLoginErrorText(), "Неверный email");
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
