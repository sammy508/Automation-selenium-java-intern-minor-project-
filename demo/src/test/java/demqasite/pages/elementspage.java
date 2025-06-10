package demqasite.pages;
import org.openqa.selenium.WebDriver;

import demqasite.pageLocators.elementpagelocators;

public class elementspage {
    WebDriver driver;
    elementpagelocators elementpage;

     public elementspage(WebDriver driver) {
        this.driver = driver;
        elementpage = new elementpagelocators(driver);
    }
    elementspage  elepage = new elementspage(driver);

    



    // operation



}
