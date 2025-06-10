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

public class dependentChildInfoLocator {

    WebDriver driver;

    public dependentChildInfoLocator(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//form[@id='popups_disable']//input[contains(@placeholder,'Enter First Name')]")
    WebElement enterFirstName;

    @FindBy(xpath = "//form[@id='popups_disable']//input[contains(@placeholder,'Enter Last Name')]")
    WebElement enterLastName;
    @FindBy(xpath = "//form[@id='popups_disable']//input[contains(@placeholder,'Select Date of Birth')]")
    WebElement selectDateOfBirth;
    @FindBy(xpath = "//form[@id='popups_disable']//select[contains(@class,'custom-input')]")
    WebElement selectGenderMaleFemale;
    @FindBy(xpath = "//form[@id='popups_disable']//input[contains(@placeholder,'Enter Social Security Number')]")
    WebElement enterSocialSecurityNumber;

    @FindBy(xpath = "//form[@id='popups_disable']//button[contains(@name,'button')][normalize-space()='Submit']")
    WebElement submit;

    @FindBy(xpath = "//a[normalize-space()='Next']")
    WebElement next;

    public void enterfirstname(String childfirstname) {
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        new WebDriverWait(driver, Duration.ofSeconds(9))
                .until(driver -> enterFirstName.isDisplayed() && enterFirstName.isEnabled());
        enterFirstName.clear();
        enterFirstName.sendKeys(childfirstname);

    }

    public void enterlastname(String childlastname) {
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        new WebDriverWait(driver, Duration.ofSeconds(9))
                .until(driver -> enterLastName.isDisplayed() && enterLastName.isEnabled());
        enterLastName.clear();
        enterLastName.sendKeys(childlastname);

    }

    public void enterDOB(String childdob) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(driver -> selectDateOfBirth.isDisplayed() && selectDateOfBirth.isEnabled());
        selectDateOfBirth.click();
        selectDateOfBirth.sendKeys(childdob);

    }

    public void selectgender(String gendervalue) {
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(driver -> selectGenderMaleFemale.isDisplayed() && selectGenderMaleFemale.isEnabled());

        new Select(selectGenderMaleFemale).selectByVisibleText(gendervalue);

    }

    public void enterSSN(String childssnvalue) {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> enterSocialSecurityNumber.isDisplayed() && enterSocialSecurityNumber.isEnabled());
        enterSocialSecurityNumber.sendKeys(childssnvalue);

    }

    public void ClickSubmitbutton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(driver -> submit.isDisplayed() && submit.isEnabled());

        try {
            WebElement Fixedban = driver.findElement(By.id("fixedban"));
            ((JavascriptExecutor) driver).executeScript("argumnets[0].remove();", Fixedban);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        submit.click();
    }

     public void clickNextbutton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", next);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(driver -> next.isDisplayed() && next.isEnabled());

        try {
            Thread.sleep(5000);
            WebElement Fixedban = driver.findElement(By.id("fixedban"));
            ((JavascriptExecutor) driver).executeScript("argumnets[0].remove();", Fixedban);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        next.click();
    }


}
