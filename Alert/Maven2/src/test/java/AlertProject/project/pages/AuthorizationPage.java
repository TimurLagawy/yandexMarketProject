package AlertProject.project.pages;

import Yandex_market.project.utils.ConfigFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthorizationPage extends BasePage {
    private ConfigFileReader config = ConfigFileReader.configFileReader;
    private By inputLogin = By.id("passp-field-login");
    private By buttonSignIn = By.id("passp:sign-in");
    private By inputPassword = By.id("passp-field-passwd");
    private By buttonLogin = By.id("passp:sign-in");

    public AuthorizationPage(WebDriver driver) {
        super(driver);
    }

    public void autorizationOnWeb() {
        driver.findElement(inputLogin).sendKeys(config.getLogin());
        driver.findElement(buttonSignIn).click();
        driver.findElement(inputPassword).sendKeys(config.getPassword());
        driver.findElement(buttonLogin).click();
    }

}