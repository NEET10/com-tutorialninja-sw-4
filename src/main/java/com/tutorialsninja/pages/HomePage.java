package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    //1.1 Mouse hover on “Desktops” Tab and click
    By desktops = (By.linkText("Desktops"));
    public void clickOnDesktopsLink(){
        mouseHoverToElementAndClick(desktops);}
    //1.2 click “Show All Desktops”
    By showAllDesktop = By.xpath("//a[contains(text(),'Show AllDesktops')]");
    public void clickOnShowAllDesktops(){
        mouseHoverToElementAndClick(showAllDesktop);
    }
    //1.3 Verify the text ‘Desktops’
    By verifyDesktops = By.xpath("//h2[contains(text(),'Desktops')]");
    public void verifyTextDesktops(){
        verifyExpectedAndActual(verifyDesktops,"Desktops");
    }
    //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
    By laptopsAndNotebooks = By.linkText("Laptops & Notebooks");
    public void clickOnLaptopsAndNotebooks(){
        mouseHoverToElementAndClick(laptopsAndNotebooks);
    }
    //2.2 click on  “Show All Laptops & Notebooks”
    By showAllLaptopsAndNotebooks = By.xpath("//a[contains(text(),'Show AllLaptops & Notebooks')]");
    public void clickOnShowAllLaptopsAndNotebooks(){
        mouseHoverToElementAndClick(showAllLaptopsAndNotebooks);
    }
    //2.3 Verify the text ‘Laptops & Notebooks’
    By verifyLaptopsAndNotebooks = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    public void verifyTextLaptopsAndNotebooks(){
        verifyExpectedAndActual(verifyLaptopsAndNotebooks,"Laptops & Notebooks");
        }
        //3.1 Mouse hover on “Components” Tab and click
    By components = By.linkText("Components");
    public void clickOnComponents(){
        mouseHoverToElementAndClick(components);}
    //3.2 Click on “Show All Components”
    By showAllComponents = By.xpath("//a[contains(text(),'Show AllComponents')]");
    public void clickOnShowAllComponents(){
        mouseHoverToElementAndClick(showAllComponents);}
    //3.3 Verify the text ‘Components’
    By verifyComponents = By.xpath("//h2[contains(text(),'Components')]");
    public void verifyTextComponents(){
        verifyExpectedAndActual(verifyComponents,"Components");
    }





 }
