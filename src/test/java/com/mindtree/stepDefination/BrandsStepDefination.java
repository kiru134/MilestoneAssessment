package com.mindtree.stepDefination;

import org.apache.log4j.Logger;

import com.mindtree.manager.PageObjectManager;
import com.mindtree.pageobject.BrandsPage;
import com.mindtree.utility.Logs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BrandsStepDefination {
	PageObjectManager pageManager;
	BrandsPage BrandsPage;
	Logs loggerUtil;
	Logger log;
	@Given("Open website")
	public void go_to_website() {
		loggerUtil = new Logs();
		log = loggerUtil.createLog("Test1");
		pageManager = new PageObjectManager();
		BrandsPage = pageManager.getBrandsPage();
	}

	@When("Hover on Products Choose MACH3 under Brands")
	public void hover_on_products_choose_mach3_under_brands() {
		BrandsPage.hoverToproducts();
		BrandsPage.clickOnMach3();
	}

	@Then("Verify Gillette MACH3 Turbo is displayed under  products")
	public void verify_gillette_mach3_turbo_is_displayed_under_products() {
		BrandsPage.validate();
	}
}
