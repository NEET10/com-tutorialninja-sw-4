package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.MyAccount;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountPageTest extends BaseTest {
    MyAccount myAccount = new MyAccount();
    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        myAccount.clickOnMyAccount();
        myAccount.selectMyAccountOptions("Register");
        Assert.assertEquals(myAccount.getVerifyRegister(), "Register Account", "Error Message not displayed");
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        myAccount.clickOnMyAccount();
        myAccount.selectMyAccountOptions("Login");
        Assert.assertEquals(myAccount.getVerifyReturning(), "Returning Customer", "Error Message not displayed");
    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {
        myAccount.clickOnMyAccount();
        myAccount.selectMyAccountOptions("Register");

        myAccount.enterFirstName("James");
        myAccount.enterLastName("Bond");
        myAccount.enterEmailAdd("James@gmail.com");
        myAccount.enterPhone("James@123");
        myAccount.enterPassword("020123456");
        myAccount.enterConfirmPass("020123456");

        myAccount.clickYesonNewsLetter();
        myAccount.clickOnPrivacy();
        myAccount.clickFinalContinue();

        Assert.assertEquals(myAccount.getVerifyMessage(), "Your Account Has Been Created!", "Error Message not displayed");
        myAccount.clickOnContinueButton();

        myAccount.clickOnMyAccountTab();
        myAccount.selectMyAccountOptions("Logout");
        Assert.assertEquals(myAccount.getVerifyLogout(), "Account Logout", "Error Message not displayed");
        myAccount.clickOnContinueTab();
    }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
        myAccount.clickOnMyAccountTab();
        myAccount.selectMyAccountOptions("Login");

        myAccount.enterEmailAdd("James@gmail.com");
        myAccount.enterPassword("James123");


        myAccount.clickOnMyAccountTab();
        myAccount.selectMyAccountOptions("Logout");
        //Assert.assertEquals(myAccount.getVerifyLogout(), "Account Logout", "Error Message not displayed");
        myAccount.clickOnContinueTab();
    }
}
