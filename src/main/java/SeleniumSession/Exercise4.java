package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exercise4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\racha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.xpath("//input[@id=\"gh-ac\"]")).sendKeys("iphone 13");
		driver.findElement(By.xpath("//select[@id=\"gh-cat\"]//option")).click();
		
		
		Actions action = new Actions(driver);
		driver.findElement(By.xpath("//select[@id=\"gh-cat\"]")).click();
		
		List<WebElement> list =driver.findElements(By.xpath("//select[@id='gh-cat']//option"));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getText().equals("Antiques")) {
				Thread.sleep(6000);
				list.get(i).click();
				break;
				
			}
				
		}
		
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		
		List<WebElement> list1 = driver.findElements(By.xpath("//div[@id='srp-river-results']//ul//li"));
		for(WebElement product:list1) {
			
			action.moveToElement(product).build().perform();
			System.out.println(product.getText());
		}
		
		
		
		/*
		 * List<WebElement> list = driver.findElements(By.
		 * xpath("//div[contains(@class,'dropdown-menu show')]//a"));
		 * System.out.println(list.size());
		 * 
		 * for(int i=0;i<list.size();i++) { if(list.get(i).getText().equals("JQuery")) {
		 * //Thread.sleep(100); list.get(i).click(); break;
		 * 
		 * }
		 * 
		 * }
		 */

	}

}
