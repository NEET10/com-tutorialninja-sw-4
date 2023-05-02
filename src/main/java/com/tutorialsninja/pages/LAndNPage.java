package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LAndNPage extends Utility {
    //1.1 Mouse hover on Laptops & Notebooks Tab.and click-->from Homepage
    //1.2 Click on “Show All Laptops & Notebooks”-->from Homepage
    //1.3 Select Sort By "Price (High > Low)"
    By selectPrizeHighToLow = By.xpath("//select[@id='input-sort']");

    public void selectSortByPriceHighToLow() {
        selectByVisibleTextFromDropDown(selectPrizeHighToLow, "Price (High > Low)");
    }

    //==============================================================
    //1.4 Verify the Product price will arrange in High to Low order.
    //==============================================================
//2.1 Mouse hover on Laptops & Notebooks Tab and click-->from Homepage
//2.2 Click on “Show All Laptops & Notebooks”-->from Homepage
//2.3 Select Sort By "Price (High > Low)"---> done in above method
//2.4 Select Product “MacBook”
    By macBook = By.linkText("MacBook");

    public void selectMacBook() {
        clickOnElement(macBook);
    }

    //2.5 Verify the text “MacBook”
    By verifyMacBook = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/h1[1]");

    public void verifyTextMacBook() {
        verifyExpectedAndActual(verifyMacBook, "MacBook");
    }

    //2.6 Click on ‘Add To Cart’ button
    By clickOnAddToCart = By.xpath("//button[@id='button-cart']");

    public void clickOnAddToCartButton() {
        clickOnElement(clickOnAddToCart);
    }

    //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
    By verifyMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");

    public void verifyTheMessageStartWithSuccess() {
        verifyExpectedAndActual(verifyMessage, "Success: You have added MacBook to your shopping cart!\n" +
                "×");
    }

    //2.8 Click on link “shopping cart” display into success message
    By shoppingCartLink = By.linkText("shopping cart");

    public void clickOnShoppingCartLink() {
        clickOnElement(shoppingCartLink);
    }

    //2.9 Verify the text "Shopping Cart"
    By verifyShoppingCart = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/h1[1]");

    public void verifyTextShoppingCart() {
        verifyExpectedAndActual(verifyShoppingCart, "Shopping Cart  (0.00kg)");
    }

    //2.10 Verify the Product name "MacBook"
    By verifyProductMacBook = By.linkText("MacBook");

    public void verifyProductNameMacBook() {
        verifyExpectedAndActual(verifyProductMacBook, "MacBook");
    }

    //2.11 Change Quantity "2"
    By changeQty2 = By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]");

    public void changeQuantity2() {
        clearTextAndSendKey(changeQty2, "2");
    }

    //2.12 Click on “Update” Tab
    By clickOnUpdate = By.xpath("//tbody/tr[1]/td[4]/div[1]/span[1]/button[1]/i[1]");

    public void clickOnUpdateTab() {
        clickOnElement(clickOnUpdate);
    }

    //2.13 Verify the message “Success: You have modified your shopping cart!”
    By verifyMessageModified = By.xpath("//body/div[@id='checkout-cart']/div[1]");

    public void verifyTheMessageModified() {
        verifyExpectedAndActual(verifyMessageModified, "Success: You have modified your shopping cart!\n" + "×");
    }

    //2.14 Verify the Total  $1,204.00
    By verify$1204 = By.xpath("//body[1]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]");

    public void verifyTotal$1204() {
        verifyExpectedAndActual(verify$1204, "$1,204.00");
    }

    //2.15 Click on “Checkout” button
    By checkout = By.linkText("Checkout");

    public void clickOnCheckout() {
        clickOnElement(checkout);
    }

    //2.16 Verify the text “Checkout”
    By verifyCheckout = By.xpath("//h1[contains(text(),'Checkout')]");

    public void verifyCheckoutButton() {
        verifyExpectedAndActual(verifyCheckout, "Checkout");
    }

    //2.17 Verify the Text “New Customer”
    By verifyNewCustomer = By.xpath("//h2[contains(text(),'New Customer')]");

    public void verifyTextNewCustomer() {
        verifyExpectedAndActual(verifyNewCustomer, "New Customer");
    }

    //2.18 Click on “Guest Checkout” radio button
    By guestCheckout = By.xpath("//input[@value='guest']");

    public void clickGuestCheckout() {
        clickOnElement(guestCheckout);
    }

    //2.19 Click on “Continue” tab
    By continueTab = By.id("button-account");

    public void clickOnContinueTab() {
        clickOnElement(continueTab);
    }

    //2.20 Fill the mandatory fields//
    By firstNameField = By.xpath("//input[@id='input-payment-firstname']");

    public void enterName(String name) {
        sendTextToElement(firstNameField, name);
    }

    By lastNameField = By.xpath("//input[@id='input-payment-lastname']");

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
    }

    By emailField = By.id("input-payment-email");

    public void emailField(String email) {
        sendTextToElement(emailField, email);
    }

    By telephone = By.xpath("//input[@id='input-payment-telephone']");

    public void phone(String phone) {
        sendTextToElement(telephone, phone);
    }

    By addressLine = By.cssSelector("#input-payment-address-1");

    public void enterAddress(String address) {
        sendTextToElement(addressLine, address);
    }

    By cityName = By.xpath("//input[@id='input-payment-city']");

    public void enterCity(String city) {
        sendTextToElement(cityName, city);
    }

    By postCode = By.id("input-payment-postcode");

    public void enterPostcode(String code) {
        sendTextToElement(postCode, code);
    }

    By countryName = By.xpath("//select[@id='input-payment-country']");

    public void entreCountry(String country) {
        sendTextToElement(countryName, country);
    }

    By stateName = By.xpath("//select[@id='input-payment-zone']");

    public void enterStateName(String state) {
        sendTextToElement(stateName, state);
    }

    //2.21 Click on “Continue” Button
    By clickOnContinue = By.xpath("//input[@id='button-guest']");

    public void clickOnContinueButton() {
        clickOnElement(clickOnContinue);
    }

    //2.22 Add Comments About your order into text area
    By sendText = By.tagName("textarea");

    public void addComment(String comment) {
        sendTextToElement(sendText, comment);
    }

    //2.23 Check the Terms & Conditions check box
    By termCondition = By.xpath("//input[@name='agree']");
    public void clickOnTerms() {clickOnElement(termCondition);}
//2.24 Click on “Continue” button
        By lastContinue = By.id("button-payment-method");
        public void clickOnLastContinue(){clickOnElement(lastContinue);        }
//2.25 Verify the message “Warning: Payment method required!”
    By warningMsg = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
        public void verifyTheWarningMsg(){
            verifyExpectedAndActual(warningMsg,"Warning: Payment method required!");


    }
}