package shop.elements;

import org.openqa.selenium.By;

public class BasketElements {
    public By

    shopTable = By.xpath("//table[contains(@class, 'cart')]"),
    productRemoveButton = By.xpath("//a[@class='remove']"),
    emptyBasketFlash = By.xpath("//p[@class='cart-empty']"),
    returnToShopButton = By.xpath("//p[@class='return-to-shop']//a"),
    couponCodeField = By.id("coupon_code"),
    applyCouponButton = By.xpath("//input[@class='button' and @name='apply_coupon']"),
    couponApplyFlash = By.xpath("//div[contains(text(), 'Coupon code applied successfully.')]"),
    removeCouponLink = By.xpath("//a[contains(@class, 'woocommerce-remove-coupon')]"),
            removeCouponFlash = By.xpath("//div[contains(text(), 'Coupon has been removed.')]"),
    checkoutButton = By.xpath("//div[contains(@class, 'wc-proceed-to-checkout')]//a");
}
