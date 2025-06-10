package benefitstorePom.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import benefitstorePom.Locators.dependentChildInfoLocator;

public class dependentchildinfopage {
    
     WebDriver driver;
    private static final Logger log = LogManager.getLogger(dependentchildinfopage.class);
    

     dependentchildinfopage(WebDriver driver){
        this.driver = driver;
        

     }
     public void childinfo(){

        dependentChildInfoLocator child = new dependentChildInfoLocator(driver);

        child.enterfirstname("Baby");
        log.info("Entered child first name");

        // enter lastname
        child.enterlastname("Charls");
        log.info("entered child lastname");

        // calendar interaction on DOB
        child.enterDOB("06/09/2010");
        log.info("Entered DOB");

        child.selectgender("Male");
        log.info("Gender selected");

        child.enterSSN("123456879");
        log.info(" Entered Child's SSN");

        child.ClickSubmitbutton();
        log.info(" submit button Clicked");

        // clicking next button , to redirect to billing page

        child.clickNextbutton();
        log.info("Clicked Next button");


        

     }


}
