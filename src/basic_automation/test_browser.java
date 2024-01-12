package basic_automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test_browser {
	
	
	public static void chrome() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
	}
	
	public static void firefox() {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.33.0/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.fb.com");
	}
	
	public static void main(String[] args) {
		chrome();
		firefox();
		
	}

}
