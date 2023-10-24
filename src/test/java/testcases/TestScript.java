package testcases;
import driversetup.BaseEnv;
import org.testng.annotations.Test;
import pageobjects.Locator;
import utils.ElementActions;

public class TestScript extends BaseEnv {

    @Test
    public void LoginTest() throws InterruptedException {
        driver.get("https://www.grameenphone.com/");
        ElementActions.clickElement(Locator.recharge_link_locator);

    }


}
