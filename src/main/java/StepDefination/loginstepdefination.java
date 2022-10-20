/*
 * package StepDefination;
 * 
 * 
 * import java.util.concurrent.TimeUnit;
 * 
 * import org.junit.Assert; import org.openqa.selenium.By; import
 * org.openqa.selenium.JavascriptExecutor; import org.openqa.selenium.WebDriver;
 * import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import io.cucumber.java.en.Given; import io.cucumber.java.en.Then; import
 * io.cucumber.java.en.When;
 * 
 * 
 * 
 * public class loginstepdefination {
 * 
 * WebDriver driver;
 * 
 * @Given("user is on login page") public void user_is_on_login_page() {
 * 
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Users\\racha\\chromedriver_win32\\chromedriver.exe"); driver = new
 * ChromeDriver();
 * driver.get("https://wunderflats.com/de/login?redirect=%2Fde");
 * 
 * }
 * 
 * 
 * @When("^Title of login page is WunderFlats$") public void
 * title_of_login_page_is_WunderFlats() throws InterruptedException {
 * 
 * String title = driver.getTitle(); System.out.println(title);
 * Assert.assertEquals("Wunderflats Anmelden", title); Thread.sleep(30000);
 * 
 * 
 * 
 * } //\"(.*)\"
 * 
 * 
 * @Then("^Enter email \"(.*)\"$") public void enter_email(String email) throws
 * InterruptedException {
 * 
 * 
 * driver.findElement(By.name("email")).sendKeys(email); WebElement btn =
 * driver.findElement(By.xpath(
 * "//div[contains(@class,'InputWithButton-btnLabel')]"));
 * 
 * JavascriptExecutor js = (JavascriptExecutor)driver;
 * js.executeScript("arguments[0].click()", btn); Thread.sleep(30000);
 * 
 * }
 * 
 * @Then("^Enter password \"(.*)\"$") public void enter_password(String
 * password) {
 * 
 * 
 * //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
 * driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
 * 
 * 
 * 
 * }
 * 
 * @Then("^Click on login button$") public void click_on_login_button() throws
 * Throwable { WebElement btn = driver.findElement(By.xpath(
 * "//div[contains(@class,'InputWithButton-btnLabel')]"));
 * 
 * JavascriptExecutor js = (JavascriptExecutor)driver;
 * js.executeScript("arguments[0].click()", btn); Thread.sleep(2000);
 * 
 * 
 * }
 * 
 * @Then("^User is on homepage$") public void user_is_on_homepage() throws
 * Throwable {
 * 
 * 
 * String title1 = driver.getTitle(); System.out.println(title1); Assert.
 * assertEquals("Möblierte Wohnungen, Apartments auf Zeit - Über Wunderflats mieten"
 * , title1);
 * 
 * 
 * 
 * }
 * 
 * @Then("close the browser") public void close_the_browser() { driver.quit(); }
 * 
 * 
 * }
 */