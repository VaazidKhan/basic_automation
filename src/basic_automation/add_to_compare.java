package basic_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class add_to_compare {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.navigate().to("https://www.flipkart.com");
		
			//implicitly wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
			driver.manage().window().maximize();
			
			//search and enter the data field
			
			WebElement searchElement = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
			searchElement.sendKeys("iphone12");			
			searchElement.submit();
			Thread.sleep(5000);
		//selecting add to compare
		//hard code	
//			for(int i=1;i<=24;i++) {
//				
//				driver.findElement(By.xpath("//label[@class='_6Up2sF']["+i+"]")).click();
//			
//	    }
			
			
			

	    // Close the browser
	    driver.quit();
			}
			
			}



