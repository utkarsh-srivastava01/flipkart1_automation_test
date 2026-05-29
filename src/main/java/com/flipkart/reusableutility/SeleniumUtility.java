package com.flipkart.reusableutility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtility {

WebDriver driver;


public SeleniumUtility(WebDriver driver)
{
    this.driver=driver;
}

///////////Wait Element Method///////////////////////
public void waitForElement(WebElement element)
{
WebDriverWait wait=
new WebDriverWait(driver,
Duration.ofSeconds(10));

wait.until(
ExpectedConditions.visibilityOf(element));

}

///////////Enter a Value Method///////////////////////
public void typeText(WebElement element,String value)
{
try {
	waitForElement(element);
	
	element.sendKeys(value);
	
} catch (Exception e) {
	System.out.println("failed to type value");
	throw e ;
}

}

/////////// Element Clicked Method///////////////////////

public void clickElement(WebElement element)
{
try {
	waitForElement(element);
	
	element.click();
} catch (Exception e) {
	// TODO Auto-generated catch block
	System.out.println("element should not clicked");
	throw e;
}

}
///////////Switch Window Method///////////////////////
public void switchWindow()
{

String parent =
driver.getWindowHandle();

Set<String> windows =
driver.getWindowHandles();

for(String w : windows)
{

if(!w.equals(parent))
{

driver.switchTo()
.window(w);

}

}

}

///////////Screenshot Method///////////////////////
public void capturePageScreenshot(String screenshotName) {
    try {
        // 1. Take the screenshot using your exact logic
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        
        // 2. Save it to your resources path with a dynamic name
        String destinationPath = "src/test/resources/Screenshot/" + screenshotName + ".png";
        FileUtils.copyFile(src, new File(destinationPath));
        
        System.out.println("Screenshot saved successfully at: " + destinationPath);
        
    } catch (IOException e) {
        System.err.println("Failed to save screenshot: " + e.getMessage());
    }
}

///////////Get Title Method///////////////////////
public String getTitle()
{

return driver.getTitle();

}

}