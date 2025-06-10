package samm.selenium;

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



// Without POM
public class FormSubmissionpage{
	
	WebDriver driver;
	String url = "https://qa-enroll-newui.purenroll.com/";
	
	Logger Log = LogManager.getLogger(FormSubmissionpage.class);
	
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
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(22));
		Log.info("From interaction completed");
		//fmsub.
	}
	
	@AfterClass
	void teardown() {
		//driver.close();
	}
}