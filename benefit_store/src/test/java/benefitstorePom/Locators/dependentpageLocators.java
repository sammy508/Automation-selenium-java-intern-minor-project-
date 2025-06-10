package benefitstorePom.Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dependentpageLocators {
    WebDriver driver;

    public dependentpageLocators(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
    
    @FindBy(xpath="//form[@id='popups_disable']//input[@placeholder='Enter First Name']") 
    WebElement enterFirstName;
    @FindBy(xpath="//form[@id='popups_disable']//input[contains(@placeholder,'Enter Last Name')]")
     WebElement enterLastName;
    @FindBy(xpath="//form[@id='popups_disable']//input[contains(@placeholder,'Select Date of Birth')]") 
    WebElement selectDateOfBirth;
    @FindBy(xpath="//form[@id='popups_disable']//i[contains(@class,'mx-icon-calendar')]//*[name()='svg']")
     WebElement dateOfBirth;
    @FindBy(xpath="//form[@id='popups_disable']//select[contains(@class,'custom-input')]")
     WebElement selectGenderMaleFemale;
    @FindBy(xpath="//form[@id='popups_disable']//input[contains(@placeholder,'Enter Social Security Number')]") 
    WebElement enterSocialSecurityNumber;
    @FindBy(xpath="//form[@id='popups_disable']//button[@name='button'][normalize-space()='Submit']") 
    WebElement submit;

    @FindBy(xpath="//form[@id='popups_disable']//div[contains(@class,'col-xxl-2 col-xl-2 col-lg-3 col-md-4 col-12')]") 
    WebElement submitbtext;
    // @FindBy(xpath="//input[contains(@placeholder,'Spouse')]") WebElement spouse;
    // @FindBy(xpath="//a[normalize-space()='Save & Continue Later']") WebElement save&ContinueLater;
    @FindBy(xpath="//div[@class='action-next']") WebElement saveContinueLater;
    

     
    
    public void enterfirstname(String firstname){
           try{
            Thread.sleep(100);
        }catch(Exception e){
            System.out.println(e.getMessage());

        }

        new WebDriverWait(driver, Duration.ofSeconds(9))
        .until(driver-> enterFirstName.isDisplayed() && enterFirstName.isEnabled());
        enterFirstName.clear();
        enterFirstName.sendKeys(firstname);
       

    }
     
    public void enterlastname(String lastname){
          try{
            Thread.sleep(100);
        }catch(Exception e){
            System.out.println(e.getMessage());

        }
        new WebDriverWait(driver, Duration.ofSeconds(9))
        .until(driver-> enterLastName.isDisplayed() && enterLastName.isEnabled());
        enterLastName.clear();
        enterLastName.sendKeys(lastname);

    }

       public void enterDOB( String dob){
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(driver-> selectDateOfBirth.isDisplayed() && selectDateOfBirth.isEnabled());
        selectDateOfBirth.click();
        selectDateOfBirth.sendKeys(dob);


    }

    public void selectgender(String value){
         new WebDriverWait(driver, Duration.ofSeconds(5)).until(driver-> selectGenderMaleFemale.isDisplayed() && selectGenderMaleFemale.isEnabled());
         

         new Select(selectGenderMaleFemale).selectByVisibleText(value);
       
    }

    public void enterSSN(String ssnvalue){
         new WebDriverWait(driver, Duration.ofSeconds(5)).until(driver-> enterSocialSecurityNumber.isDisplayed() && enterSocialSecurityNumber.isEnabled());
         enterSocialSecurityNumber.sendKeys(ssnvalue);

    }

    public void ClickSubmitbutton(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", submit);
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(driver->submit.isDisplayed()&& submit.isEnabled());

        try{
            WebElement Fixedban = driver.findElement(By.id("fixedban"));
            ((JavascriptExecutor)driver).executeScript("argumnets[0].remove();", Fixedban);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        submit.click();
    }

    














































}
