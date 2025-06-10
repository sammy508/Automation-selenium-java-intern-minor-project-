package demqasite.pageLocators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class interactionspagelocators {
    WebDriver driver;
    Actions action;

    public interactionspagelocators(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        // Create Actions object
        this.action = new Actions(driver);

    }

   @FindBy(xpath="//body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[1]/div[1]/div[1]/div[5]/span[1]/div[1]")  WebElement interactionstab;
    // @FindBy(css = "body > div:nth-child(6) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(5) > span:nth-child(1) > div:nth-child(1)") WebElement interactionstab;

    @FindBy(xpath = "//div[contains(@class,'element-list collapse show')]//li[@id='item-1']")
    WebElement selectabletab;

    @FindBy(xpath = "//div[@class='element-list collapse show']//li[@id='item-3']")
    WebElement droppabletab;

    @FindBy(xpath = "//div[@class='element-list collapse show']//li[@id='item-4']")
    WebElement dragabbletab;

   

    @FindBy(xpath = "//div[@class='col-12 mt-4 col-md-6']")
    WebElement droppableSimpleAcceptPreventPtab;

    // Select table's list  path

    @FindBy(xpath="//ul[@id='verticalListContainer'][li]") WebElement crasJustoOdioDapibusAcFaci;

    // resizebox from resizeable tab
     @FindBy(xpath = "//div[contains(@class,'element-list collapse show')]//li[@id='item-2']")
    WebElement resizabletab;

   @FindBy(xpath="//div[@id='resizableBoxWithRestriction']//span[@class='react-resizable-handle react-resizable-handle-se']") 
   WebElement resizableBox;

   // Dropable pages
   
    @FindBy(xpath="//div[@id='draggable']") WebElement dragMe;
    @FindBy(xpath="//div[@id='simpleDropContainer']//div[@id='droppable']") WebElement dropHere;


    
   
     public void clickinteractionbutton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(interactionstab));
        wait.until(ExpectedConditions.elementToBeClickable(interactionstab));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", interactionstab);

        interactionstab.click();

     }


        public void clickselecttable(){
            new WebDriverWait(driver, Duration.ofSeconds(5)).until(driver->selectabletab.isDisplayed() && selectabletab.isDisplayed());
            selectabletab.click();
        }


        public void selectlistitems(){
            
            List<WebElement> items = driver.findElements(By.xpath("//ul[@id='verticalListContainer']//li"));

            for(WebElement item : items){
                
                String itemvalue = item.getText();
                System.out.println(itemvalue);

                if(itemvalue.equals("Cras justo odio")){
                    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", item);
                    item.click();

                }

            }

        }

        // / resizeable tab

        public void clickresizetab(){
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(driver->resizabletab.isDisplayed() && resizabletab.isEnabled());
                ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", resizabletab);
                resizabletab.click();
        }


        public void resizethebox( int x, int y){
               
                new WebDriverWait(driver, Duration.ofSeconds(10)).until(driver->resizableBox.isDisplayed() && resizableBox.isEnabled());
                
                action.clickAndHold(resizableBox)
               .moveByOffset(x, y)
                .release()
                .perform();
         }

         
        //  Dropable in drop box dropable tab

        public void dropapbletab(){
             new WebDriverWait(driver, Duration.ofSeconds(10)).until(driver->droppabletab.isDisplayed() && droppabletab.isEnabled());
             droppabletab.click();
                
        }

        public void dropboxonzone(){
             new WebDriverWait(driver, Duration.ofSeconds(10)).until(driver->dragMe.isDisplayed() && dragMe.isEnabled());
              new WebDriverWait(driver, Duration.ofSeconds(10)).until(driver->dropHere.isDisplayed() && dropHere.isEnabled());

              action.dragAndDrop(dragMe, dropHere);

        }









        







}


 







