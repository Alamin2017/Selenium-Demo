package utils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import static driversetup.BaseEnv.driver;
public class ElementActions  {
    public static WebElement getElement(By locator) {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return driver.findElement(locator);
    }
    public static List<WebElement> getElements(By locator) {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return driver.findElements(locator);
    }
    public static void clickElement(By locator) throws InterruptedException {
        Thread.sleep(1000);
        getElement(locator).click();
    }
    public static String getText(By locator) throws InterruptedException {
        Thread.sleep(1000);
        return getElement(locator).getText();
    }
    public static boolean doDisplayed(By locator) throws InterruptedException {
        Thread.sleep(1000);
        return getElement(locator).isDisplayed();
    }
    public static void doEnterValue(By locator, String value) throws InterruptedException {
        getElement(locator).clear();
        getElement(locator).sendKeys(value);
    }
    public static void doDropdownValue(By locator, String value) throws InterruptedException {
        Select se = new Select(getElement(locator));
        se.selectByValue(value);
    }
    public static String dynamic_email_value(){

        return "tania"+Math.random()+"@gmail.com";
    }
}
