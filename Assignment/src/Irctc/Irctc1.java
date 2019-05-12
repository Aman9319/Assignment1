package Irctc;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Irctc1
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.findElement(By.xpath("//a[contains(text(),' FLIGHTS ')]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String str : windowHandles) 
		{
			driver.switchTo().window(str);
		}
		Thread.sleep(2000);
		WebElement rtrip = driver.findElement(By.xpath("//span[contains(text(),'Round Trip ')]"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(rtrip));
		rtrip.click();
		driver.findElement(By.xpath("//input[@id = 'from']")).sendKeys("Mumbai");
		Thread.sleep(2000);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id = 'to']")).sendKeys("Bengaluru");
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		
		LocalDate ld = LocalDate.now();
		
		//departure date
		LocalDate plus = ld.plusDays(15);
		String year = Integer.toString(plus.getYear());
		String month = getMonth(plus);
		String day = Integer.toString(plus.getDayOfMonth());
		
		Thread.sleep(2000);
		WebElement monthYear = driver.findElement(By.xpath("//div[@class='date-table-right']/descendant::span[contains(text(),'"+month+"')]/following-sibling::sub[contains(text(),'"+year+"')]"));
		monthYear.click();
		WebElement date = driver.findElement(By.xpath("//table[@class='date-table']/tbody/tr/td/span[contains(text(),'"+day+"')]"));
		date.click();
		
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		//return date
		LocalDate returnDate = plus.plusDays(15);
		String ryear = Integer.toString(returnDate.getYear());
		String rmonth = getMonth(returnDate);
		String rday = Integer.toString(returnDate.getDayOfMonth());
		
		
		Thread.sleep(2000);
		WebElement rmonthYear = driver.findElement(By.xpath("(//div[@class='date-table-right']/descendant::span[contains(text(),'"+rmonth+"')]/following-sibling::sub[contains(text(),'"+ryear+"')])[2]"));
		rmonthYear.click();
		Thread.sleep(2000);
		WebElement rdate = driver.findElement(By.xpath("(//table[@class='date-table']/tbody/tr/td/span[contains(text(),'"+rday+"')])[2]"));
		rdate.click();
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		
	}

	private static String getMonth(LocalDate date) 
	{
		String month = date.getMonth().toString().substring(0, 3);
		String str1 = month.substring(1);
		String str2 = str1.toLowerCase();
		String mon = month.substring(0, 1).concat(str2);
		return mon;
		
	}
}
