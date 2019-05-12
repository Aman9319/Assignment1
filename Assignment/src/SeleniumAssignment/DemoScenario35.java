package SeleniumAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoScenario35 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws Exception
{
    //open the browser
	WebDriver driver = new ChromeDriver();
	//set the time out
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//enter the Url
	driver.get("https://jqueryui.com/slider/");
	driver.switchTo().frame(0);
	WebElement element = driver.findElement(By.xpath("//div[@id='slider']/span"));
	
	
	Actions actions = new Actions(driver);
	
	for (int i = 0; i <100; i++)
	{
	
		actions.dragAndDropBy(element, 50, 0).perform();
		Thread.sleep(3000);
		element.sendKeys(Keys.ARROW_RIGHT);	
	}
	for(int i=100;i>0;i--)
	{
		element.sendKeys(Keys.ARROW_LEFT);
	}
	
	
}
}
