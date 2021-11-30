package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Shopping extends Utility {
    By addToCartButton = By.xpath("(//button[contains(@class,'regular-button add-to-cart product-add2cart productid-16')])[1]");
    By productAddedMessage = By.xpath("//li[@class='info']");
    By clickCrossSign = By.xpath("//a[@class='close']");
    By yourCart = By.xpath("(//div[@title='Your cart'])[1]");
    By viewCart = By.xpath("//a[@class='regular-button cart']");
    By shoppingCart1ItemMessage = By.xpath("//h1[@id='page-title']");
    By doubleClickOnQuantity = By.id("amount16");
    By changeQuantity2 = By.xpath("//input[@id=\"amount16\"]");
    By verifyQuantity2 = By.xpath("//h1[@id='page-title']");
    By verifySubTotal = By.xpath("//li[@class='subtotal']");
    By verifyTotal = By.xpath("//span[normalize-space()='36']");
    By goToCheckOut = By.xpath("//button[@class=\"btn  regular-button regular-main-button checkout\"]");
    By verifyLoginToYourAccount = By.xpath("//h3[contains(text(),'Log in to your account')]");
    By emilField = By.xpath("//input[@id=\"email\"]");
    By continueButton = By.xpath("//span[contains(text(),'Continue')]");
    By verifySecureCheckout = By.xpath("//h1[contains(text(),'Secure Checkout')]");
    By firstName = By.xpath("//input[@id=\"shippingaddress-firstname\"]");
    By lastName = By.xpath("//input[@id=\"shippingaddress-lastname\"]");
    By address = By.xpath("//input[@id=\"shippingaddress-street\"]");
    By city = By.xpath("//input[@id=\"shippingaddress-city\"]");
    By country = By.xpath("//select[@id=\"shippingaddress-country-code\"]");
    By state = By.xpath("//input[@id=\"shippingaddress-custom-state\"]");
    By zipCode = By.xpath("//input[@id=\"shippingaddress-zipcode\"]");
    By checkBoxAccountlaterUse = By.xpath("//input[@id=\"create_profile\"]");
    By password = By.xpath("//input[@id=\"password\"]");
    By localShippingRadioButton = By.id("method128");
    By codRadioButton = By.xpath("//input[@id='pmethod6' and @value='6']");
    By verifyTotalLast = By.xpath("//span[contains(text(),'37.03')]/ancestor::span[@class=\"surcharge-cell\"");
    By placeOrderButton = By.xpath("//button[@class=\"btn regular-button regular-main-button place-order submit\"]");
    By thankYouOrderMessage = By.xpath("//h1[@id='page-title']");
    By hotDeals = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][normalize-space()='Hot deals']");
    By bestSellers = By.xpath("//div[@id='header-area']//span[contains(text(),'Bestsellers')]");
    By verifyBestSeller = By.xpath("//h1[@id=\"page-title\"]");
    By shortBy = By.xpath("//span[@class=\"sort-by-label\"]");
    By nameAToZ = By.xpath("//a[@data-sort-by=\"translations.name\" and @data-sort-order=\"asc\"]");
    By mouseHoverVinylIdolz = By.xpath("//a[contains(@class,'product-thumbnail next-previous-assigned')]//img[contains(@alt,'Vinyl Idolz: Ghostbusters')]");
    By addToCartButton1 = By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-13']");
    By verifyProductAdded = By.xpath("//li[@class=\"info\"]");
    By crossSign = By.xpath("//a[@class=\"close\"]");
    By yourCart1 = By.xpath("//div[@class=\"lc-minicart lc-minicart-horizontal collapsed recently-updated\"]");
    By viewCart1 = By.xpath("//span[contains(text(),'View cart')]");
    By verifyOneItemAddedOnShoppingCart = By.xpath("//h1[@id=\"page-title\"]");
    By emptyYourCart = By.xpath("//a[@class=\"clear-bag\"]");
    By verifyItemDeletedMsg = By.xpath("//li[@class='info' and contains(text(),'Item(s) deleted from your cart')][1]");
    By verifyCartIsEmpty = By.xpath("//h1[@id=\"page-title\"]");

    public void allStepsSoUserCanPlaceOrderSuccessFullyForCupOfMoioBlueTooth() throws InterruptedException {
        mHoverAndClick(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][normalize-space()='Hot deals']"), By.xpath("//li[@class='leaf has-sub']//li[1]//a[1]"));
        String expectedResult = "Sale";
        verifyPage(expectedResult, By.xpath("//h1[@id=\"page-title\"]"));
        mHoverAndClick(By.xpath("//span[@class=\"sort-by-label\"]"), By.xpath("//a[@data-sort-by=\"translations.name\" and @data-sort-order=\"asc\"]"));
        Thread.sleep(2000);
        clickOnElement(addToCartButton);
        String expectedResult1 = "Product has been added to your cart";
        verifyPage(expectedResult1, productAddedMessage);
        Thread.sleep(2000);
        clickOnElement(clickCrossSign);
        clickOnElement(yourCart);
        clickOnElement(viewCart);
        Thread.sleep(2000);
        String expMsg = "Your shopping cart - 1 item";
        verifyPage(expMsg, shoppingCart1ItemMessage);
        Thread.sleep(2000);
        doubleClickOnElement(doubleClickOnQuantity);
        Thread.sleep(2000);
        sendTextElement(changeQuantity2, "2");
        Thread.sleep(2000);
        String expMsg1 = "Your shopping cart - 2 items";
        Thread.sleep(2000);
        verifyPage(expMsg1, verifyQuantity2);
        Thread.sleep(2000);
        String em = "Subtotal: $29.98";
        verifyPage(em, verifySubTotal);
        String em1 = "36";
        verifyPage(em1, verifyTotal);
        Thread.sleep(2000);
        clickOnElement(goToCheckOut);
        String em2 = "Log in to your account";
        verifyPage(em2, verifyLoginToYourAccount);
        RandomString email = new RandomString(5);
        String randomEmail = email.nextString();
        sendTextElement(emilField, randomEmail + "@gmail.com");
        clickOnElement(continueButton);
        String em3 = "Secure Checkout";
        verifyPage(em3, verifySecureCheckout);
        sendTextElement(firstName, "Ram");
        sendTextElement(lastName, "Smith");
        sendTextElement(address, "Surrey");
        driver.findElement(city).clear();
        sendTextElement(city, "London");
        selectFromDropDown(country, "GB");
        sendTextElement(state, "UK");
        sendTextElement(zipCode, "50001");
        clickOnElement(checkBoxAccountlaterUse);
        Thread.sleep(3000);
        sendTextElement(password, "Jssvp@08");
        doubleClickOnElement(localShippingRadioButton);
        clickOnElement(codRadioButton);
        Thread.sleep(3000);
        String em4 = "$37.03";
        // verifyPage(em4,verifyTotalLast);
        clickOnElement(placeOrderButton);
        Thread.sleep(3000);
        String em5 = "Thank you for your order";
        verifyPage(em5, thankYouOrderMessage);
    }

    public void allStepsSoThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        mHoverAndClick(hotDeals, bestSellers);
        String expMsg = "Bestsellers";
        verifyPage(expMsg, verifyBestSeller);
        mHoverAndClick(shortBy, nameAToZ);
        mouseHoverOnElement(driver.findElement(mouseHoverVinylIdolz));
        Thread.sleep(3000);
        clickOnElement(addToCartButton1);
        String em = "Product has been added to your cart";
        verifyPage(em, verifyProductAdded);
        clickOnElement(crossSign);
        clickOnElement(yourCart1);
        Thread.sleep(3000);
        clickOnElement(viewCart1);
        Thread.sleep(3000);
        String em1 = "Your shopping cart - 1 item";
        verifyPage(em1, verifyOneItemAddedOnShoppingCart);
        clickOnElement(emptyYourCart);
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        Assert.assertEquals("Are you sure you want to clear your cart?", driver.switchTo().alert().getText());
        alert.accept();
        Thread.sleep(2000);
        String em2 = "Item(s) deleted from your cart";
        verifyPage(em2, verifyItemDeletedMsg);
        String em3 = "Your cart is empty";
        verifyPage(em3, verifyCartIsEmpty);
    }
}







