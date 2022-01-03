package com.mindtree.manager;

import com.mindtree.pageobject.BrandsPage;
import com.mindtree.pageobject.Razorpage;
import com.mindtree.pageobject.StylePage;

public class PageObjectManager extends WebDriverManager{
	private BrandsPage BrandsPage;
	private Razorpage Razorpage;
	private StylePage StylePage;
	

	public BrandsPage getBrandsPage() {
		return(BrandsPage==null) ? BrandsPage = new BrandsPage():BrandsPage;
	}
	public Razorpage getRazorpage() {
		return(Razorpage==null) ? Razorpage = new Razorpage():Razorpage;
	}
	public StylePage getStylePage() {
		return(StylePage==null) ? StylePage = new StylePage():StylePage;
	}
}
