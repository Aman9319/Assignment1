package Selenium_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario11 
{
	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

public static void main(String[] args) throws Exception 
{
	//Open browser
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	//Enter URL(bluestone)
	driver.get("https://www.bluestone.com/");
	//scroll upto some axis
	//check whether top icon  is displayed or not
	//if it displayed click on it
	//close browser
    }

}
