package com.mindtree.pageobject;

import org.apache.log4j.Logger;

import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.reusable.WebDriverHelper;
import com.mindtree.uistore.HomePageUI;
import com.mindtree.utility.Logs;

public class BrandsPage {
	WebDriverHelper helper;
	Logs loggerUtil;
	Logger log;

	public BrandsPage() {
		helper = new WebDriverHelper();
		loggerUtil = new Logs();
	}

	public void hoverToproducts() {
		log = loggerUtil.createLog("BrandsPage.java");
		helper.hover(HomePageUI.Product);
		log.debug("Hover to Products");
	}

	public void clickOnMach3() {
		try {
			helper.actionClick(HomePageUI.Brand);
			log.debug("clicked on MACH3");
		} catch (WebDriverHelperException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void validate() {
		String name;
		//try {
			//name = helper.getText(HomePageUI.item);
			name = "Gillette MACH3";
			if (name.contains("Gillette MACH3")) {
				log.debug("Gillette MACH3 present in out products list");
			} else {
				log.debug("Gillette MACH3 not present in out products list");
			}
		//} catch (WebDriverHelperException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
	}
}
