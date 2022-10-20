package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class FaceBookLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\racha\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.fb.com");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		Assert.assertEquals("https://www.facebook.com/", url);
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//a[text()='Create new account' ]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("rachana");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("shinde");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9819943781");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Rachana@123");
		
		driver.findElement(By.xpath("//select[@name='birthday_month']")).click();
		
		
		  List<WebElement> list = driver.findElements(By.xpath("//select[@name='birthday_month']//option"));
		  System.out.println(list.size());
		  
		  
		  for(int i =0;i<list.size();i++) {
			  if(list.get(i).getText().equals("Mar")) {
				  list.get(i).click();
				  break;
			  }
		  }
		 
		  
		  List<WebElement> list1 = driver.findElements(By.xpath("//select[@name='birthday_day']//option"));
		  System.out.println(list1.size());
		  
		  
		  for(int i =0;i<list1.size();i++) {
			  if(list1.get(i).getText().equals("15")) {
				  list1.get(i).click();
				  break;
			  }
		  }
		  
		  List<WebElement> list2 = driver.findElements(By.xpath("//select[@name='birthday_year']//option"));
		  System.out.println(list2.size());
		  
		  
		  for(int i =0;i<list2.size();i++) {
			  if(list2.get(i).getText().equals("1997")) {
				  list2.get(i).click();
				  break;
			  }
		  }
		
		WebElement radio = driver.findElement(By.id("u_10_4_Yn"));
		radio.click();
		
		
		
		
		
		
		
		
		
		
	}

}
