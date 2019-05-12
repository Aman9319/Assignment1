package SeleniumAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScenarioGmail2 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) 
	{
		//open the browser		
		WebDriver driver=new ChromeDriver();		
		//set time out		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Enter the URL
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("pushpendrasingh0193@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Reset@12345");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
//		WebDriverWait wait=new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.urlToBe("https://mail.google.com/mail/u/0/#inbox"));
//		String atitle = driver.getTitle();
//		System.out.println(atitle);
		
		String atext = driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3 T-I-JW']")).getText();
		String etext="Compose";
		if(atext.equals(etext))
		{
			System.out.println("is varify");
		}
		else
		{
			System.out.println("not varify");
		}
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3 T-I-JW']")).click();
		
		String a1title = driver.findElement(By.xpath("//div[@class='aYF']")).getText();
		if(a1title.equals("New Message"))
		{
			System.out.println("2 title is verify");
			
		}
		driver.findElement(By.xpath("//textarea[@id=':yq']")).sendKeys("singhpk0193@gmail.com");
		driver.findElement(By.xpath("//input[@id=':y8']")).sendKeys("Text Mail");
		driver.findElement(By.xpath("//div[@id=':zd']")).sendKeys("This mail is regarding demo purpose");
		driver.findElement(By.xpath("//div[@id=':xy']")).click();
		
		
		

}
}
