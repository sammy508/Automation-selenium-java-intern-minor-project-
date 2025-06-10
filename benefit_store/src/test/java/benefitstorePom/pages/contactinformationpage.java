package benefitstorePom.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import benefitstorePom.Locators.contactinformationlocator;

public class contactinformationpage {
    WebDriver driver;
    private static final Logger log = LogManager.getLogger(contactinformationpage.class);
    
    // constructor
    public contactinformationpage(WebDriver driver){
        this.driver = driver;

    }

    public void contactinformation(){

        contactinformationlocator contactpage = new contactinformationlocator(driver);

        // enter email
        contactpage.enteremailfield("manju_kc4234@yahoo.com");
        log.info(("Email entered"));

        // enter contact
        contactpage.enterContactfield("8172596374");
        log.info("Contact number entered");

        // Enter Street
        contactpage.enterStreetAddress("371 7th");
        log.info("Ecnter 371 7th as street");

        // Enter Country
        contactpage.enterCountry("America");
        log.info("Entered America as country");

        // click next button

        contactpage.clickNext();
        log.info("Clicked next button");


    }














}
