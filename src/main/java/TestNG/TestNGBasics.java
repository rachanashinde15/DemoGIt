package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	@BeforeSuite
	public void setUp() {
		System.out.println("Setup the property for chrome");
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("Launch Browser");
		
	}
	
	@BeforeClass
	public void enterUrl() {
		System.out.println("Enter The URL");
		
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("Login Details");
		
	}
	
	@Test
	public void googleTitleTest() {
		System.out.println("Title");
		
	}
	
	@AfterMethod()
	public void logout() {
		System.out.println("Logout from app");
		
	}
	
	@AfterTest
	public void deleteCode(){
		System.out.println("Delete cookies");	
		
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Brwoser");
	}
	
	

}
