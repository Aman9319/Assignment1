package BrokenLink;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink2 {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		List<WebElement> alllink = driver.findElements(By.tagName("a"));
		
		System.out.println("Total link :"+alllink.size());
		
		List<WebElement> activeLinks= new ArrayList<>();
		//exclude all the link which does not have href attribute
		for (int i = 0; i < alllink.size(); i++)
		{
			if(alllink.get(i).getAttribute("href")!=null )
			{
				
				activeLinks.add(alllink.get(i));
			}
			
		}
		//get the size of active link
		
		System.out.println("Size of active links"+activeLinks.size());
		
		
		for (int i = 0; i <activeLinks.size(); i++) 
		{
			URL url=new URL(activeLinks.get(i).getAttribute("href"));
			HttpURLConnection  connection = (HttpURLConnection )url.openConnection();
			connection.connect();
			String response=connection.getResponseMessage();
			connection.disconnect();
			
			System.out.println(activeLinks.get(i).getAttribute("href")+"   "+response);
			
		}
		
				
			
			
		}

}
