package basic_automation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class min_max {
	
	private WebDriver driver;
	

	//Acess web browser
	
	public void broweser(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64/chromedriver.exe");
		
		
		//chrome driver access
		driver = new ChromeDriver();
		

		//implicit method
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		
		driver.get("https://www.flipkart.com");
			}
	
	//maximise the window
	
	public void max() {
		
		driver.manage().window().maximize();	
	}
	
	//minimise the window
	
	public void min() {
		
		driver.manage().window().minimize();
	}
	
	public void close() {
		driver.close();
	}

	public static void main(String[] args){
		min_max test = new min_max();
		test.broweser();
		test.max();
		test.min();
		test.close();
	}

}
