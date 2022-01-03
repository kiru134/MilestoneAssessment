package com.mindtree.runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features",
		glue = "com.mindtree.stepDefination",
		plugin={"json:Reports/cucumber.json","html:Reports/cucumber.html"}
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
