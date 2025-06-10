
package benefitstorePom.Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormsubmissionPOMfactory{
	
	WebDriver driver;
	
	public FormsubmissionPOMfactory(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver,this);
	}
	
		// Actions
		
		@FindBy(xpath ="//input[@id='zip']" ) WebElement zipcode;
		@FindBy(xpath ="//select[@id='gender']" ) WebElement Gender;
		@FindBy(xpath = "//select[@id='tier']" ) WebElement Tier;
		@FindBy(xpath = "//input[@placeholder='mm/dd/yyyy']" ) WebElement DOB;
		@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]" ) WebElement submitbtn;

		// more info linktext
		@FindBy(xpath="//body/div[@id='app']/div[@class='main_wrapper product_list cart_page agent_landing plan_details informations']/section[@class='content_container']/section[@class='innerpage-wrap']/div[@class='container']/div[@class='plansGrid-wrap']/div[@id='dental']/div[@class='row']/div[1]/div[1]/a[1]")
		 WebElement moreInfo;
		
		 // Add to cart Button 
		 @FindBy(xpath="//div[@class='pd_listing m_prod mb-4']//button[@id='addCart']")
		  WebElement addToCart;

		// proceed to checkout page
		@FindBy(xpath="//a[normalize-space()='Proceed to Checkout']")
		WebElement proceedToCheckout;

		@FindBy(xpath="//button[@id='beginEnroll']") WebElement proceedToEnrollment;

		
		public void setZipCode(String zip) {
//			driver.findElement(zipcode).sendKeys(zip);  without using page factory
			zipcode.sendKeys(zip);
		}
		
		public void setGender(String gender) {
			
			new Select(Gender).selectByVisibleText(gender);
		}
		
		public void settier(String tier) {
			
			new Select (Tier).selectByVisibleText(tier);
		}
		
		public void setDOB(String dob) {
			DOB.sendKeys(dob);
		}
		
		public void clickSubmit() {
		//WebElement button =	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]"));
		submitbtn.click();
			
		}

		  public void clickMoreinfobutton(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", moreInfo);

        try{
            WebElement fixedban = driver.findElement(By.id("fixedban"));
            ((JavascriptExecutor)driver).executeScript("arguments[0].remove();",fixedban);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        new WebDriverWait(driver, Duration.ofSeconds(9)).until(driver->moreInfo.isDisplayed() && moreInfo.isEnabled());
       moreInfo.click();
    }

	// Add to cart button method

	public void clickaddtocartbuttton(){
		
		new WebDriverWait(driver, Duration.ofSeconds(6)).until(driver->addToCart.isDisplayed()&& addToCart.isEnabled());
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", addToCart);

		 try{
            WebElement fixedban = driver.findElement(By.id("fixedban"));
            ((JavascriptExecutor)driver).executeScript("arguments[0].remove();",fixedban);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

		
	
		addToCart.click();
	}

	// click proceed to checkout pag 

	public void proceedToCheckoutbutton(){

		
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", proceedToCheckout);
		proceedToCheckout.click();

		 try{
            WebElement fixedban = driver.findElement(By.id("fixedban"));
            ((JavascriptExecutor)driver).executeScript("arguments[0].remove();",fixedban);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

		// Alert alert = driver.switchTo().alert();
		// alert.accept();
		
		// This means it's a custom modal, not a JavaScript alert.?
		// Thats why switch.alert() is not working here. Switch.alert only works on js popups

	
		
		// new WebDriverWait(driver, Duration.ofSeconds(10)).until(
		// 	ExpectedConditions.invisibilityOfElementLocated(By.className("thank_you")));
		// proceedToEnrollment.click();

			System.out.println("fine till here popups");

		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOfElementLocated(By.id("cart_confirmation_page")));
		 try{
            WebElement fixedban = driver.findElement(By.id("fixedban"));
            ((JavascriptExecutor)driver).executeScript("arguments[0].remove();",fixedban);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
		

		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable((proceedToEnrollment))).click();
		System.out.println("fine till here");


	}






		


	
}		
