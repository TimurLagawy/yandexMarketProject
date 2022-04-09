package Yandex_market.project.pages;

import Yandex_market.framework.browser.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    protected Browser browser;
    protected WebDriverWait wait;
    public BasePage(WebDriver driver) {

        this.browser = Browser.BROWSER;
        this.wait = new WebDriverWait(browser.getDriver(), Duration.ofSeconds(10));
    }

    protected BasePage() {
    }
}
