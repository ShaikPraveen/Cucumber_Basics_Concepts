package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hooks_stepDefinations 
{
	@Before
	public void setUP()
	{
		System.out.println("LAUNCH THE APPLICATION IN CHROME BROWSER");
		System.out.println("NAVIGATE TO URL");
	}
	
	
	
	@Given("^User is on Register Page$")
	public void user_is_on_Register_Page() throws Throwable
	{
		System.out.println(" USER IS ON REGISTER PAGE");
	    
	}

	@When("^User enters details$")
	public void user_enters_details() throws Throwable 
	{
		System.out.println("USER ENTERS HIS DETAILS");
	    
	}

	@Then("^User added$")
	public void user_added() throws Throwable 
	{
		System.out.println("USER ADDED SUCCESSFULLY");
	   
	}

	@Given("^User is on Edit Page$")
	public void user_is_on_Edit_Page() throws Throwable 
	{
		System.out.println("USER IS ON EDIT PAGE");
	    
	}

	@When("^User enters the new details$")
	public void user_enters_the_new_details() throws Throwable 
	{
		System.out.println("USER ENTERS NEW DETAILS");
	   
	}

	@Then("^User is edited details$")
	public void user_is_edited_details() throws Throwable
	{
		System.out.println("USER EDITED HIS DETAILS SUCCESSFULLY");
	   
	}

	@Given("^User is on Delete page$")
	public void user_is_on_Delete_page() throws Throwable
	{
		System.out.println("USER IS ON DELETE PAGE");
	    
	}

	@When("^user deletes the page$")
	public void user_deletes_the_page() throws Throwable
	{
		System.out.println("USER DELETE HIS PAGE");
	    
	}

	@Then("^user is deleted$")
	public void user_is_deleted() throws Throwable
	{
		System.out.println("USER DELETED SUCCSSFULLY");   
	}
	
	@After
	public void tearDown()
	{
		System.out.println("CLOSED BROWSER");
	}
}
