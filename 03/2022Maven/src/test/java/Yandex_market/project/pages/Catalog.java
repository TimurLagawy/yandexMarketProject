package Yandex_market.project.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Catalog extends BasePage{
    private By catalog;
    public Catalog(WebDriver driver) {
        super(driver);
        driver.findElement(By.id("catalogPopupButton")).click();
    }

    public void countSection(){
        int count=browser.findElements(By.id("catalogPopup")).size();
        System.out.println(count);

    }public void countSections(WebDriver driver){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("catalogPopup")));
        browser.findElement(By.cssSelector("//*[@id=\"catalogPopupButton\"]"));
    }
    }
