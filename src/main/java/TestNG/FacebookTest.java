package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class FacebookTest {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\racha\\chromedriver_win32\\chromedriver.exe");// Setting chrome driver property
		driver = new ChromeDriver(); //adding chrome driver
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test
	public void logo() {
		boolean b = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		
	}
	
	@Test
	public void mailLinkTest() {
		boolean b = driver.findElement(By.xpath("//a[@class='_8esh']")).isDisplayed();
	}
	
	@AfterMethod
	public void shutDown() {
		driver.quit();
	}

}
