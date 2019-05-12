package SeleniumAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ScenarioBluestone8 {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception 
	{
	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		//move cursor to all jwellery
		Actions action =new Actions(driver);
		WebElement allJewellary = driver.findElement(By.xpath("//div[@class='container']/descendant::li[@class='menuparent']/a[contains(text(),'All Jewellery ')]"));
		
		action.moveToElement(allJewellary).perform();
		Thread.sleep(3000);
		//select kadas and click on it
		
		////div[@class='container']/descendant::li[@class='menuparent']/a[contains(text(),'All Jewellery ')]/following-sibling::div[@class='wh-submenu new-column']/descendant::/span[text()='Kadas']
		// WebElement kadas = 
				 driver.findElement(By.xpath("//div[@class='container']/descendant::li[@class='menuparent']/a[contains(text(),'All Jewellery ')]/following-sibling::div[@class='wh-submenu new-column']/descendant::span[text()='Kadas']")).click();
		//action.moveToElement(kadas).click().perform();;
		
		//select any kadas
		driver.findElement(By.xpath("//ul[@id='product_list_ui']/descendant::li[@class='col-xs-4 three-column-browse' and @data-position='1']")).click();
		
		//select Bangle size
		WebElement bangle = driver.findElement(By.xpath("//select[@id='ringselect']"));
		Select select=new Select(bangle);
		
		select.selectByValue("value");
		//click on bye now
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		//capture size and compare
		String text1 = driver.findElement(By.xpath("//li[@class='bag-item shadow-box bangles item-1']/descendant::strong[text()='2-2(2 2/16\")']")).getText();
		
		
}
}
