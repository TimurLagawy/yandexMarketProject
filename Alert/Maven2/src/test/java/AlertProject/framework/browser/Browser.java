package AlertProject.framework.browser;

import Yandex_market.project.utils.ConfigFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    /*
    private static WebDriver DRIVER;


    public static WebDriver getDRIVER() {
        if (DRIVER == null){
            DRIVER = new ChromeDriver();
    }

    return DRIVER;
}

    public static WebDriver getDriver() {
        return null;*/
    private static WebDriver driver;
    private static ConfigFileReader config = ConfigFileReader.configFileReader;
    public static Browser BROWSER = new Browser();
    private By signIn;

    private Browser() {
        this.driver = BrowserFactory.getDriver(config.getBrowserName());
    }

    public void goTo(String url){
    driver.get(url);
}

    public static WebDriver getDriver() {
        return driver;

    }

    public WebElement findElement(By locator) {
        WebElement element = driver.findElement(locator);
        return element;
    }

    public List<WebElement> findElements(By locator){

    return driver.findElements(locator);

}}

