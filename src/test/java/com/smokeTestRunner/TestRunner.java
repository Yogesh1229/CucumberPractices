package com.smokeTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/com/features", 
		glue = {"com.stepDefinition", "com.MyHooks"},
		monochrome=true,
//		tags = "@All",
		plugin = {
        "pretty",
        "html:target/cucumber-reports/cucumber-html-reports.html",
        "json:target/cucumber-reports/CucumberTestReport.json",
        "rerun:target/cucumber-reports/rerun.txt",
        "junit:target/cucumber-reports/report.xml"},
		publish = true)
public class TestRunner {

}
