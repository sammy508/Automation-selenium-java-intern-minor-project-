package demqasite.pages;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import demqasite.pageLocators.elementpagelocators;
import demqasite.pageLocators.interactionspagelocators;
import demqasite.pageLocators.landingpageLocator;

public class landingpage {
    WebDriver driver;
    String url = "https://demoqa.com/";
    Logger log = LogManager.getLogger(landingpage.class);
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(url);
        log.info("Url initialize");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

    }

    @Test(priority = 1)
    public void openLandingPage() {

        landingpageLocator lndpage = new landingpageLocator(driver);
        elementpagelocators elementpage = new elementpagelocators(driver);
        interactionspagelocators interactions = new interactionspagelocators(driver);


        // trigger element button

        lndpage.setlementbtn();

        // element page

        elementpage.setcheckbox();

        // clicking checkbox arrow toggle and chckbox item
        elementpage.clicktogglearrow();

        // clicking checkbositem
        elementpage.clickcheckboxitem();
        log.info("Checkbox selected");

        elementpage.clickcheckboxitem();
        log.info("uncheck checkbox");

        // handling radio button

        elementpage.setradiobtn();

        elementpage.clickradiobuttontab();
        log.info("Radio button clicked");

        elementpage.clickRadioImpresivebtn();
        log.info("Insted yes impressive is selected");

        // dropdown button and selecting row

        elementpage.setwebtable();
        log.info("Redirected to webpage");

        // click row button

        elementpage.selectRowperpage("20 rows");
        log.info("clicked to row dropdown");

        //

        elementpage.clickdeletebutton();
        log.info("Item deleted from web table");

        // clicking search bar
        elementpage.clicksearchbar("Alden");
        log.info("Clicked search bar");

        // clicking on search icon

        elementpage.clicksearchbutton();
        log.info("Click on search button");


        // Button tab and button operations

        elementpage.setbuttons();
        log.info("Click on  button tab");

        // right click operation on selenium

        //elementpage.rightclickbutton();
        log.info("Performed right click button");

        elementpage.doubleclickbutton();
        log.info("Doubloe click performed");

        // clikcing link to next tab

        // Link tab is nt clicking se you later

        // elementpage.setlinks();
        // log.info("linktab clicked");

        // elementpage.LoadtohomepageLinktext();
        // log.info("Link text clicked and loaded to new tab");



        //  uploading file to websites using selenium

        elementpage.clickUploadAndDownloadtab();
        log.info("upload& Download tab clicked");

        // providing filepath

        elementpage.uploadfilebutton("C:\\Users\\sscpg\\Downloads\\sampleFile.jpeg");
        log.error("error");

        // Interaction page & its components

        

        interactions.clickinteractionbutton();
        log.info(interactions.toString());
        log.info("Interaction tab clicked");

        // click to selecttable tab

        interactions.clickselecttable();
        log.info("Clicked on selecttable");

        // clicking on list item
        interactions.selectlistitems();
        log.info("List item were selected");



        // resizable

        interactions.clickresizetab();
        log.info("Click the resizetab");
        interactions.clickresizetab();

        // click the resize box
        interactions.resizethebox(100, 100);
        log.info("resize bot to 100, 100 offset");


        // click dropable tab

        interactions.dropapbletab();
        log.info("Clicked on dropable tab");

        // drop box

        interactions.dropboxonzone();
        log.info("Dropped box on zone");






    }














}
