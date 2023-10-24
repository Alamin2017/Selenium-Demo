package driversetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
public class BaseEnv {
    public static WebDriver driver;
    public static String browser="firefox";
    @BeforeMethod
    public void setup() {
        switch (browser)
        {
            case "chrome":
                driver=new ChromeDriver();
                break;
            case "edge":
                driver=new EdgeDriver();
                break;
            case "firefox":
                driver=new FirefoxDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    @AfterMethod
    public void teardown() {
        driver.close();
    }
}
