package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By shippingLink=By.xpath("//ul[@class='nav navbar-nav top-main-menu']/descendant::span[contains(.,'Shipping')]");
    By newLink=By.xpath("//ul[@class='nav navbar-nav top-main-menu']/descendant::span[contains(.,'New!')]");
    By comingSoonLink=By.linkText("Coming soon");
    By contactUsLink=By.linkText("Contact us");
    public void clickOnShippingLink(){
        clickOnElement(shippingLink);

    }
    public void clickOnNewLink(){
        clickOnElement(newLink);
    }
    public void clickOnComingSoonLink(){
        clickOnElement(comingSoonLink);
    }
    public void clickOnContactUsPage(){
        clickOnElement(contactUsLink);
    }

}
