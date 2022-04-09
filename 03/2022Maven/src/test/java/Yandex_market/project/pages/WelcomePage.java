package Yandex_market.project.pages;

import Yandex_market.framework.browser.Browser;
import Yandex_market.project.utils.ConfigFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WelcomePage extends BasePage {
    /*private By sigIn = By.xpath("/html/body/div[1]/div[3]/noindex/div/div/div[2]/div[3]/div[1]/div[6]/div/div/div[1]/a/span");
    private WebDriver driver;



    public WelcomePage(WebDriver driver) {
        this.driver = driver;
    }
public void clickSignIn(){
    driver.findElement(sigIn).click();
         */
    private Browser browser=Browser.BROWSER;
    private ConfigFileReader config=ConfigFileReader.configFileReader;
    private By sigIn = By.xpath("/html/body/div[1]/div[3]/noindex/div/div/div[2]/div[3]/div[1]/div[6]/div/div/div[1]/a/span");
    public WelcomePage() {
        super(driver);
    }
    public void open(){
        browser.goTo(config.getApplicationUrl());

}
public void clickSignIn(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(sigIn));
        browser.findElement(sigIn).click();
}
}