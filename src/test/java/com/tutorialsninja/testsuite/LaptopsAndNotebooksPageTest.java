package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LAndNPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class LaptopsAndNotebooksPageTest extends BaseTest {
    HomePage homepage = new HomePage();
    LAndNPage lAndNPage = new LAndNPage();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {
        homepage.clickOnLaptopsAndNotebooks();
        homepage.clickOnShowAllLaptopsAndNotebooks();
        lAndNPage.selectSortByPriceHighToLow();
        //1.4 Verify the Product price will arrange in High to Low order.
    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {
        homepage.clickOnLaptopsAndNotebooks();
        homepage.clickOnShowAllLaptopsAndNotebooks();
        lAndNPage.selectSortByPriceHighToLow();
        lAndNPage.selectMacBook();
        lAndNPage.verifyTextMacBook();
        lAndNPage.clickOnAddToCartButton();
        lAndNPage.verifyTheMessageStartWithSuccess();
        lAndNPage.clickOnShoppingCartLink();
        lAndNPage.verifyTextShoppingCart();
        lAndNPage.verifyProductNameMacBook();
        lAndNPage.changeQuantity2();
        lAndNPage.clickOnUpdateTab();
        lAndNPage.verifyTheMessageModified();
        lAndNPage.verifyTotal$1204();
        lAndNPage.clickOnCheckout();
        lAndNPage.verifyCheckoutButton();
        lAndNPage.verifyTextNewCustomer();
        lAndNPage.clickGuestCheckout();
        lAndNPage.clickOnContinueTab();
        lAndNPage.enterName("James");
        lAndNPage.enterLastName("Bond");
        lAndNPage.emailField("James123@gmail.com");
        lAndNPage.phone("01235 6754");
        lAndNPage.enterAddress("3, B, Prime Rd, NYC");
        lAndNPage.enterCity("NewYork");
        lAndNPage.enterPostcode("476854");
        lAndNPage.entreCountry("USA");
        lAndNPage.enterStateName("NewJersey");
        lAndNPage.clickOnContinueButton();
        lAndNPage.addComment("Thanks");
        lAndNPage.clickOnTerms();
        lAndNPage.clickOnLastContinue();
        lAndNPage.verifyTheWarningMsg();










}

}