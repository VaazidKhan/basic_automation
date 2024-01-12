package basic_automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Google_Auto_Suggestions {
	
	public static void main(String[] args) {
		
		//access browser
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//navigate to google
		driver.get("https://www.google.com");
		
		//implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Use WebDriverWait to wait for auto-suggestions to appear
		
		
		//access chrome browser search bar
		WebElement searchBox = driver.findElement(By.xpath("//textarea[@jsname=\"yZiJbe\"]"));
		searchBox.sendKeys("hap");
		
		//explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"pcTkSc\"]")));
		
		//catch all the auto suggestions
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//div[@class=\"pcTkSc\"]"));
		
		//printing with for each loop
		for(WebElement suggestions : autoSuggestions) {
			System.out.println(suggestions.getText());
		}
		
		//quit browser
		//driver.quit();

	}

}
