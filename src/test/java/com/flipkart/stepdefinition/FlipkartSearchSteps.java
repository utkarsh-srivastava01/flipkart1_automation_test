package com.flipkart.stepdefinition;

import com.flipkart.baseclass.baseclass;
import com.flipkart.pages.FlipkartSearchPage;
import com.flipkart.pages.productselection;
import com.flipkart.pages.buynow;
import com.flipkart.reusableutility.SeleniumUtility;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartSearchSteps extends baseclass {

    FlipkartSearchPage sp;
    productselection ps;
    buynow bn;
    SeleniumUtility su;

    @Given("To launch the browser and nevigate to url")
    public void to_launch_the_browser_and_nevigate_to_url() {

        setup();
    }

    @Then("Neviagte to search result page")
    public void neviagte_to_search_result_page() {

        System.out.println("Search Result Page Opened");
    }

    @When("Search mobiles in search bar")
    public void search_mobiles_in_search_bar() throws Exception {

        sp = new FlipkartSearchPage(driver);

        Thread.sleep(3000);
        sp.searchProduct("mobile");
        Thread.sleep(3000);
    }

    @When("User selects any mobile product")
    public void user_selects_any_mobile_product() throws Exception {

        ps = new productselection(driver);

        ps.productsel();

        Thread.sleep(4000);
    }

    @Then("Product details page should open")
    public void product_details_page_should_open() {

        System.out.println("Product Details Page Opened");
    }

    @Then("buyoption button works")
    public void buyoption_button_works() throws Exception {

        su = new SeleniumUtility(driver);

        su.switchWindow();

        Thread.sleep(3000);

        bn = new buynow(driver);

        bn.buy();

        Thread.sleep(5000);

        System.out.println("Buy Option Clicked");
        System.out.println(driver.getTitle());
    }

    @After
    public void cleanUp() {

        if(driver != null) {
            driver.quit();
        }
    }
}