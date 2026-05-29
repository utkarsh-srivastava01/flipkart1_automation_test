package com.flipkart.runner;


	

	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
		    features = "src/test/resources/features",
		    glue = "com.flipkart.stepdefinition",
		    plugin = {
		        "pretty",
		        "html:src/test/resources/Reports/cucumber-reports.html",
		        "json:src/test/resources/Reports/cucumber.json"
		    },
		    monochrome = true
		)
		public class TestRunner extends AbstractTestNGCucumberTests {
		}


