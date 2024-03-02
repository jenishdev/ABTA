package pageobject;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Abstractcomponents.abstractcomponent;

public class Landing_page1 extends abstractcomponent{
	WebDriver driver;
	public Landing_page1(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
// WebElement ABTAtravelinsurance  =driver.findElement(By.linkText("ABTA Travel Insurance"));
 
 @FindBy(linkText="ABTA Travel Insurance")
 WebElement ABTAtravelinsurance;

 @FindBy(linkText="Get a quote")
 WebElement getquote;
 
 @FindBy(css = "button[id='onetrust-accept-btn-handler']")
 WebElement cookieaccept;
 
 @FindBy(linkText="GET A QUOTE")
 WebElement getquote1;
 
 @FindBy(css="button[id='onetrust-accept-btn-handler']")
 WebElement travellerdetailpagecookieaccept;
 
 @FindBy(css="label[for='eligibility1Yes']")
 WebElement travellerhealtheligibility;
 


    public void landingapp() {
    	
    	ABTAtravelinsurance.click();
    	opennewtab(getquote);
    	switchtotab(1);
	    cookieaccept.click();
	    opennewtab(getquote1);
	    switchtotab(2);
	    
    	
    	
    }
    
    public void landinggetquote() {
    	
    	
    	
    }
    
    public void accceptcookietravellerdetailspage() {
    	travellerdetailpagecookieaccept.click();
    	travellerhealtheligibility.click();
    	
    }
    
    public void url() {
    	
    	driver.get("https://www.abta.com/");
    	driver.manage().window().maximize();
    	
    }
}
