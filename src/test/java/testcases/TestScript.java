package testcases;
import driversetup.BaseEnv;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagelocators.*;
import utils.ElementActions;

public class TestScript extends BaseEnv {
    @Test
    public void Automation_Test_Scenario() throws InterruptedException {
        driver.get("https://automationexercise.com/");
        Assert.assertTrue(ElementActions.doDisplayed(LandingPageLocator.automation_exercise_img_logo_locator));
        ElementActions.clickElement(LandingPageLocator.view_product_locator);
        ElementActions.clickElement(ProductPageLocator.add_to_cart_button_locator);
        ElementActions.clickElement(ProductPageLocator.view_cart_button_locator);
        Assert.assertTrue(ElementActions.doDisplayed(CartPageLocator.proceed_to_checkout_button_locator));
        ElementActions.clickElement(CartPageLocator.proceed_to_checkout_button_locator);
        ElementActions.clickElement(CartPageLocator.register_login_button_locator);
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
        ElementActions.clickElement(SignupLoginPageLocator.continue_button_locator);
        ElementActions.clickElement(LandingPageLocator.cart_link_locator);
        ElementActions.clickElement(CartPageLocator.proceed_to_checkout_button_locator);
        ElementActions.clickElement(ProductPageLocator.place_order_button_locator);
        ElementActions.doEnterValue(PaymentPageLocator.name_on_card_text_field_locator,"sumon");
        ElementActions.doEnterValue(PaymentPageLocator.card_number_text_field_locator,"4485233521979909");
        ElementActions.doEnterValue(PaymentPageLocator.cvc_text_field_locator,"748");
        ElementActions.doEnterValue(PaymentPageLocator.month_expiration_text_field_locator,"9");
        ElementActions.doEnterValue(PaymentPageLocator.year_expiration_text_field_locator,"2025");
        ElementActions.clickElement(PaymentPageLocator.pay_and_confirm_order_button_locator);
        Thread.sleep(5000);
    }
}
