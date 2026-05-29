package com.flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.reusableutility.SeleniumUtility;

public class productselection {
	WebDriver driver;
	
	SeleniumUtility rm;
	
	public productselection(WebDriver driver) {
		// TODO Auto-generated constructor stub
	

		
	this.driver=driver;
	

PageFactory.initElements(driver,this);
rm = new SeleniumUtility(driver);
	

}
	@FindBy(xpath="//img[@alt='Samsung Galaxy F07 (Green, 64 GB)']")
	WebElement product;
	
	 public void productsel()
	 {
		 product.click();
		 rm.capturePageScreenshot("Clicked_Product Selection_Page");
	 }
	
		
		
	}


