package SeleniumAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScenarioBlueStone7 {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		WebElement allJewellary = driver.findElement(By.xpath("//div[@class='container']/descendant::li[@class='menuparent']/a[contains(text(),'All Jewellery ')]"));
		Actions action =new Actions(driver);
		action.moveToElement(allJewellary).perform();
		driver.findElement(By.xpath("//div[@class='container']/descendant::li[@class='menuparent']/a[contains(text(),'All Jewellery ')]/following-sibling::div[@class='wh-submenu new-column']/descendant::li[@class='active']/span[text()='Kadas']")).click();
		driver.findElement(By.xpath("//ul[@id='product_list_ui']/descendant::li[@class='col-xs-4 three-column-browse' and @data-position='1']")).click();
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		String text = driver.findElement(By.xpath("//div[@class='formErrorContent']")).getText();
		if(text.equalsIgnoreCase("* This field is required"))
		{
			System.out.println("error message is displaying");
		}
		else
		{
			System.out.println("error message is not displaying");
		}
		
		
		
		
}
}
