package basic_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//website is updated need new website

public class H_Over {
	
	public static void main(String[] args) {
		
		//access chrome
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//access actitime
		driver.get("https://demo.actitime.com/login.do");
		
	}

}
