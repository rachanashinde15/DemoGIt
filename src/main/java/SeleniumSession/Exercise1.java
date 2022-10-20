package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\racha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://qatechhub.com");
		
		String title = driver.getTitle();
		Assert.assertTrue("QA Automation Tools Trainings and Tutorials1 | QA Tech Hub", false);
			
		
		
		
		
		driver.get("https://www.facebook.com");
		
		driver.navigate().back();
		
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.close();
		

	}

}
