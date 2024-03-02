package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Abstractcomponents.abstractcomponent;

public class Travellerdetails1 extends abstractcomponent {
	WebDriver driver;
	public Travellerdetails1(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}

	@FindBy(css="select[autocomplete='honorific-prefix']")
	WebElement prefix;
	@FindBy(css="input[autocomplete='given-name']")
	WebElement name;
	@FindBy(css="input[autocomplete='family-name']")
	WebElement familyname;
	@FindBy(css="select[aria-placeholder='DD']")
	WebElement date;
	@FindBy(xpath="//select[@class='custom-select ng-untouched ng-pristine ng-invalid']")
	WebElement month;
	@FindBy(xpath="//div[@class='dob']/select[3]")
	WebElement year;
	@FindBy(id="postcode")
	WebElement postcode;
	@FindBy(name="address1")
	WebElement address;
	@FindBy(css="input[name='address3']")
	WebElement address3;
	@FindBy(name="town")
	WebElement town;
	@FindBy(name="county")
	WebElement county;
	@FindBy(name="email")
	WebElement email;
	@FindBy(css="button[class='btn btn-lg btn-continue ng-star-inserted']")
	WebElement continuebutton;


     public void travallerdetails2() {
	  
        selectdropdownbyvisibletext(prefix, "Mr");
        name.sendKeys("jenish");
        familyname.sendKeys("dev");
        selectdropdownbyindex(date,2);
        selectdropdownbyvisibletext(month, "10");
        selectdropdownbyvisibletext(year, "1988");
        postcode.sendKeys("L1 8JQ");
        address.sendKeys("3/273.9");
        address3.sendKeys("gurukulam road");
        town.sendKeys("nagercoil");
        county.sendKeys("asaripallam");
        email.sendKeys("jenishdev007@gmail.com");
        continuebutton.click();
	  
  }
  }