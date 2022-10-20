package StepDefination;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class generallogin {
	WebDriver driver;
	


@Given("user is on login page")
public void user_is_on_login_page() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\racha\\chromedriver_win32\\chromedriver.exe"); 
	driver = new ChromeDriver();
	driver.get("https://wunderflats.com/de/login?redirect=%2Fde");
}

@When("Title of login page is WunderFlats")
public void title_of_login_page_is_wunder_flats() throws InterruptedException {
	String title = driver.getTitle(); 
	System.out.println(title);
	Assert.assertEquals("Wunderflats Anmelden", title); 
	Thread.sleep(30000);
}

@Then("^Enter email \"(.*)\"$") 
public void enter_email(String email) throws InterruptedException {
 
driver.findElement(By.name("email")).sendKeys(email); 
WebElement btn =driver.findElement(By.xpath("//div[contains(@class,'InputWithButton-btnLabel')]"));
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].click()", btn); 
Thread.sleep(30000);
}

@Then("^Enter password \"(.*)\"$") 
public void enter_password(String password) {
		 
//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
}

@Then("Click on login button")
public void click_on_login_button() throws InterruptedException {
	WebElement btn =driver.findElement(By.xpath("//div[contains(@class,'InputWithButton-btnLabel')]"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", btn); 
	Thread.sleep(30000);
	
}

@Then("^User is on homepage$") 
public void user_is_on_homepage() throws Throwable {
 
String title1 = driver.getTitle(); 
System.out.println(title1); 
Assert.assertEquals("Möblierte Wohnungen, Apartments auf Zeit - Über Wunderflats mieten", title1);
Thread.sleep(2000);
  }

@Then("click on language")
public void click_on_language() throws InterruptedException {
    driver.findElement(By.xpath("//div[@class='AppHeader-LanguageDropdown']//button[@type='button' and @class='AppHeader-LanguageDropdownButton']")).click();
    List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class,'AppHeader-LanguageDropdownList AppHeader-DropdownTransition-enter-done')]//li//a//span"));
    System.out.println(list.size());
    
	/*
	 * for(int i=0;i<list.size();i++) { if(list.get(i).getText().equals("English"))
	 * { Thread.sleep(2000); list.get(i).click(); break; } }
	 */
}

@Then("click on Dashborad")
public void click_on_dashborad() {
	
	System.out.println("p");
}

    

@Then("click on create listing")
public void click_on_create_listing() {
    System.out.println("p");
}

@Then("enter the address {string}")
public void enter_the_address(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("click on next")
public void click_on_next() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("user is on edit listing page")
public void user_is_on_edit_listing_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("close the browser")
public void close_the_browser() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

}
