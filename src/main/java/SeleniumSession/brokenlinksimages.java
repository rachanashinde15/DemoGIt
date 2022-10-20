package SeleniumSession;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinksimages {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\racha\\chromedriver_win32\\chromedriver.exe");// Setting chrome driver property
		WebDriver driver = new ChromeDriver(); //adding chrome drivet
		
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); //delete the cookies
		
		//driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://makemysushi.com/sushi-recipes");
		Thread.sleep(5000);

		/*
		 * driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys(
		 * "rachanashinde04@gmail.com"); Thread.sleep(5000);
		 * driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys(
		 * "Rachana@123");
		 * 
		 * WebElement btn = driver.findElement(By.
		 * xpath("//div[@class='ui fluid large blue submit button']"));
		 * JavascriptExecutor js = (JavascriptExecutor)driver;
		 * js.executeScript("arguments[0].click();", btn);
		 */
		
		
	
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		linklist.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("Size of listed links and images"+linklist.size());
		
		
		List<WebElement> activelinks = new ArrayList<WebElement>();
		
		// iterate linklist : exclude all the links/images does not have href
		
		for(int i=0;i<linklist.size();i++) {
			System.out.println(linklist.get(i).getAttribute("href"));
			if(linklist.get(i).getAttribute("href") != null) {
				activelinks.add(linklist.get(i));
			}
		}
		
		//get size of active links
		
		System.out.println("Number of active links"+activelinks.size());
		
		//check the href url.with httpconnection api
		for(int j=0;j<activelinks.size();j++) {
		
		
		HttpURLConnection connection = (HttpURLConnection) new URL(activelinks.get(j).getAttribute("href")).openConnection();
		connection.connect();
		String response = connection.getResponseMessage();
		connection.disconnect();
		
		System.out.println(activelinks.get(j).getAttribute("href") +"--->"+response);
		}
		
		
		

	}

}
