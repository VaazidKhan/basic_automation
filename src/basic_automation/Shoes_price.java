package basic_automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shoes_price {
	
	public static void main(String[] args) {
		//accessing web browser
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//access flipkart
		driver.get("https://www.flipkart.com");
		
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//close the login popup if appears
		try {
            driver.findElement(By.xpath("//button[text()='✕']")).click(); // Corrected XPath for close button
        } catch (NoSuchElementException e) {
            System.out.println("Login popup not found, continuing...");
        }
		
		
		//search the product
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Boys shoes");
		searchBox.submit();
		
		//details of the product
		List <WebElement> productDetails = driver.findElements(By.xpath("//div[@class=\"_2B099V\"]"));
		
		//looping to print the details of the product
//		for(int i = 0; i<=productDetails.size();i++) {
//			System.out.println("Prodct"+i+1+"details : ");
//			System.out.println(productDetails.get(i+1).getText());
//			System.out.println("--------------------------------------");
			
		//looping with for each
		for(WebElement pd: productDetails) {
			System.out.println(pd.getText());
			System.out.println("--------------------------------------");
		}
			
		//quit browser
		driver.quit();
			
		}

}
