package com.flipkart.runner;


	

	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
	    features = "src/test/resources/features", // Path to the folder holding search.feature
	    glue = "com.flipkart.stepdefinition",                 // Name of the package containing your step definition java file
	    plugin = {"pretty", "html:src/test/resources/Reports/cucumber-reports.html"}
	)
	public class testrunner extends AbstractTestNGCucumberTests {
	    // Keep this class empty. It serves as the trigger point.
	}


