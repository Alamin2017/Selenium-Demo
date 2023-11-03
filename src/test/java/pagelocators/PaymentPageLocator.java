package pagelocators;

import org.openqa.selenium.By;

public class PaymentPageLocator {

    public static By name_on_card_text_field_locator=By.xpath("//input[@name='name_on_card']");
    public static By card_number_text_field_locator=By.xpath("//input[@name='card_number']");
    public static By cvc_text_field_locator=By.xpath("//input[@placeholder='ex. 311']");
    public static By month_expiration_text_field_locator=By.xpath("//input[@placeholder='MM']");
    public static By year_expiration_text_field_locator=By.xpath("//input[@placeholder='YYYY']");
    public static By pay_and_confirm_order_button_locator=By.xpath("//button[@id='submit']");
}
