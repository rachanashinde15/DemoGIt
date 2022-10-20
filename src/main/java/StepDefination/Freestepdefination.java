package StepDefination;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Freestepdefination {
	WebDriver driver;
	
	
	
	@Given("user is on login")
	public void user_is_on_login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\racha\\chromedriver_win32\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		Thread.sleep(7000);
	    
	}

	@Then("user enters username and password")
	public void user_enters_username_and_password(DataTable cred) throws InterruptedException {
		
		for(Map<String, String> data : cred.asMaps(String.class, String.class)) {
			driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys(data.get("Username"));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys(data.get("password"));
		}
	    
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		Thread.sleep(2000);
		
	    WebElement btn = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", btn);
	}

	@Then("user is on home page")
	public void user_is_on_home_page() throws InterruptedException {
		
		Thread.sleep(2000);
	    String title = driver.getTitle();
	    System.out.println(title);
	}

	@Then("User moves to deal page")
	public void user_moves_to_deal_page() throws InterruptedException {
		
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[@class='item-text' and text()='Deals']"))).build().perform();
		driver.findElement(By.xpath("//span[@class='item-text' and text()='Deals']")).click();
	    driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
	}

	@Then("user fills the details")
	public void user_fills_the_details(DataTable feild) throws InterruptedException {
	    for(Map<String,String> data: feild.asMaps(String.class,String.class)){
	    	
	    	driver.findElement(By.xpath("//input[@name='title']")).sendKeys(data.get("title"));
	    	
	    	driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(data.get("description"));
	    	driver.findElement(By.xpath("//input[@name='amount']")).sendKeys(data.get("amount"));
	    	driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
	    	
	    	Thread.sleep(5000);
	    	Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//span[@class='item-text' and text()='Deals']"))).build().perform();
			driver.findElement(By.xpath("//span[@class='item-text' and text()='Deals']")).click();
		    driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();

	    }
	}
	
	

}
