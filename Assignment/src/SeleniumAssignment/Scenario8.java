package SeleniumAssignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scenario8 {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		
		String mainMenuXP="//nav[@class='wh-navbar']/descendant::li[contains(@class,'menuparent')]";
		List<WebElement> mainMenu = driver.findElements(By.xpath(mainMenuXP));
		
		for (int i = 0; i < mainMenu.size(); i++) 
		{
			String text = mainMenu.get(i).getText();
			
			System.out.println("Menu "+(i+1)+" : "+text);
		/*String subMenuXp="";
			
			for (int j = 0; j < args.length; j++) {
				
			}*/
		}
		
	}

}
