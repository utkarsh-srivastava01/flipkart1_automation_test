package com.flipkart.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.reusableutility.SeleniumUtility;

public class loginnumberenter {
	WebDriver driver;
	SeleniumUtility rm;
	
	public loginnumberenter(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements( driver,this);
		rm= new SeleniumUtility(driver);
		
	}
	@FindBy(className="jwCbxy")
	WebElement num;
	public void enternumber(String value) {
		num.sendKeys(value);
		num.sendKeys(Keys.ENTER);
		rm.capturePageScreenshot("Clicked_LogIN_Button");
	}

}
