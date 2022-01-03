package com.mindtree.stepDefination;

import org.apache.log4j.Logger;

import com.mindtree.manager.PageObjectManager;
import com.mindtree.pageobject.StylePage;
import com.mindtree.utility.Logs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StyleStepDefination {
	
	PageObjectManager pageManager;
	StylePage StylePage;
	Logs loggerUtil;
	Logger log;
	@When("Click on Styling under learn")
	public void click_on_styling_under_learn() {
		loggerUtil = new Logs();
		log = loggerUtil.createLog("Test1");
		pageManager = new PageObjectManager();
		StylePage = pageManager.getStylePage();
		
		StylePage.clickOnStyling();
	}

	@Then("Verify Facial Hair Styles The Anchor Bear is displayed under styling")
	public void verify_facial_hair_styles_the_anchor_bear_is_displayed_under_styling() {
		StylePage.verify();
	}
}
