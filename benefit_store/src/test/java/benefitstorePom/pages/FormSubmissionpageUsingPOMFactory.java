
package benefitstorePom.pages;



import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import benefitstorePom.Locators.FormsubmissionPOMfactory;

// import benefitstorePom.Locators.FormsubmissionPOMfactory;

// Pagefactory wala ko 
public class FormSubmissionpageUsingPOMFactory{
	
	WebDriver driver;
	String url = "https://qa-enroll-newui.purenroll.com/";
	
	Logger Log = LogManager.getLogger(FormSubmissionpageUsingPOMFactory.class);
	@BeforeClass
	
	void setup() {
		driver = new ChromeDriver();
		Log.info("Driver Initialized");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		
		Log.info("Got  URL");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@Test(priority =1)
	void testformsubmission() {
		FormsubmissionPOMfactory fmsub = new FormsubmissionPOMfactory(driver);
		personalinfopage perinfo = new personalinfopage(driver);
		contactinformationpage contact = new contactinformationpage(driver);
		dependentpage depeninfo = new dependentpage(driver);

		dependentchildinfopage child = new dependentchildinfopage(driver);

		fmsub.setZipCode("10010");
		Log.info("ZIPcodeinteraction");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(02));
		
		
		fmsub.setGender("Male");
		Log.info("Gender selection completed");
		
		fmsub.settier("Family");
		Log.info("From Tier set  completed");
		
		fmsub.setDOB("03/01/2002");
		Log.info("DoB set sucessfully");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		fmsub.clickSubmit();
		Log.error(url, fmsub, fmsub, fmsub, fmsub, fmsub, fmsub, fmsub, fmsub, fmsub);
		Log.info("Button clicked sucessfully");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Log.info("From interaction completed");
		

		fmsub.clickMoreinfobutton();
		Log.info("More info clicked");


		fmsub.clickaddtocartbuttton();
		Log.info("Clicked addto cart button");

		fmsub.proceedToCheckoutbutton();
		Log.info("Clicked proceed to checkout button");

		// callin g personal info page

		perinfo.profilepage();
		Log.info("Personal page called");

		// calling Contact 
		contact.contactinformation();
		Log.info("Contact information page called");

		// import annd calling dependent info page spouse

		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		depeninfo.dependentinfo();
		Log.info("Dependent info called");

		// dependent child 
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		child.childinfo();
		Log.info("calling child info ");
	

		
	}
	
	@AfterClass
	void teardown() {
		//driver.close();
	}
}