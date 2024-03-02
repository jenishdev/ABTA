package Abstractcomponents;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class abstractcomponent {
	
	WebDriver driver;
	
	public abstractcomponent(WebDriver driver){
		this.driver= driver;
		
	}
	public void opennewtab(WebElement a)
	{
		
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
    	a.sendKeys(selectLinkOpeninNewTab);
		
	}
	
	
	

	public void switchtotab(int b) {
		
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(newTb.get(b));
	}
	
	public void selectdropdownbyvisibletext(WebElement element, String dropdownselecttext) {
		
		Select Dropdown = new Select(element);
	    Dropdown.selectByVisibleText(dropdownselecttext);
	}
    public void selectdropdownbyindex(WebElement element, int dropdownselecttext) {
		
		Select Dropdown = new Select(element);
	    Dropdown.selectByIndex(dropdownselecttext);
	}
    
    public void dateselection(WebElement element, String date) {
    	List<WebElement> dates = driver.findElements(By.cssSelector("div[class='btn-light ng-star-inserted']"));
    	//int count = driver.findElements(By.cssSelector("div[class='btn-light ng-star-inserted']")).size();
    	int count = dates.size();
    	for(int i=0;i<=count; i++) {
    		String text = driver.findElements(By.cssSelector("div[class='btn-light ng-star-inserted']")).get(i).getText();
            	if(text.equalsIgnoreCase("27"));
            	{
            		driver.findElements(By.cssSelector("div[class='btn-light ng-star-inserted']")).get(i).click();
            		break;
           }    
    	}
    	
    }

}
