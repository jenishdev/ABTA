package pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Abstractcomponents.abstractcomponent;

public class TripDetails extends abstractcomponent {
	WebDriver driver;
	
	public TripDetails(WebDriver driver) {
		super(driver);
		this.driver = driver;	
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(css="div[class='form-group btn-toggle'] label[for='addTravellersNo']")
	WebElement additionaltravellersno;
	@FindBy(css="button[class='btn btn-lg btn-continue ng-star-inserted']")
	WebElement continuebutton;
	@FindBy(css="label[for='triptypeSingle']")
	WebElement triptypesingle;
	@FindBy(css="label[for='France']")
	WebElement countryselection;
	@FindBy(xpath="//div[@class='input-group-append']/button[1]")
	WebElement calenderclick;
	@FindBy(css="select[title='Select year']")
	WebElement tripstartyear;
	@FindBy(css="select[title='Select month']")
	WebElement tripstartmonth;
	@FindBy(css="div[class='btn-light ng-star-inserted']")
	WebElement tripdate;
	
	
	public void tripdetails1() {
	additionaltravellersno.click();
	continuebutton.click();
	triptypesingle.click();
	countryselection.click();
	calenderclick.click();
	selectdropdownbyvisibletext(tripstartyear,"2024");
	selectdropdownbyvisibletext(tripstartmonth,"Nov");
	dateselection(tripdate, "27");
	
}
}


    


//driver.findElement(By.cssSelector("div[class='form-group btn-toggle'] label[for='addTravellersNo']")).click();
//   driver.findElement(By.cssSelector("button[class='btn btn-lg btn-continue ng-star-inserted']")).click();
   //policy type single
//   driver.findElement(By.cssSelector("label[for='triptypeSingle']")).click();
 //  driver.findElement(By.cssSelector("label[for='France']")).click();
//   //driver.findElement(By.cssSelector("input[name='tripStDate']")).sendKeys("01 12 2023");
   //calender click
 //  driver.findElement(By.xpath("//div[@class='input-group-append']/button[1]")).click();
   //Trip select month and year
   
  // Select datepickeryear = new Select(driver.findElement(By.cssSelector("select[title='Select year']")));
 //  datepickeryear.selectByVisibleText("2024");
 //  Select datepickermonth = new Select(driver.findElement(By.cssSelector("select[title='Select month']")));
 //  datepickermonth.selectByVisibleText("Nov");		
   //Trip start date
//   List<WebElement> dates = driver.findElements(By.cssSelector("div[class='btn-light ng-star-inserted']"));
//   int count = driver.findElements(By.cssSelector("div[class='btn-light ng-star-inserted']")).size();
 //  System.out.println(count);
   //TO select dates
//   for(int i=0;i<count;i++)
 //  {
//   	String text = driver.findElements(By.cssSelector("div[class='btn-light ng-star-inserted']")).get(i).getText();
   //	if(text.equalsIgnoreCase("27"));
   //	{
   	//	driver.findElements(By.cssSelector("div[class='btn-light ng-star-inserted']")).get(i).click();
   	//	break;
//   }    
   
//}
   
 //  driver.findElement(By.xpath("//div[@class='form-row']//div[2]//div[1]//div[1]//button[1]")).click();