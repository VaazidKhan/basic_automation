package basic_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_flip {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.navigate().to("https://www.flipkart.com");
		driver.get("https://www.flipkart.com");
		
		//explicitly wait
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("\"//input[@class='Pke_EE']\"")));
		
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		
		//search and enter the data field
		
		WebElement searchElement = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		searchElement.sendKeys("iphone12");
		
		//hard code to find and submit
		//--driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		
		//easiest way to submit using the webelement
		
		searchElement.submit();
		
		//printng the collected data
		
		for(int i=1;i<=24;i++) {
		System.out.println("---------------------------------------------");
		System.out.println("All details :"+i);
		
		WebElement details = driver.findElement(By.xpath("(//div[@class='col col-7-12'])[" + i + "]"));
        String text = details.getText();
        System.out.println("Details: " + text);

        WebElement price = driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[" + i + "]"));
        String amount = price.getText();
        System.out.println("Price: " + amount);
    }

    // Close the browser
    driver.quit();
		}
		
		}

