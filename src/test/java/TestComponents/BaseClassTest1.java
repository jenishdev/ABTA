package TestComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Landing_page;
import pageobject.Landing_page1;

public class BaseClassTest1 {
	public WebDriver driver;
	public Landing_page1 lp;  // create landing page metho
	
	public WebDriver initializeDriver() throws IOException {
		
		
		Properties prop = new Properties();
		FileInputStream Fis = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/resources/GlobalData.properties");
		prop.load(Fis);
		String browsername = prop.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("chrome")) 
		{
		WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
		
	     }
	    else if(browsername.equalsIgnoreCase("firefox"))
	    {
	        //
	    }
	    
	    else if(browsername.equalsIgnoreCase("edge"))
	    {
	    	//
	    }
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    return driver;


}
	
	public String getscreenshot(String testCaseName,WebDriver driver) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir")+"\\reports\\"+ testCaseName + ".png");
		FileUtils.copyFile(src, file);
		return System.getProperty("user.dir")+"\\reports\\"+ testCaseName + ".png";

		}

    @BeforeMethod
    public Landing_page1 launchapplication1() throws IOException {
    	
    	driver = initializeDriver();
    	//Landing_page lp = new Landing_page(driver); we removed Landing_page and creatd a class variable Landing_page lp
    	 lp = new Landing_page1(driver);
		 lp.url();
		 lp.landingapp();
		 lp.accceptcookietravellerdetailspage();
		 return lp;
    }
    
    @BeforeTest
	public void reportsconfiguration() {
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setReportName("ABTA results");
		report.config().setDocumentTitle("Automaton test results");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Tester", "Jenish dev");
		extent.createTest(path);
		
	}
		 
	//@AfterMethod
	//public void closebrowser()
	//{
		
	//	driver.close();
	//}
		 
		 
    	
    	
    }

	

	
