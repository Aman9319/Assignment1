package BrokenLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks3 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws Exception
{
 WebDriver driver=new ChromeDriver();
 
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 driver.get("http://www.facebook.com");
   List<WebElement> allLinks = driver.findElements(By.tagName("a"));
   
   System.out.println("Total links"+allLinks.size());
   
   List<WebElement> allActiveLink = new ArrayList<>();
   
   for (int i = 0; i < allLinks.size(); i++)
  {
	  if (allLinks.get(i).getAttribute("href")!=null)
	  {
		  allActiveLink.add(allLinks.get(i));
	  } 	
 }	
   System.out.println("Size of active links"+allActiveLink.size());
   
   for (int i = 0; i < allActiveLink.size(); i++) 
  {
	   try
	   {
		URL url = new URL(allActiveLink.get(i).getAttribute("href"));
		HttpURLConnection connection=(HttpURLConnection)url.openConnection();
		connection.connect();
		String response = connection.getResponseMessage();
		connection.disconnect();
		System.out.println(allActiveLink.get(i).getAttribute("href")+" :"+response);
	} 
	   catch (MalformedURLException e) {
		
		e.printStackTrace();
	}
	
 }
}
}
