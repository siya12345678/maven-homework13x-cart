package com.xcart.mobile.shopping;

import com.xcart.mobile.pages.Shopping;
import com.xcart.mobile.testbase.TestBase;
import org.testng.annotations.Test;

public class ShoppingTest extends TestBase {
    Shopping shopping=new Shopping();
    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForCupOfMoioBlueTooth() throws InterruptedException {
        shopping.allStepsSoUserCanPlaceOrderSuccessFullyForCupOfMoioBlueTooth();
    }
    @Test
    public void verifyUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        shopping.allStepsSoThatUserShouldClearShoppingCartSuccessfully();
    }
}
