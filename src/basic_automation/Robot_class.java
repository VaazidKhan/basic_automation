package basic_automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_class {
	public static void main(String[] args) throws AWTException {
		
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
		id.click();
		
		//robot class
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_B);
		r.keyRelease(KeyEvent.VK_B);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		
		
		

	}

}
