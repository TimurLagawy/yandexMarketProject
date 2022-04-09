package AlertProject.project.pages;

import Yandex_market.framework.browser.Browser;
import Yandex_market.project.pages.BasePage;
import Yandex_market.project.utils.ConfigFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage extends BasePage {

    private ConfigFileReader config=ConfigFileReader.configFileReader;

    private By jsAlert = By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button");
    public WelcomePage() {
    }
    public void open(){
        browser.goTo(config.getApplicationUrl());

}
public void clickJsAlert(){
}
}