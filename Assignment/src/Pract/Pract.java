package Pract;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pract 
{
	static
	{
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://razorpay.com/");
		driver.findElement(By.xpath("//div[@class='container']/child::div[@class='header']/following-sibling::form/input")).sendKeys("Pushpendrasingh0193@gmail.com");
		driver.findElement(By.xpath("//div[@class='container']/child::div[@class='header']/following-sibling::form/button")).click();
		driver.findElement(By.id("password")).sendKeys("P51635645s");
//		Thread.sleep(6000);
		 Actions actions = new Actions(driver);
		
		Thread.sleep(3000);
		 WebElement robot = driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-checkmark']"));
		 actions.moveToElement(robot).click().perform();
		 driver.findElement(By.xpath("//button[@class='btn btn-primary form-control ']")).click();
		
	
    		
	}
}
