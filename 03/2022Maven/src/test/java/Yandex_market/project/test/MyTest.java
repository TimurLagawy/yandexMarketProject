package Yandex_market.project.test;
import Yandex_market.project.pages.AuthorizationPage;
import Yandex_market.project.pages.WelcomePage;
import org.testng.annotations.Test;
public class MyTest extends BaseTest {
    @Test
    public void firstTest() {
/*        WebDriver driver= Browser.getDriver();
        driver.get("https://market.yandex.ru/");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);*/

        WelcomePage welcomePage = new WelcomePage();
        welcomePage.open();
        welcomePage.clickSignIn();

       AuthorizationPage authorizationPage = new AuthorizationPage();
        authorizationPage.autorizationOnWeb();

    }
}