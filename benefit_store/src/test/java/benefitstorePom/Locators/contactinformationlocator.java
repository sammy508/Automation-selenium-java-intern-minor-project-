package benefitstorePom.Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class contactinformationlocator {
    

     WebDriver driver;
    
    public  contactinformationlocator(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    //input[@placeholder='Enter Client Email Address']
    @FindBy(xpath="//input[@id='email']") WebElement enterClientEmailAddress;
    @FindBy(xpath="//input[@placeholder='Enter Street Address']") WebElement enterStreetAddress;
    @FindBy(xpath="//input[@placeholder='Enter Contact Number']") WebElement contactNumber;
    @FindBy(css="body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > section:nth-child(2) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > input:nth-child(2)")
     WebElement enterCitycountry;

    // @FindBy(xpath="//a[normalize-space()='Next']") WebElement nextbutton;
    @FindBy(css=".button-brand.router-link-exact-active.router-link-active") WebElement nextbutton;


    // actions

    public void enteremailfield(String email){
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(driver->enterClientEmailAddress.isDisplayed() && enterClientEmailAddress.isEnabled());
        enterClientEmailAddress.sendKeys(email);

    }
    public void enterContactfield(String phone){
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(driver->enterStreetAddress.isDisplayed() && contactNumber.isEnabled());
        contactNumber.sendKeys(phone);

    }

    public void enterStreetAddress(String street){
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(driver->enterStreetAddress.isDisplayed() && enterStreetAddress.isEnabled());
        enterStreetAddress.sendKeys(street);

    }


    public void enterCountry(String country){
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(driver->enterCitycountry.isDisplayed() && enterCitycountry.isEnabled());
        enterCitycountry.sendKeys(country);

    }

    public void clickNext(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", nextbutton);
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(driver->nextbutton.isDisplayed()&& nextbutton.isEnabled());

        try{
            WebElement Fixedban = driver.findElement(By.id("fixedban"));
            ((JavascriptExecutor)driver).executeScript("argumnets[0].remove();", Fixedban);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        nextbutton.click();
    }

}
