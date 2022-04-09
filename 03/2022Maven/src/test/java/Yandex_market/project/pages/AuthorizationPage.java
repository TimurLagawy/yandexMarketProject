package Yandex_market.project.pages;

import Yandex_market.framework.browser.Browser;
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

    public AuthorizationPage() { }

    public void autorizationOnWeb() {
        Browser browser= Browser.BROWSER;
        browser.findElement(inputLogin).sendKeys(config.getLogin());
        browser.findElement(buttonSignIn).click();
        browser.findElement(inputPassword).sendKeys(config.getPassword());
        browser.findElement(buttonLogin).click();
    }

}