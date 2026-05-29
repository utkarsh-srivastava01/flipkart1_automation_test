package com.flipkart.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.reusableutility.SeleniumUtility;

public class FlipkartSearchPage {

WebDriver driver;

SeleniumUtility rm;



public FlipkartSearchPage(WebDriver driver)
{
this.driver=driver;

PageFactory.initElements(driver,this);

rm=new SeleniumUtility(driver);

}



@FindBy(name="q")
WebElement searchBox;



public void searchProduct(
String productName)
{

rm.typeText(searchBox,productName);

searchBox.sendKeys(
Keys.ENTER);
rm.capturePageScreenshot(productName + "_SearchResult");

}


}