package SeleniumSession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class calenderselecttestclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\racha\\chromedriver_win32\\chromedriver.exe");// Setting chrome driver property
		WebDriver driver = new ChromeDriver(); //adding chrome drivet
		
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); //delete the cookies
		
		//driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://ui.cogmento.com/");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("rachanashinde04@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("Rachana@123");
	
		
		  WebElement btn = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click();", btn);
		  
		  Actions action = new Actions(driver);
		  action.moveToElement(driver.findElement(By.xpath("//span[@class='item-text' and text()='Calendar']"))).build().perform(); 
		  driver.findElement(By.xpath("//span[@class='item-text' and text()='Calendar']")).click();
		  
		  
		  String monthval = driver.findElement(By.className("rbc-toolbar-label")).getText();
		  System.out.println(monthval);
		  
		  String month = monthval.split(" ")[0].trim();
		  String year = monthval.split(" ")[1].trim();
		  
		  while((month.equals("December") && year.equals("2022"))){
			  driver.findElement(By.xpath("//i[@class='chevron right icon']")).click();
			  
			  monthval = driver.findElement(By.className("rbc-toolbar-label")).getText();
			  System.out.println(monthval);
			  
			  month = monthval.split(" ")[0].trim();
			  year = monthval.split(" ")[1].trim();	  
		  }
		  driver.findElement(By.xpath("//a[text()='13']")).click();
		  
		
		  

	}
	

}
