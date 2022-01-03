package com.mindtree.stepDefination;

import org.apache.log4j.Logger;

import com.mindtree.manager.PageObjectManager;
import com.mindtree.pageobject.Razorpage;
import com.mindtree.utility.Logs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RazorStepDefination {
	PageObjectManager pageManager;
	Razorpage Razorpage;
	Logs loggerUtil;
	Logger log;
	@When("I search Razor search option")
	public void i_search_razor_search_option() {
		loggerUtil = new Logs();
		log = loggerUtil.createLog("Test1");
		pageManager = new PageObjectManager();
		Razorpage = pageManager.getRazorpage();
		
		Razorpage.search();
		Razorpage.sendkeys();
	}

	@Then("I verify the results of Razor displayed")
	public void i_verify_the_results_of_razor_displayed() {
		Razorpage.validate();
	}
}
