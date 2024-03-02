package ABT_demo1.ABTA_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import TestComponents.BaseClassTest;
import TestComponents.BaseClassTest1;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Landing_page;
import pageobject.Travellerdetails;
import pageobject.Travellerdetails1;
import pageobject.TripDetails;



public class standalone extends BaseClassTest1{
	
	
	@Test
	public void addtravellers1() throws IOException {
		
		//Landing_page lp = launchapplication(); //Getting the return type Landing_page from launchapplcation()
		Travellerdetails1 td1 = new Travellerdetails1(driver);
		td1.travallerdetails2();
		
	}
		
	//@Test
	//public void tripdetails2() throws IOException,InterruptedException  {
	//TripDetails details1 = new TripDetails(driver);
		//details1.tripdetails1();
	//}	
	//@Test
	//public void tripdetails2() throws IOException,InterruptedException  {
	//	TripDetails details1 = new TripDetails(driver);
		//details1.tripdetails1();
	//}
		
		
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.get("https://www.abta.com/");
		//driver.manage().window().maximize();
		//driver.findElement(By.linkText("ABTA Travel Insurance")).click();
		 //Landing_page lp = new Landing_page(driver);
		 //lp.url();
		// lp.landingapp();
		//String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
		//driver.findElement(By.linkText("Get a quote")).sendKeys(selectLinkOpeninNewTab);
		//ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	     // driver.switchTo().window(newTb.get(1));
	      
	    //driver.findElement(By.cssSelector("button[id='onetrust-accept-btn-handler']")).click();	
	    //String selectLinkOpeninNewTab1 = Keys.chord(Keys.CONTROL,Keys.RETURN); 
	   // driver.findElement(By.linkText("GET A QUOTE")).sendKeys(selectLinkOpeninNewTab1);
	    //ArrayList<String> newTb1 = new ArrayList<String>(driver.getWindowHandles());
	   // driver.switchTo().window(newTb1.get(2));
	    //driver.findElement(By.xpath(//*[text()='Accept All']")).click();
	    //driver.findElement(By.xpath("//*[text()='Yes']")).click();
	    //driver.findElement(By.cssSelector("button[id='onetrust-accept-btn-handler']")).click();	
	   // driver.findElement(By.cssSelector("label[for='eligibility1Yes']")).click();
	    
	    //Entering traveller details
	   // Select TitleDropdown = new Select(driver.findElement(By.cssSelector("select[autocomplete='honorific-prefix']")));
	   // TitleDropdown.selectByVisibleText("Mr");
	    //driver.findElement(By.cssSelector("input[autocomplete='given-name']")).sendKeys("jenish");
	    //driver.findElement(By.cssSelector("input[autocomplete='family-name']")).sendKeys("Dev");
	   // Select date = new Select(driver.findElement(By.cssSelector("select[aria-placeholder='DD']")));
	   // date.selectByIndex(2);
	   // Select month = new Select(driver.findElement(By.xpath("//select[@class='custom-select ng-untouched ng-pristine ng-invalid']")));
	   // month.selectByVisibleText("10");
	   // Select year = new Select(driver.findElement(By.xpath("//div[@class='dob']/select[3]")));
	    //year.selectByVisibleText("1988");
	   // driver.findElement(By.id("postcode")).sendKeys("L1 8JQ"); 
	   // driver.findElement(By.name("address1")).sendKeys("3/273.9");
	    //driver.findElement(By.cssSelector("input[name='address2']")).sendKeys("gurukulam road");)
      //  driver.findElement(By.cssSelector("input[name='address3']")).sendKeys("gurukulam road");
       // driver.findElement(By.name("town")).sendKeys("nagercoil");
       // driver.findElement(By.name("county")).sendKeys("asaripallam");
       // driver.findElement(By.name("email")).sendKeys("jenishdev007@gmail.com");
     //   driver.findElement(By.cssSelector("button[class='btn btn-lg btn-continue ng-star-inserted']")).click();
        //clicking additional travellers no
    //    driver.findElement(By.cssSelector("div[class='form-group btn-toggle'] label[for='addTravellersNo']")).click();
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
        
//Trip End select month and year
        
       // Select datepickeryear1 = new Select(driver.findElement(By.cssSelector("select[title='Select year']")));
       // datepickeryear1.selectByVisibleText("2024");
      //  Select datepickermonth1 = new Select(driver.findElement(By.cssSelector("select[title='Select month']")));
       // datepickermonth1.selectByVisibleText("Dec");
        
      //Trip End date
      //  List<WebElement> dates1 = driver.findElements(By.cssSelector("div[class='btn-light ng-star-inserted']"));
      ///  int count1 = driver.findElements(By.cssSelector("div[class='btn-light ng-star-inserted']")).size();
       // System.out.println(count1);
        //TO select dates
       // for(int i=0;i<count1;i++)
      //  {
        //	String text = driver.findElements(By.cssSelector("div[class='btn-light ng-star-inserted']")).get(i).getText();
        //	if(text.equalsIgnoreCase("25"));
        	//{
        //		driver.findElements(By.cssSelector("div[class='btn-light ng-star-inserted']")).get(i).click();
        	//	break;
       // }   
       // }
        
        //cover for winter sports
       /// driver.findElement(By.cssSelector("label[for='wintersportsYes']")).click();
        //driver.findElement(By.cssSelector("button[class='btn btn-lg btn-continue']")).click();
        //cruise cover
        //driver.findElement(By.xpath("label[@for='cruiseNo']")).click();
       // driver.findElement(By.cssSelector("button[class='btn btn-lg btn-continue']")).click();
        // medical conditions
       // driver.findElement(By.xpath("//label[@for='conditionsNo']")).click();
       // driver.findElement(By.cssSelector("button[class='btn btn-lg btn-continue ng-star-inserted']")).click();
        
               


	private void tripdetailsdate() {
		// TODO Auto-generated method stub
		
	}
	
	}
//}
