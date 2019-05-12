package SeleniumAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScenarioBlustone11 {
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
		action.moveToElement(offers).perform();
	driver.findElement(By.xpath("//strong[text()='0% Making Charge']")).click();
	String text = driver.findElement(By.xpath("//span[text()='0% making charge']")).getText();
	if(text.equalsIgnoreCase("0% making charge"))
	{
	System.out.println("0 % is displaying");	
	}
	else
	{
		
		System.out.println("0 % is not displaying");
	}
	}

}
