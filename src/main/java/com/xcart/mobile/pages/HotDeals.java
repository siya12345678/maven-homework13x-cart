package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HotDeals extends Utility {
    public void mouseHoverOnHotDealsAndSelectSaleThenMouseHoverOnShortByAndSelectAToZAndVerify() throws InterruptedException {
        mHoverAndClick(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][normalize-space()='Hot deals']"), By.xpath("//li[@class='leaf has-sub']//li[1]//a[1]"));
        String expectedResult="Sale";
        verifyPage(expectedResult,By.xpath("//h1[@id=\"page-title\"]"));
        mHoverAndClick(By.xpath("//span[@class=\"sort-by-label\"]"),By.xpath("//a[@data-sort-by=\"translations.name\" and @data-sort-order=\"asc\"]"));
        Thread.sleep(200);
        productsCompareAndSortList("NameA-Z");

    }
    public void goToHotDealsThenSaleThenVerifyAndGoToShortBySelectPriceLowToHighAndVerify(){
        mHoverAndClick(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][normalize-space()='Hot deals']"), By.xpath("//li[@class='leaf has-sub']//li[1]//a[1]"));
        String expectedResult="Sale";
        verifyPage(expectedResult, By.xpath("//h1[@id=\"page-title\"]"));
        mHoverAndClick(By.xpath("//span[@class=\"sort-by-label\"]"),By.xpath("//a[@data-sort-by=\"p.price\" and @data-sort-order=\"asc\"]"));
        productsCompareAndSortList("Price Low-High");
    }
    public void goToHotDealsThenSaleThenVerifyAndGoToShortBySelectRatesAndVerify(){
        mHoverAndClick(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][normalize-space()='Hot deals']"), By.xpath("//li[@class='leaf has-sub']//li[1]//a[1]"));
        String expectedResult="Sale";
        verifyPage(expectedResult, By.xpath("//h1[@id=\"page-title\"]"));
        mHoverAndClick(By.xpath("//span[@class=\"sort-by-label\"]"),By.xpath("//a[@data-sort-by=\"r.rating\" and @data-sort-order=\"asc\" ]"));
        productsCompareAndSortList("Rates");
    }
    public void goToHotDealsThenBestSellersThenVerifyAndGoToShortBySelectNameZToAAndVerify(){
        mHoverAndClick(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][normalize-space()='Hot deals']"),By.xpath("//div[@id='header-area']//span[contains(text(),'Bestsellers')]"));
        String expectedResult="Bestsellers";
        verifyPage(expectedResult,By.xpath("//h1[@id=\"page-title\"]"));
        mHoverAndClick(By.xpath("//span[@class=\"sort-by-label\"]"),By.xpath("//a[@data-sort-by=\"translations.name\" and @data-sort-order=\"desc\"]"));
        productsCompareAndSortList("Name Z-A");
    }
    public void goToHotDealsThenBestSellersThenVerifyAndGoToShortBySelectPriceHighToLowAndVerify(){
        mHoverAndClick(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][normalize-space()='Hot deals']"),By.xpath("//div[@id='header-area']//span[contains(text(),'Bestsellers')]"));
        String expectedResult="Bestsellers";
        verifyPage(expectedResult,By.xpath("//h1[@id=\"page-title\"]"));
        mHoverAndClick(By.xpath("//span[@class=\"sort-by-label\"]"),By.xpath("//a[@data-sort-by=\"p.price\" and @data-sort-order=\"desc\"]"));
        productsCompareAndSortList("Price High-low");
    }
    public void goToHotDealsThenBestSellersThenVerifyAndGoToShortBySelectRatesAndVerify(){
        mHoverAndClick(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][normalize-space()='Hot deals']"),By.xpath("//div[@id='header-area']//span[contains(text(),'Bestsellers')]"));
        String expectedResult="Bestsellers";
        verifyPage(expectedResult,By.xpath("//h1[@id=\"page-title\"]"));
        mHoverAndClick(By.xpath("//span[@class=\"sort-by-label\"]"),By.xpath("//a[@data-sort-by=\"r.rating\" and @data-sort-order=\"asc\"]"));
        productsCompareAndSortList("Rates");
    }

}
