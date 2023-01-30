package org.java.seleniumPracticeTest;

import java.util.ArrayList;
import java.util.List;

import org.java.seleniumPractice.BrowserUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElements {
	public static WebDriver driver;
	public static BrowserUtil br;
	
	public static void main(String[] args) {
		
		br = new BrowserUtil();
		driver = br.launchBrowser("chrome");
		br.enterURL("https://www.amazon.com/");
		
		String pageURL = br.getCurrentUrl();
		System.out.println("Page URL ====>>> "+pageURL);
		
		By pageLinks = By.tagName("a");
		
//		getElementTestList(pageLinks);
		System.out.println(getElementTestList(pageLinks));
		
	}
	
	public static List<String> getElementTestList(By locator) {
		List<WebElement> elementList = getElements(locator);
		
		List<String> listStr = new ArrayList<String>();
		
		for(int i = 0; i < elementList.size(); i++) {
			String text = elementList.get(i).getText();
			
			if(!text.isEmpty()) {
//				System.err.println(text);
				listStr.add(text);
			}
//			else {
//				System.err.println(text);
//			}
		}
		
		return listStr;
		
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
//		return ele;
	}
}
