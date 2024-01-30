package locator;

import org.openqa.selenium.By;

public class ProductPageLocator {
    public static By add_to_cart_button_locator= By.xpath("//button[normalize-space()='Add to cart']");
    public static By view_cart_button_locator=By.xpath("//u[normalize-space()='View Cart']");
    public static By place_order_button_locator=By.xpath("//a[normalize-space()='Place Order']");
    public static By address_details_text_locator=By.xpath("//h2[normalize-space()='Address Details']");
    public static By review_your_order_text_locator=By.xpath("//h2[normalize-space()='Review Your Order']");
    public static By comment_text_field_locator=By.xpath("//textarea[@name='message']");



}
