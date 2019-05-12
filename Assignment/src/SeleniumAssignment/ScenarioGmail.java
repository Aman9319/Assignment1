package SeleniumAssignment;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScenarioGmail {
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
		WebElement verpri = driver.findElement(By.xpath("//div[@class='aKw']/descendant::div[@class='aKz' and contains(.,'Primary')]"));
		if(verpri.getText().equals("Primary"))
		{			
			System.out.println("is verified");
		}
		else
		{
			System.out.println("is not verified");
		}
		List<WebElement> allmail = driver.findElements(By.xpath("//span[@class='bA4']"));
		System.out.println(allmail.size());
		for (int i = 0; i < allmail.size(); i++) {
			
			String text = allmail.get(i).getText();
			System.out.println(text);
			
		}
		
		System.out.println("enter the nth mail you want to print the subject");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		List<WebElement> subjects = driver.findElements(By.xpath("//table[@id=':2r']/descendant::span[@class='bog']/span"));
		
		for (int i = 0; i < subjects.size(); i++) {
			
			String subject = subjects.get(i).getText();
			if(n==(i+1))
			{
				System.out.println("Subject:"+subject);
				break;
			}
			
			//System.out.println("Mail "+(i+1)+" : "+subject);
		}
	}

}
