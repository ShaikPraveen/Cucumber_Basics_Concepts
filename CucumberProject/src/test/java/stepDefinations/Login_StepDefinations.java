package stepDefinations;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Login_StepDefinations
{
	
	public static WebDriver driver;
	
	@Given("^Open Browser$")
	public void open_Browser() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Praveen_Automation\\Browser_Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    
	}

	@When("^Enter the URL \"([^\"]*)\"$")
	public void enter_the_URL(String url) throws Throwable
	{
		driver.get(url); 
	}

	@When("^Click on My Account Link$")
	public void click_on_My_Account_Link() throws Throwable
	{
		driver.findElement(By.linkText("My Account")).click();   
	}

	/*@And("^Enter Register Username and Password$")
	public void enter_Register_Username_and_Password() throws Throwable 
	{
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("pavanoltraining@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test@selenium123");    
	}*/
	
	
	/*@When("^Enter Register Username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void enter_Register_Username_and_password(String un, String pwd) throws Throwable {
	    
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);    
	}
*/
	//Login With Data Table with Single Input
	/*@When("^Enter Registered Username and password$")
	public void enter_Registered_Username_and_password(DataTable credentials) throws Throwable
	{
		List <List<String>> data=credentials.raw();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(data.get(0).get(0));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(data.get(0).get(1));  
	}*/
	
	
	//Login With Data table with Header
	@When("^Enter Registered Username and password$")
	public void enter_Registered_Username_and_password(DataTable credentials) throws Throwable
	{
		List <Map<String,String>> data=credentials.asMaps(String.class, String.class);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(data.get(0).get("username"));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(data.get(0).get("password"));  
	}
	
	

	@And("^Click on Login button$")
	public void click_on_Login_button() throws Throwable 
	{
		driver.findElement(By.xpath("//input[contains(@value,'Login')]")).click();   
	}
	
	@Then("^User Successfully Login into the webpage$")
	public void user_Successfully_Login_into_the_webpage() throws Throwable 
	{
	  String text= driver.findElement(By.xpath("//div[@class='woocommerce-MyAccount-content']//p[1]")).getText();
	  
	  Assert.assertEquals(true, text.contains("pavanoltraining"));  
	  
	  driver.close();
	}
	
	
	@Then("^Verify Login$")
	public void verify_Login() throws Throwable
	{
		String text=driver.findElement(By.xpath("//*[@id='page-36']/div/div[1]/ul/li/strong[1] ")).getText();
		if (text.contains("ERROR")) 
		{
		   Assert.assertTrue("INVALID - INPUT, ERROR PAGE ", true);
		 
			
		} else 
		{
			Assert.assertTrue(false);
		}
	}
	
	@Then("^close the broser$")
	public void close_the_broser() throws Throwable
	{
		driver.close();
	    
	}

	
}
