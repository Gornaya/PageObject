package shopmamindom.driver.cash;

import org.openqa.selenium.WebDriver;
import shopmamindom.driver.WebDriverUtils;

import java.util.HashMap;
import java.util.Objects;

public class WebDriverCash {

    private static HashMap<String, WebDriver> drivers = new HashMap<>();

    private WebDriverCash() {
    }

    public static WebDriver getDriver(String driverName) {
        if (Objects.nonNull(drivers.get(driverName))) {
            return drivers.get(driverName);
        } else {
            System.setProperty("webdriver.http.factory", "jdk-http-client");
            WebDriver driver = WebDriverUtils.getDriver(driverName);
            drivers.put(driverName, driver);
            return driver;
        }
    }
}
