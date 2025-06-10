
package samm.selenium;

import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Benefitstore{
	
	// webdriver making it global 
	WebDriver driver;
	String url = "https://qa-enroll-newui.purenroll.com/";
	
	public class FirstTes {
		Logger Log = LogManager.getLogger(FirstTes.class);
		
		@Test(priority =1)  // if we didn't set priority then testng executes test on alphabetical order
		void openapp() {
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
			driver.manage().window().maximize();
		
		}
		
		@Test(priority=2)
		void Formsubmission() {
			System.out.print(" Form Submission  is going on");
			
			driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("10001");
			WebElement genderdropdown = driver.findElement(By.xpath("//select[@id='gender']"));
			
			
			// create select object
			 Select gender = new Select(genderdropdown);
			    gender.selectByVisibleText("Male");
			
			// Choose tier
			    
			    WebElement tierdropdown = driver.findElement(By.xpath("//select[@id='tier']"));
				
				// create select object
				 Select tier = new Select(tierdropdown);
				    tier.selectByVisibleText("Family");
		
		// DOB
			driver.findElement(By.xpath("//input[@placeholder='mm/dd/yyyy']")).sendKeys("01/01/2001");
		
			// Submit Button
			//WebElement button = driver.findElement(By.name("Submit")); not working
			WebElement button = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]"));
			button.click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//Log.info("MOre info clicked ");
			//WebElement moreinfo = driver.findElement(By.partialLinkText(" Solstice PPO Dental 1500"));
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			//moreinfo.click();
			Log.atError();
			
			//sleep
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
//			WebElement moreInfoLink = wait.until(
//			    ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='nextdental' and contains(@class, 'more check-btn') and text()='More Info'][1]"))
//			);
//			System.out.print(moreInfoLink.isDisplayed());
//			moreInfoLink.click();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
//			WebElement element = driver.findElement(By.xpath("(//a[@id='nextdental'])[2]"));
//			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
////			Thread.sleep(500); // optional: wait for scroll animation
//
//			element.click();

			WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));

			WebElement moreInfo = waits.until(ExpectedConditions.elementToBeClickable(
			    By.xpath("//div[contains(@class, 'more') and contains(@class, 'check-btn')]//a[normalize-space(text())='More Info']\r\n"
			    		+ "")
			));

			moreInfo.click();






			
			 
		} // form submission ending
		
		
		
		@AfterClass
		void Logout() {
			//driver.close();
		
			// collectively generated from css selector hub
			//
//findElement(By.xpath("//a[normalize-space()='Home']"))
//findElement(By.xpath("//div[@class='main_wrapper product_list cart_page agent_landing plan_details informations']"))
//findElement(By.xpath("//input[@id='zip']"))
//findElement(By.xpath("//input[@placeholder='mm/dd/yyyy']"))
//findElement(By.xpath("//select[@id='tier']"))
//findElement(By.xpath("//select[@id='gender']"))
			
		}
	}
}