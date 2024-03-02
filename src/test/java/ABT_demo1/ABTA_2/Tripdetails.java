package ABT_demo1.ABTA_2;

import java.io.IOException;

import org.testng.annotations.Test;

import TestComponents.BaseClassTest;
import TestComponents.Retry;
import pageobject.TripDetails;

public class Tripdetails extends BaseClassTest {
	
	
	@Test(retryAnalyzer=Retry.class)
	public void tripdetails2() throws IOException,InterruptedException  {
	TripDetails details1 = new TripDetails(driver);
		details1.tripdetails1();
	}

}
