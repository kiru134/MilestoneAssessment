package com.mindtree.uistore;

import org.openqa.selenium.By;

public class HomePageUI {
	public static By Product =By.xpath(".//Button[@title='Products']");
	public static By Brand =By.xpath("(.//a[@title='MACH3'])[1]");
	public static By item = By.xpath("//*[@id=\"main-content\"]/div/div[4]/div/div[1]/div/div[1]/div/div/[3]");
	
	public static By search = By.xpath(".//*[@id='searchIconId']");
	public static By searchBox = By.cssSelector("#search-box-input");
	public static By result = By.xpath("//*[@id=\"main-content\"]/div/div[2]/div[1]/div/div[1]/p");
	
	public static By style = By.xpath("(.//*[@title='Styling'])[2]");
	public static By name = By.xpath("//*[@id=\"wrap\"]/div[2]/div[3]/ul/li[3]/div/div/a/div[2]/h3");
}
