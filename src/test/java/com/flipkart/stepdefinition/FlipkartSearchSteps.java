package com.flipkart.stepdefinition;

import com.flipkart.baseclass.baseclass;
import com.flipkart.pages.FlipkartSearchPage;
import com.flipkart.pages.buynow;
import com.flipkart.pages.productselection;
import com.flipkart.reusableutility.SeleniumUtility;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartSearchSteps extends baseclass {

    FlipkartSearchPage sp;
    productselection ps;
    SeleniumUtility  su;

    @Given("To launch the browser and nevigate to url")
    public void to_launch_the_browser_and_nevigate_to_url() {

        setup();
    }

    @When("Search {string} in search bar")
    public void search_in_search_bar(String product) throws Exception {

        sp = new FlipkartSearchPage(driver);

        Thread.sleep(3000);
        sp.searchProduct(product);

        Thread.sleep(3000);
    }

    @Then("Neviagte to search result page")
    public void neviagte_to_search_result_page() {

        System.out.println("Search page opened");
    }



    // PRODUCT SELECTION

//    @When("User selects any mobile product")
//    public void user_selects_any_mobile_product() throws Exception {
//
//        ps = new productselection(driver);
//
//        ps.productsel();
//
//        Thread.sleep(4000);
//    }
//
//
//    @Then("Product details page should open")
//    public void product_details_page_should_open() {
//
//       System.out.println("product detail page opened");
//    }
//
//    @Then ("buyoption button works")
//    public void buyoption_button_works() throws InterruptedException {
//    	su=new SeleniumUtility (driver);
//    	su.switchWindow();
//    	Thread.sleep(3000);
//
//    	buynow as =new buynow(driver);
//    	as.buy();
//    	Thread.sleep(10000);
//    	
//    	 System.out.println(driver.getTitle());
//    }
    @After
    public void cleanUp() {

        driver.quit();
    }

}