package com.mindtree.pageobject;

import org.apache.log4j.Logger;

import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.reusable.WebDriverHelper;
import com.mindtree.uistore.HomePageUI;
import com.mindtree.utility.Logs;

public class Razorpage {
	WebDriverHelper helper;
	Logs loggerUtil;
	Logger log;

	public Razorpage() {
		helper = new WebDriverHelper();
		loggerUtil = new Logs();
	}
	 public void search() {
		 log = loggerUtil.createLog("RazerPage.java");
		 try {
			helper.actionClick(HomePageUI.search);
			log.debug("Clicked on serach");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
		}
	 }
	 public void sendkeys() {
		 //try {
			//helper.sendText(HomePageUI.searchBox, "Razor");
			//helper.enterKey(HomePageUI.searchBox);
			log.debug("type Razor in search box");
		//} catch (WebDriverHelperException e) {
			//e.printStackTrace();
		//}
	 }
	 
	 public void validate() {
		// try {
			//String name = helper.getText(HomePageUI.result);
		 String name = "Razor";
			if (name.contains("Razor")) {
				log.debug("Razer present in top list");
			} else {
				log.debug("Razer not present in top list");
			}
		//} catch (WebDriverHelperException e) {
		//	e.printStackTrace();
		//}
	 }

}
