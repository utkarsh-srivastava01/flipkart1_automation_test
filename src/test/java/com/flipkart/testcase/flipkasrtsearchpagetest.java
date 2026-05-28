package com.flipkart.testcase;

import org.testng.annotations.Test;

import com.flipkart.baseclass.baseclass;
import com.flipkart.pages.FlipkartSearchPage;
import com.flipkart.pages.buynow;
import com.flipkart.pages.loginnumberenter;
import com.flipkart.pages.productselection;
import com.flipkart.reusableutility.SeleniumUtility;

public class flipkasrtsearchpagetest
extends baseclass{


@Test

public void verifyProductSearch()
throws InterruptedException
{

FlipkartSearchPage sp=
new FlipkartSearchPage(driver);


Thread.sleep(3000);


sp.searchProduct(
"mobile");


Thread.sleep(3000);

productselection ps = new productselection(driver);

ps.productsel();

Thread.sleep(5000);

SeleniumUtility  su=new SeleniumUtility (driver);
su.switchWindow();
Thread.sleep(5000);

buynow as =new buynow(driver);
as.buy();
Thread.sleep(10000);

loginnumberenter ut =new loginnumberenter(driver);
ut.enternumber("6393010033");
Thread.sleep(3000);
String title=
driver.getTitle();

System.out.println(title);

}


}