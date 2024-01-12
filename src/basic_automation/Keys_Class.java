package basic_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys_Class {
	
	public static void main(String[] args) {
		
		//access chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		//maximise window
		driver.manage().window().maximize();
		
		
		//login id and pass xpath
		WebElement id = driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]"));
		
		//send keys
		id.sendKeys("abcd",Keys.TAB,"12345");
		
		//clicking on eye icon to see the password
		driver.findElement(By.xpath("//div[@class=\"_9lsb _9ls8\"]")).click();
		
	}

}
