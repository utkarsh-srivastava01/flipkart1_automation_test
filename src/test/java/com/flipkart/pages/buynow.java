package com.flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.reusableutility.SeleniumUtility;

public class buynow {
	WebDriver driver;
	
	SeleniumUtility rm;
	
	public buynow(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
		rm=new SeleniumUtility(driver);
		
	}
	@FindBy(xpath= "/html/body/div[1]/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[16]/div/div/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[2]")
	
	WebElement buyn;
public void buy() {
	buyn.click();
	rm.capturePageScreenshot("Clicked_BuyNow_OrderSummary_Page");
}
}
