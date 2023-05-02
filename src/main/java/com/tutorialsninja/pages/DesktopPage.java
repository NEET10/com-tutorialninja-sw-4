package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DesktopPage extends Utility {

    //1.1 Mouse hover on Desktops Tab.and click -->from Homepage
    //1.2 Click on “Show All Desktops”--> from Homepage
    //1.3 Select Sort By position "Name: Z to A"
    By sortByNameZToA = By.xpath("//select[@id='input-sort']");
    public void selectSortByPositionZToA(){
        selectByVisibleTextFromDropDown(sortByNameZToA,"Name (Z - A)");
    }
    //========================================================
    //1.4 Verify the Product will arrange in Descending order.
    //=========================================================

    //2.1 Mouse hover on Desktops Tab. and click-->from Homepage
    //2.2 Click on “Show All Desktops”--> from Homepage

    //2.3 Select Sort By position "Name: A to Z"
    By sortByNameAToZ = By.xpath("//select[@id='input-sort']");
    public void selectSortByPositionAToZ(){
        selectByVisibleTextFromDropDown(sortByNameAToZ,"Name (A - Z)" );}
    //2.4 Select product “HP LP3065”
    By hPLP3065 = By.linkText("HP LP3065");
    public void selectHPLP3065(){clickOnElement(hPLP3065);}
    //2.5 Verify the Text "HP LP3065"
    By verifyHPLP3065 = (By.xpath("//h1[contains(text(),'HP LP3065')]"));
    public void verifyTextHPLP3065(){
        verifyExpectedAndActual(verifyHPLP3065,"HP LP3065");}
    //2.6 Select Delivery Date "2022-11-30"
    By calenderSymbol = By.xpath("//i[@class='fa fa-calendar']");
    By monthYearOption = By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[2]");
    By forwardArrowNextToMonthYearOption = By.xpath("//body[1]/div[4]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[3]");
    By dateOption = By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[3]");
    public void selectDeliveryDate(){
        String year = "2022";
        String month = "November";
        String date = "30";
        String mothYear;
        explicitWait();
        //open the date picker
        clickOnElement(calenderSymbol);
        while (true) {
            String monthYear = driver.findElement(monthYearOption).getText();
            // Nov 2022
            String arr[] = monthYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];

            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(forwardArrowNextToMonthYearOption);
            }
        }
        //Select Date
        List<WebElement> allDates = driver.findElements(dateOption);
        for (WebElement dt : allDates) {
            if (dt.getText().equalsIgnoreCase(date)) {
                dt.click();
                break;
            }
        }
    }
    //2.7.Enter Qty "1” using Select class.
    By enterQty1 = By.xpath("//input[@id='input-quantity']");
    public void enterQuantity1(){clearTextAndSendKey(enterQty1,"1");}
    //2.8 Click on “Add to Cart” button
    By addToCart = By.xpath("//button[@id='button-cart']");
    public void clickOnAddToCart(){clickOnElement(addToCart);}
    //2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!
    By verifyMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    public void verifyTheMessage(){
        verifyExpectedAndActual(verifyHPLP3065,"Success: You have added HP LP3065 to your shopping cart!\n" +
                "×");}
    //2.10 Click on link “shopping cart” display into success message
    By shoppingCart = By.linkText("shopping cart");
    public void clickOnShoppingCart(){clickOnElement(shoppingCart);}
    //2.11 Verify the text "Shopping Cart"
    By verifyShoppingCart = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    public void verifyTextShoppingCart(){
        verifyExpectedAndActual(verifyShoppingCart,"Shopping Cart  (1.00kg)");}
    //2.12 Verify the Product name "HP LP3065"
    By verifyProductHPLP3065 = By.linkText("HP LP3065");
    public void verifyProductNameHPLP3065(){
        verifyExpectedAndActual(verifyProductHPLP3065,"HP LP3065");}
    //2.13 Verify the Delivery Date "2022-11-30"
    By verifyDate = By.xpath("//small[contains(text(),'Delivery Date:2022-11-30')]");
    public void verifyDeliveryDate(){
        verifyExpectedAndActual(verifyDate,"Delivery Date:2022-11-30");}
    //2.14 Verify the Model "Product21"
    By verifyProduct21 = By.xpath("//td[normalize-space()='Product 21']");
    public void verifyModelProduct21(){
        verifyExpectedAndActual(verifyProduct21,"Product 21");}
    //2.15 Verify the Total "£122.00"
By verifyTotalPrice = By.xpath("//tbody/tr[1]/td[6]");
    public void verifyTheTotalPrice(){
        verifyExpectedAndActual(verifyTotalPrice,"$122.00");
    }
}
