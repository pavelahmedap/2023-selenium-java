package org.java.seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This class will have browser related method
 * 
 * @author Pavel
 *
 */
public class BrowserUtil {

	private WebDriver driver;

	/**
	 * This method is responsible to launch the browser on the basis given browser
	 * 
	 * @param browser
	 * @return WebDriver
	 */
	public WebDriver launchBrowser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Edge") || browser.equalsIgnoreCase("MSEdge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("safari")) {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		} else {
			System.out.print("Please pass the valid browser.... " + browser);
		}
		
		driver.manage().window().maximize();
		
		return driver;
	}

	/**
	 * This method is responsible to enter the URL
	 * 
	 * @param url
	 */
	public void enterURL(String url) {
		if (url == null) {
			System.out.println("URL is null...");
			return;
		} else if (url.indexOf("http") == -1) {
			System.out.println("Http is missing in the URL....");
			return;
		}
		driver.get(url);
	}

	/**
	 * This method is responsible for getting title of the current page
	 * 
	 * @return current page title 
	 */
	public String getPageTitle() {
		return driver.getTitle();
	}

	/**
	 * This method is responsible for getting the current page URL
	 * 
	 * @return current page URL
	 */
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	/**
	 * This method is responsible for getting the source of the last loaded page
	 * 
	 * @return current page source
	 */
	public String getPageSource() {
		return driver.getPageSource();
	}

	/**
	 * This method is responsible for closing the browser
	 */
	public void close() {
		driver.close();
	}

	/**
	 * This method is responsible for quitting the browser & closing every
	 * associated window
	 */
	public void quit() {
		driver.quit();
	}

	/**
	 * This method is responsible pause the test on a page for the specified time
	 * provided
	 * 
	 * @throws InterruptedException
	 */
	public void pause(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
