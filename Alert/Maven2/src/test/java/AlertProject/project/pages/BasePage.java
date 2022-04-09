package AlertProject.project.pages;

import Yandex_market.framework.browser.Browser;
import Yandex_market.project.utils.ConfigFileReader;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public abstract class BasePage {
    protected Browser browser;
    public BasePage() {
        this.driver= Driver.driver;
        this.browser = Browser.BROWSER;
    }
}
