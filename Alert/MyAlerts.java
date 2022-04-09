package Alert;

public class MyAlerts {
    private Browser browser;

    public MyAlerts() {
        browser = Browser.BROWSER;
    }

    public void accept(){
        browser.getDriver().switchTo().alert().accept();
    }
    public void dismiss() {
        browser.getDriver().switchTo().alert().dismiss();
    }
    public void sendKeys() {
        browser.getDriver().switchTo().alert().sendKeys("");
}
}
