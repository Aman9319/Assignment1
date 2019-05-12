package BrokenLink;

import java.awt.List;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink 
{
	
 
	public static void main(String[] args) 
	{
    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://www.facebook.com");
         java.util.List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links : "+allLinks.size());
        for (int i = 0; i < allLinks.size() ; i++) {
            WebElement link = allLinks.get(i);
            String url=link.getAttribute("href");
            verifyLinks(url);
        }
        driver.close();
    }

    private static void verifyLinks(String linkUrl) {
        
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection httpUrlConnect = (HttpURLConnection) url.openConnection();
            httpUrlConnect.setConnectTimeout(5000);
            httpUrlConnect.connect();
            if (httpUrlConnect.getResponseCode()==200) {
                System.out.println(linkUrl+" - "+httpUrlConnect.getResponseMessage());
            }
            if (httpUrlConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
                System.out.println(linkUrl+" - "+httpUrlConnect.getResponseMessage()+" - "+HttpURLConnection.HTTP_NOT_FOUND);
            }            
        } catch (Exception e) {
            
        }
}
}
