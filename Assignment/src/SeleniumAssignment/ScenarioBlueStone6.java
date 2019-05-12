package SeleniumAssignment;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;



public class ScenarioBlueStone6
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
		WebElement rings = driver.findElement(By.xpath("//div[@class='container']/descendant::a[contains(text(),'Rings ')]"));
		Actions action =new Actions(driver);
		action.moveToElement(rings).perform();
		WebElement diamond = driver.findElement(By.xpath("//div[@class='container']/descendant::a[contains(text(),'Rings ')]/following-sibling::div[@class='wh-submenu medium-width']/descendant::a[text()='Diamond']"));
		action.moveToElement(diamond).click().perform();
		String text="";
		String text1="";
		List<WebElement> price = driver.findElements(By.xpath("//div[@id='columns']/descendant::div[@id='grid-view-result']/descendant::ul[@id='product_list_ui']/descendant::span[@class='new-price']"));
		for (int i = 0; i <price.size(); i++) 
		{
			 text = price.get(i).getText();
			System.out.println(text);
			
		}
		WebElement popular = driver.findElement(By.xpath("//span[@class='view-by-wrap title style-outline i-right']"));
		action.moveToElement(popular).perform();
		
		driver.findElement(By.xpath("//a[text()='Price Low to High ']")).click();
		Set set=new TreeSet();
		
		List<WebElement> price1 = driver.findElements(By.xpath("//div[@id='columns']/descendant::div[@id='grid-view-result']/descendant::ul[@id='product_list_ui']/descendant::span[@class='new-price']"));
		for (int i = 0; i <price1.size(); i++) 
		{
			 text1 = price1.get(i).getText();
			System.out.println(text1);
			set.add(text1);
			
		}
		
		SoftAssert asser=new SoftAssert();
		asser.assertEquals(text, text1);
		
	//Assert.assertEquals(text, text1);
	
	if(set.equals(text1))
	{
		System.out.println("both are equals");
	}
	
	
	
	
		
}       
}
