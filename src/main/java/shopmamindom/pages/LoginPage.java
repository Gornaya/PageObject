package shopmamindom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static utils.Waiters.waitOfElementIsVisible;
import static utils.Waiters.waitUntilElementIsVisible;

public class LoginPage extends AbstractPage {

    private String url = "https://shop.mamindom.ua/";

    private static final By OPEN_LOGIN_FORM = By.xpath("//div[@class='top-item-container']//div[@class='top-item account-item user-actions__auth']//span[@class='account-link-inner']");
    private static final By INPUT_LOGIN_FIELD = By.xpath("//div[@id='auth-modal']//input[@type='email']");
    private static final By INPUT_PASSWORD_FIELD = By.xpath("//div[@id='auth-modal']//input[@type='password']");
    private static final By LOGIN_BUTTON = By.xpath("//div[@id='auth-modal']//input[@type='submit']");
    private static final By PASSWORD_ERROR = By.xpath("//div[@id='auth-modal']//div[@class='auth-popup__callback auth-popup__callback-error']");
    private static final By LOGIN_ERROR = By.xpath("//div[@id='auth-modal']//li[@class='parsley-custom-error-message']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getInputLoginField() {
        return driver.findElement(INPUT_LOGIN_FIELD);
    }

    public WebElement getInputPasswordField() {
        return driver.findElement(INPUT_PASSWORD_FIELD);
    }

    public WebElement getLoginButton() {
        return driver.findElement(LOGIN_BUTTON);
    }

    public WebElement getPasswordError() {
        return waitOfElementIsVisible(driver, PASSWORD_ERROR);
    }

    public WebElement getLoginError() {
        return driver.findElement(LOGIN_ERROR);
    }

    public WebElement getOpenLoginForm() {
        return driver.findElement(OPEN_LOGIN_FORM);
    }

    public String getUrl() {
        return url;
    }
}
