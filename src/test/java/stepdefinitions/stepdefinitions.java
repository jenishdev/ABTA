package stepdefinitions;

 
import java.io.IOException;

import TestComponents.BaseClassTest1;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobject.Landing_page1;
import pageobject.Travellerdetails;
import pageobject.Travellerdetails1;


public class stepdefinitions extends BaseClassTest1 {
	public Landing_page1 lp;
	
	@Given("The user is on the application landing page")
	public void The_user_is_on_the_application_landing_page() throws IOException {
		
		lp = launchapplication1();
		
		
    @When("Enter the traveller details")
    public void Enter_the_traveller_details() {
    	Travellerdetails1 td = new Travellerdetails1(driver);
		td.travallerdetails2();
    	
    	
    }
		
		
	}

	
}
