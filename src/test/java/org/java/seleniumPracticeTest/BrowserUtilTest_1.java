package org.java.seleniumPracticeTest;

import org.java.seleniumPractice.BrowserUtil;
import org.openqa.selenium.WebDriver;


public class BrowserUtilTest_1 {
	
	public static WebDriver driver;
	public static BrowserUtil br;
	
	public static void main(String[] args) {
		
		br = new BrowserUtil();
		driver = br.launchBrowser("chrome");
		br.enterURL("https://www.amazon.com/");
		
		String pageURL = br.getCurrentUrl();
		System.out.println("Page URL ====>>> "+pageURL);
		
		String pageTitle = br.getPageTitle();
		System.out.println("Page title ====>>> "+pageTitle);
		
		if(pageTitle.contains("Amazon")) 
			System.out.println("Test passed...");
		else 
			System.err.println("Test failled...");
		
		br.close();
		
	}

}
