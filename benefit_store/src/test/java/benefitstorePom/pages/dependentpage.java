
package benefitstorePom.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import benefitstorePom.Locators.dependentpageLocators;

public class dependentpage {
    WebDriver driver;
    private static final Logger log = LogManager.getLogger(dependentpage.class);
    
    // constructor
    public dependentpage(WebDriver driver){
        this.driver = driver;

    }

    // interactions with elements

    public void dependentinfo(){
        dependentpageLocators depeninfo = new dependentpageLocators(driver);

        depeninfo.enterfirstname("Samir");
        log.info("Entered first name");

        // enter lastname
        depeninfo.enterlastname("Charls");
        log.info("entered lastname");

        // calendar interaction on DOB
        depeninfo.enterDOB("06/09/1995");
        log.info("Entered DOB");

        depeninfo.selectgender("Male");
        log.info("Gender selected");

        depeninfo.enterSSN("123456889");
        log.info("Entered SSN");

        depeninfo.ClickSubmitbutton();
        log.info(" submit button Clicked");


        
    }





}
