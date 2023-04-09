package shopmamindom.flow;

import org.openqa.selenium.WebDriver;
import shopmamindom.pages.LoginPage;

public class LoginFlow {

    public LoginPage getLoginPage() {
        return loginPage;
    }

    private LoginPage loginPage;

    public LoginFlow(WebDriver driver) {
        this.loginPage = new LoginPage(driver);
    }

    public void login(String email, String password) {
        openLoginForm();
        setInputLoginField(email);
        setInputPasswordField(password);
        clickLogin();
    }

    public void openLoginForm() {
        loginPage.getOpenLoginForm().click();
    }

    public void setInputLoginField(String loginField) {
        loginPage.getInputLoginField().clear();
        loginPage.getInputLoginField().sendKeys(loginField);
    }

    public void setInputPasswordField(String loginField) {
        loginPage.getInputPasswordField().clear();
        loginPage.getInputPasswordField().sendKeys(loginField);
    }

    public void clickLogin() {
        loginPage.getLoginButton().click();
    }

    public String getPasswordErrorText() {
        return loginPage.getPasswordError().getText();
    }

    public String getLoginErrorText() {
        return loginPage.getLoginError().getText();
    }

}
