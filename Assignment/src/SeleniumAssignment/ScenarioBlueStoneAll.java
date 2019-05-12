package SeleniumAssignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScenarioBlueStoneAll 
{
	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.bluestone.com/");
	//move cursor to all jwellery
	Actions action =new Actions(driver);
	List<WebElement> submenu = driver.findElements(By.xpath("//div[@class='container']/descendant::li[contains(@class,'menuparent')]/a"));
	
}
}
