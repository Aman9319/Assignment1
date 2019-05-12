package SeleniumAssignment;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScenarioBluestone
{

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		WebElement offers = driver.findElement(By.xpath("//ul[@class='wh-main-menu']/descendant::li[@class='menuparent offers-menuparent pull-right']/a"));
		Actions action =new Actions(driver);
		action.moveToElement(offers).perform();;
		WebElement off = driver.findElement(By.xpath("//strong[text()='20% Off on Making Charges']"));
		action.moveToElement(off).click().perform();
		String text = driver.findElement(By.xpath("//span[text()='20% off on making charge']")).getText();
		System.out.println(text);
		if(text.equalsIgnoreCase("20% off on making charge"))
		{
			System.out.println("is verify");
				
		}
		else
		{
			System.out.println("not verify");
		}
		driver.close();
				
		
	}
}
