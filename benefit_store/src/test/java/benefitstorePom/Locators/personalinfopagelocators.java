package benefitstorePom.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class personalinfopagelocators {
    
    WebDriver driver;
    
    public  personalinfopagelocators(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    // actions (Locators of the components of personal info page)

    
@FindBy(xpath="//input[@id='fname']") WebElement enterFirstName;
@FindBy(xpath="//input[@id='Lname']") WebElement enterLastName;
@FindBy(xpath="//select[@id='marital_status']") WebElement selectMaritalStatusSingleMar;
@FindBy(xpath="//input[@id='ssn']") WebElement enterSSNNumber;
@FindBy(css="#savePersonal") WebElement  next;


// perform actions on elements

public void setfirstname(String firstname){
    new WebDriverWait(driver, Duration.ofSeconds(5)).until(driver->enterFirstName.isDisplayed()&&enterFirstName.isEnabled());
    enterFirstName.sendKeys(firstname);
}

// lastname
public void setlastname(String lastname){
    new WebDriverWait(driver, Duration.ofSeconds(5)).until(driver->enterLastName.isDisplayed()&&enterLastName.isEnabled());
    enterLastName.sendKeys(lastname);
}

public void setSSNnumber(String ssnNumber){
    new WebDriverWait(driver, Duration.ofSeconds(5)).until(driver->enterSSNNumber.isDisplayed()&&enterSSNNumber.isEnabled());
    enterSSNNumber.sendKeys(ssnNumber);
}

public void selectmaritialstatus(String value){
    new WebDriverWait(driver, Duration.ofSeconds(5)).until(driver->selectMaritalStatusSingleMar.isDisplayed()&&selectMaritalStatusSingleMar.isEnabled());
    selectMaritalStatusSingleMar.click();
    Select select = new Select(selectMaritalStatusSingleMar);
    select.selectByVisibleText(value);
}




public void clicknextbutton(){
//    ((JavascriptExecutor)driver).executeAsyncScript("arguments[0].scrollIntoView(true);", next);
    
//     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    
   
//     WebElement nextbtn = wait.until(ExpectedConditions.visibilityOfElementLocated((By) next));
//     nextbtn.click();

    new WebDriverWait(driver, Duration.ofSeconds(15)).until(driver->next.isDisplayed() && next.isEnabled());
    System.out.println(next.getText());
    try{
        WebElement fixedban = driver.findElement(By.id("fixedban"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].remove();",fixedban);
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", next);
    new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(next));
    next.click();
}




}
