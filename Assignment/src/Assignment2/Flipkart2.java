package Assignment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart2
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception
	{
		WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(2000);
		WebElement srchBox = driver.findElement(By.className("LM6RPg"));
		Thread.sleep(2000);
		srchBox.sendKeys("Let Us C# ");
		srchBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	   driver.findElement(By.xpath("//img[@class='_1Nyybr  _30XEf0' and @src='https://rukminim1.flixcart.com/"
		 		+ "image/612/612/book/2/7/6/let-us-c-original-imadhffhg5amwqnm.jpeg?q=70']")).click();
	   Thread.sleep(5000);
	 driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c' and contains(.,'BUY NOW')]")).click();
		
		
	}

}
