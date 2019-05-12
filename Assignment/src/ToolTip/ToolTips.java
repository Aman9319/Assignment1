package ToolTip;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTips 
{
public static void main(String[] args) throws Exception
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.highcharts.com/demo/pie-basic");
	Thread.sleep(2000);
	driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonAccept")).click();
	Thread.sleep(3000);
	List<WebElement> ele = driver.findElements(By.xpath("//*[name()='svg']/descendant::*[name()='g' and @class='highcharts-series-group']/descendant::*[name()='path']"));
	Thread.sleep(2000);
	Actions actions = new Actions(driver);
	Thread.sleep(2000);
	for (int i = 1; i <= ele.size(); i++) 
	{
		
	WebElement pie = driver.findElement(By.xpath("//*[name()='svg']/descendant::*[name()='g' and @class='highcharts-series-group']/descendant::*[name()='path']["+i+"]"));
	actions.moveToElement(pie).perform();
	String toottip = driver.findElement(By.xpath("//*[name()='svg']/descendant::*[name()='g' and @class='highcharts-series-group']/descendant::*[name()='path']["+i+"]/ancestor::*[name()='g']/following-sibling::*[name()='g' and contains(@class,'tooltip')]/descendant::*[name()='text']")).getText();
System.out.println(toottip);
	}
}
}
