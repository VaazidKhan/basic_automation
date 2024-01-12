package basic_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Dropdown {
	
	public static void main(String[] args) {
		//access browser
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//access flipkart
		driver.get("https://www.flipkart.com");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//choosing category
		WebElement itemCategory = driver.findElement(By.xpath("//span[Rtext()='Electronics'"));
		
		//need to be developed
		
				
	}

}
