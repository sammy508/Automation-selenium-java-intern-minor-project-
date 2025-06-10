package demqasite.pageLocators;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingpageLocator {
    
    WebDriver driver;

    public landingpageLocator(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);


    }
    

    // actions

    // @FindBy(id = "exampleId") // Replace "exampleId" with the actual id of the element you want to locate
    
    @FindBy(xpath = "//div[@class='home-body']//div[2]//div[1]//div[2]//*[name()='svg']") WebElement Formtabbtn;
    
    @FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]") WebElement elementbtn;
    

    @FindBy(xpath="//h5[normalize-space()='Alerts, Frame & Windows']")  WebElement alertsFrameWindowsbtn;
    @FindBy(xpath="//h5[normalize-space()='Widgets']")  WebElement widgets;
    @FindBy(xpath="//h5[normalize-space()='Interactions']") WebElement interactionsbtn;
    @FindBy(xpath="//h5[normalize-space()='Book Store Application']")  WebElement bookStoreApplicationbtn;

    //
    // element page locators
   

    // 
    public void clickFormtab(){
        Formtabbtn.click();
    }

    public void  setlementbtn(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementbtn);
        elementbtn.click();
        
        
    }
    public void alertsFrameWindowsbtn(){
        Formtabbtn.click();
    }
    public void widgets(){
        Formtabbtn.click();
    }
    public void interactionsbtn(){
        Formtabbtn.click();
    }


    // clicking on list item

    



    
}
