package benefitstorePom.pages;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
// import FormSubmissionpageUsingPOMFactory; // Removed or update with correct package if needed
// import benefitstorePom.pages.FormSubmissionpageUsingPOMFactory;
import benefitstorePom.Locators.personalinfopagelocators;

public class personalinfopage {
    
WebDriver driver;
// Logger log = (Logger) LogManager.getLogger(FormSubmissionpageUsingPOMFactory.class);
private static final Logger log = LogManager.getLogger(personalinfopage.class);

   public personalinfopage(WebDriver driver){
    this.driver = driver;
    

    }

        void profilepage(){

            personalinfopagelocators personinfo = new personalinfopagelocators(driver);
            log.info("Personal page begins");


            // entered first name
            personinfo.setfirstname("Sammy");
            log.info("entered first name");

            // enter last name
            personinfo.setlastname("Cpgn");
            log.info("enterd last name");

            personinfo.selectmaritialstatus("Divorced");
            log.info("Selected Divorced");

            personinfo.setSSNnumber("123456888");
            log.info("entered sssn: 123456888");

            personinfo.clicknextbutton();
            log.info("after entering data next button is clicked");





            


        }


  




}
