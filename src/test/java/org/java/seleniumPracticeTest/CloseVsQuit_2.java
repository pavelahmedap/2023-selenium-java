package org.java.seleniumPracticeTest;

import org.java.seleniumPractice.BrowserUtil;
import org.openqa.selenium.WebDriver;

public class CloseVsQuit_2 {
	public static WebDriver driver;
	public static BrowserUtil br;

	public static void main(String[] args) {

		br = new BrowserUtil();
		driver = br.launchBrowser("chrome");
		br.enterURL("https://www.amazon.com/");
		
//		br.close(); //org.openqa.selenium.NoSuchSessionException: invalid session id
		br.quit(); // org.openqa.selenium.NoSuchSessionException: Session ID is null.
		String url = br.getCurrentUrl();
		System.out.println(url); 
	}
}
