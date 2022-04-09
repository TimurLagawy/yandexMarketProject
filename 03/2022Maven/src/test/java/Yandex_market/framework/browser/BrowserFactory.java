package Yandex_market.framework.browser;

import Yandex_market.project.utils.ConfigFileReader;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    public static ConfigFileReader config=ConfigFileReader.configFileReader;

    public static WebDriver getDriver(String nameBrowser) {
        System.setProperty(config.getDriverAdapter(), config.getDriverPath());
        WebDriver driver;

                if (nameBrowser.equalsIgnoreCase("CHROME")){
                driver = new ChromeDriver();
            } else if(nameBrowser.equalsIgnoreCase("FIREFOX")){
                    driver= new FirefoxDriver();

        }else{
        throw new RuntimeException("invalid driverName");
    }
                return driver;
    }}