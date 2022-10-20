package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\racha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("List size is "+list.size());
		
		List<WebElement> link = new ArrayList<WebElement>();
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getAttribute("href"));
		}
		
		
		

	}

}
