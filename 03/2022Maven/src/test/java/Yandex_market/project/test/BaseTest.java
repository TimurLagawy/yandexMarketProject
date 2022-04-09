package Yandex_market.project.test;
import Yandex_market.framework.browser.Browser;
import Yandex_market.project.utils.ConfigFileReader;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    private ConfigFileReader config = ConfigFileReader.configFileReader;
    @BeforeTest
    public void before(){
        System.setProperty(config.getDriverAdapter(), config.getDriverPath());
        Browser.BROWSER.getDrver().manage().window().maximize();

    }}