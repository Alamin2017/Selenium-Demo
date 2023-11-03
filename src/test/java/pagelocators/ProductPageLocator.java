package pagelocators;

import org.openqa.selenium.By;

public class ProductPageLocator {
    public static By add_to_cart_button_locator= By.xpath("//button[normalize-space()='Add to cart']");
    public static By view_cart_button_locator=By.xpath("//u[normalize-space()='View Cart']");
    public static By place_order_button_locator=By.xpath("//a[normalize-space()='Place Order']");

}
