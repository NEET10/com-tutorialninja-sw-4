package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class DesktopPageTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder() {
        homePage.clickOnDesktopsLink();
        homePage.clickOnShowAllDesktops();
        desktopPage.selectSortByPositionZToA();
        ////1.4 Verify the Product will arrange in Descending order. need to complete it

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {
        homePage.clickOnDesktopsLink();
        homePage.clickOnShowAllDesktops();
        desktopPage.selectSortByPositionAToZ();
        desktopPage.selectHPLP3065();
        desktopPage.verifyTextHPLP3065();
        desktopPage.selectDeliveryDate();
        desktopPage.enterQuantity1();
        desktopPage.clickOnAddToCart();
        desktopPage.verifyTheMessage();
        desktopPage.clickOnShoppingCart();
        desktopPage.verifyTextShoppingCart();
        desktopPage.verifyProductNameHPLP3065();
        desktopPage.verifyDeliveryDate();
        desktopPage.verifyModelProduct21();
        desktopPage.verifyTheTotalPrice();
    }
}