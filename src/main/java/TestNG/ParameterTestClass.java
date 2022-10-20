package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestClass {

	
	WebDriver driver;
	
	@Test
	@Parameters({"url","email","password"})
	public void logintest(String url, String email,String password) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\racha\\chromedriver_win32\\chromedriver.exe");// Setting chrome driver property
		driver = new ChromeDriver(); //adding chrome driver
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		
		
		driver.findElement(By.id("login1")).clear();
		driver.findElement(By.id("login1")).sendKeys(email);
		
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.name("proceed")).click();
		
	}
	
	
	
}
