package testcases;
import driversetup.BaseEnv;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagelocators.*;
import utils.ElementActions;
public class TestScript extends BaseEnv {
    @Test
    public void Automation_Test_Scenario() throws InterruptedException {
        //Navigate to url http://automationexercise.com
        driver.get("https://automationexercise.com/");
        //Verify that home page is visible successfully
        Assert.assertTrue(ElementActions.doDisplayed(LandingPageLocator.automation_exercise_img_logo_locator));
        //Add products to cart
        ElementActions.clickElement(LandingPageLocator.view_product_locator);
        //Click 'Cart' button and Verify that cart page is displayed
        ElementActions.clickElement(ProductPageLocator.add_to_cart_button_locator);
        ElementActions.clickElement(ProductPageLocator.view_cart_button_locator);
        //Click Proceed To Checkout
        ElementActions.clickElement(CartPageLocator.proceed_to_checkout_button_locator);
        //Click 'Register / Login' button
        ElementActions.clickElement(CartPageLocator.register_login_button_locator);
        //Fill all details in Sign up and create account
        ElementActions.doEnterValue(SignupLoginPageLocator.signup_name_text_field_locator,"tania");
        ElementActions.doEnterValue(SignupLoginPageLocator.signup_email_text_field_locator,ElementActions.dynamic_email_value());
        ElementActions.clickElement(SignupLoginPageLocator.sign_up_button_locator);
        ElementActions.clickElement(SignupLoginPageLocator.mr_checkbox_locator);
        ElementActions.doEnterValue(SignupLoginPageLocator.password_text_box_locator,"1234");
        ElementActions.clickElement(SignupLoginPageLocator.newsletter_check_box_locator);
        ElementActions.clickElement(SignupLoginPageLocator.special_offer_checkbox_locator);
        ElementActions.doDropdownValue(SignupLoginPageLocator.days_dropdown_locator,"12");
        ElementActions.doDropdownValue(SignupLoginPageLocator.months_dropdown_locator,"6");
        ElementActions.doDropdownValue(SignupLoginPageLocator.years_dropdown_locator,"2019");
        ElementActions.doEnterValue(SignupLoginPageLocator.first_name_field_locator,"sumon");
        ElementActions.doEnterValue(SignupLoginPageLocator.last_name_field_locator,"ahmed");
        ElementActions.doEnterValue(SignupLoginPageLocator.address1_locator,"Zaman House");
        ElementActions.doEnterValue(SignupLoginPageLocator.state_locator,"Dhaka");
        ElementActions.doEnterValue(SignupLoginPageLocator.city_locator,"Khilkhet");
        ElementActions.doEnterValue(SignupLoginPageLocator.zipcode_locator,"1229");
        ElementActions.doEnterValue(SignupLoginPageLocator.mobile_number_locator,"01723456721");
        ElementActions.clickElement(SignupLoginPageLocator.create_account_button_locator);
        //Verify 'ACCOUNT CREATED!' and click 'Continue' button
        Assert.assertEquals("ACCOUNT CREATED!",ElementActions.getText(SignupLoginPageLocator.account_created_text_locator));
        ElementActions.clickElement(SignupLoginPageLocator.continue_button_locator);
        //Verify ' Logged in as username' at top
        System.out.println(ElementActions.getText(LandingPageLocator.logged_in_as_locator));
        Assert.assertEquals("Logged in as tania",ElementActions.getText(LandingPageLocator.logged_in_as_locator));
        //Click 'Cart' button
        ElementActions.clickElement(LandingPageLocator.cart_link_locator);
        //Click 'Proceed To Checkout' button
        ElementActions.clickElement(CartPageLocator.proceed_to_checkout_button_locator);
        //Verify Address Details and Review Your Order
        Assert.assertEquals("Address Details",ElementActions.getText(ProductPageLocator.address_details_text_locator));
        Assert.assertEquals("Review Your Order",ElementActions.getText(ProductPageLocator.review_your_order_text_locator));
        //Enter description in comment text area and click 'Place Order'
        ElementActions.doEnterValue(ProductPageLocator.comment_text_field_locator,"Already order some products");
        ElementActions.clickElement(ProductPageLocator.place_order_button_locator);
        //Enter payment details: Name on Card, Card Number, CVC, Expiration date
        ElementActions.doEnterValue(PaymentPageLocator.name_on_card_text_field_locator,"sumon");
        ElementActions.doEnterValue(PaymentPageLocator.card_number_text_field_locator,"4485233521979909");
        ElementActions.doEnterValue(PaymentPageLocator.cvc_text_field_locator,"748");
        ElementActions.doEnterValue(PaymentPageLocator.month_expiration_text_field_locator,"9");
        ElementActions.doEnterValue(PaymentPageLocator.year_expiration_text_field_locator,"2025");
        //Click 'Pay and Confirm Order' button
        ElementActions.clickElement(PaymentPageLocator.pay_and_confirm_order_button_locator);
        //Verify the success message 'Your order has been placed successfully!'
        Assert.assertEquals("Congratulations! Your order has been confirmed!",ElementActions.getText(PaymentPageLocator.success_message_locator));
    }
}
