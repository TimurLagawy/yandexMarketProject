package AlertProject.project.test;

import Yandex_market.framework.browser.Browser;
import Yandex_market.project.utils.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private ConfigFileReader config = ConfigFileReader.configFileReader;
    @BeforeMethod
    public void before(){
        System.setProperty(config.getDriverAdapter(), config. getDriverPath());
        WebDriver driver= Browser.getDriver();
        driver.manage().timeouts().implicitlyWait(5000,
                TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }}