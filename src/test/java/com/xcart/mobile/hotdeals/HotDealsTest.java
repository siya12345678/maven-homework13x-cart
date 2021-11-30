package com.xcart.mobile.hotdeals;

import com.xcart.mobile.pages.HotDeals;
import com.xcart.mobile.testbase.TestBase;
import org.testng.annotations.Test;

public class HotDealsTest extends TestBase {
    HotDeals hotDeals=new HotDeals();
    @Test
    public void VerifySaleProductsArrangeAlphabetically() throws InterruptedException {
        hotDeals.mouseHoverOnHotDealsAndSelectSaleThenMouseHoverOnShortByAndSelectAToZAndVerify();
    }
    @Test
    public void verifySaleProductsPriceArrangeLowTHigh(){
        hotDeals.goToHotDealsThenSaleThenVerifyAndGoToShortBySelectPriceLowToHighAndVerify();
    }
    @Test
    public void verifySaleProductsArrangedByRates(){
        hotDeals.goToHotDealsThenSaleThenVerifyAndGoToShortBySelectRatesAndVerify();
    }
    @Test
    public void verifyBestSellersProductsArrangeByZtoA(){
        hotDeals.goToHotDealsThenBestSellersThenVerifyAndGoToShortBySelectNameZToAAndVerify();
    }
    @Test
    public void verifyBestSellersProductPriceArrangeHighToLow(){
        hotDeals.goToHotDealsThenBestSellersThenVerifyAndGoToShortBySelectPriceHighToLowAndVerify();
    }
    @Test
    public void verifyBestSellersProductArrangedByRates(){
        hotDeals.goToHotDealsThenBestSellersThenVerifyAndGoToShortBySelectRatesAndVerify();
    }


}
