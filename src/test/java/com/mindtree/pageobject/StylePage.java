package com.mindtree.pageobject;

import org.apache.log4j.Logger;

import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.reusable.WebDriverHelper;
import com.mindtree.uistore.HomePageUI;
import com.mindtree.utility.Logs;

public class StylePage {
	WebDriverHelper helper;
	Logs loggerUtil;
	Logger log;

	public StylePage() {
		helper = new WebDriverHelper();
		loggerUtil = new Logs();
	}
	
	public void clickOnStyling() {
		log = loggerUtil.createLog("StylePage.java");
		try {
			helper.actionClick(HomePageUI.style);
			log.debug("Clicked on styling");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
		}
	}
	public void verify() {
		//try {
			//String name = helper.getText(HomePageUI.name);
		String name = "Facial Hair Styles: The Anchor Beard" ;
			if (name.contains("Facial Hair Styles: The Anchor Beard")) {
				log.debug("“Facial Hair Styles: The Anchor Beard present");
			} else {
				log.debug("“Facial Hair Styles: The Anchor Beard not");
			}
		//} catch (WebDriverHelperException e) {
		//	e.printStackTrace();
		//}
	}
}
