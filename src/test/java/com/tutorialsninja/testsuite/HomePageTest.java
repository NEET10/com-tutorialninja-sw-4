package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        homePage.clickOnDesktopsLink();
        homePage.clickOnShowAllDesktops();
        homePage.verifyTextDesktops();
    }
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
        homePage.clickOnLaptopsAndNotebooks();
        homePage.clickOnShowAllLaptopsAndNotebooks();
        homePage.verifyTextLaptopsAndNotebooks();
}
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
        homePage.clickOnComponents();
        homePage.clickOnShowAllComponents();
        homePage.verifyTextComponents();

}
}