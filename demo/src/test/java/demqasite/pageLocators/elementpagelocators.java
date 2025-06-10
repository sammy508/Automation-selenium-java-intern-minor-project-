package demqasite.pageLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class elementpagelocators {

    WebDriver driver;
    Actions action;

    public elementpagelocators(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        // Create Actions object
        this.action = new Actions(driver);

    }

    @FindBy(xpath = "//div[@class='element-list collapse show']//li[@id='item-1']")
    WebElement checkBox;
    @FindBy(xpath = "//div[@class='element-list collapse show']//li[@id='item-2']")
    WebElement radioButton;

    @FindBy(xpath = "//div[@class='element-list collapse show']//li[@id='item-3']")
    WebElement webTables;
    @FindBy(xpath = "//div[@class='element-list collapse show']//li[@id='item-4']")
    WebElement buttons;
    // @FindBy(xpath="//div[@class='element-list collapse show']//li[@id='item-5']")
    // WebElement links;

    @FindBy(xpath = "//div[@class='element-list collapse show']//li[@id='item-8']")
    WebElement dynamicProperties;

    // inside checkbox page

    @FindBy(xpath = "//button[@title='Toggle']//*[name()='svg']")
    WebElement togglearrow;
    @FindBy(xpath = "//label[@for='tree-node-desktop']//span[@class='rct-checkbox']")
    WebElement checkboxitem;

    // inside radio button page
    @FindBy(xpath = "//label[normalize-space()='Yes']")
    WebElement radiobtn_yes;
    @FindBy(xpath = "//label[normalize-space()='Impressive']")
    WebElement radiobtn_impressive;

    // Wb table pages locators
    @FindBy(xpath = "//select[@aria-label='rows per page']")
    WebElement rowdropdown;
    @FindBy(xpath = "//span[@id='delete-record-1']//*[name()='svg']//*[name()='path' and contains(@d,'M864 256H7')]")
    WebElement deletebutton;
    @FindBy(xpath = "//input[@id='searchBox']")
    WebElement typeToSearch;
    @FindBy(xpath = "//span[@id='basic-addon2']//span")
    WebElement searchicon;

    // Buttons tab

    @FindBy(xpath = "//button[@id='rightClickBtn']")
    WebElement rightClickMe;
    @FindBy(xpath = "//button[@id='doubleClickBtn']")
    WebElement doubleClickMe;
    @FindBy(xpath = "//button[@id='F1r0i']")
    WebElement clickMe;

    // Links page

    // @FindBy(xpath="//div[@class='element-list collapse show']//li[@id='item-5']")
    // WebElement Linkstab_page;
    @FindBy(xpath = "//div[@class='element-list collapse show']//li[@id='item-5']")
    WebElement Linkstab_page;
    @FindBy(xpath = "//a[@id='simpleLink']")
    WebElement Loadhomepage;

    // Broken_links tab

    @FindBy(xpath = "//div[@class='element-list collapse show']//li[@id='item-6']")
    WebElement brokenLinksImages;


    // Upload and download file


    @FindBy(xpath = "//div[@class='element-list collapse show']//li[@id='item-7']")
    WebElement uploadAndDownload;

    @FindBy(xpath="//input[@id='uploadFile']") WebElement selectAFile;

    public void setcheckbox() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> checkBox.isDisplayed() && checkBox.isEnabled());
        checkBox.click();
    }

    public void setbuttons() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> buttons.isDisplayed() && buttons.isEnabled());
        buttons.click();
    }

    public void setuploadanddownload() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> uploadAndDownload.isDisplayed() && uploadAndDownload.isEnabled());
        uploadAndDownload.click();
    }

    public void setdynamicproperty() {
        // You cannot use driver.wait() here because driver.wait() is Object.wait(),
        // which is for thread synchronization, not for waiting for web elements.
        // You need to use WebDriverWait for waiting for conditions in Selenium.
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> dynamicProperties.isDisplayed() && dynamicProperties.isEnabled());
        dynamicProperties.click();
    }

    /// clicking on arrow toggle
    ///

    public void clicktogglearrow() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> togglearrow.isDisplayed() && togglearrow.isDisplayed());
        togglearrow.click();
    }

    public void clickcheckboxitem() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> checkboxitem.isDisplayed() && checkboxitem.isDisplayed());
        checkboxitem.click();

        if (checkboxitem.isSelected()) {
            checkboxitem.click();
        }
    }

    // radio button page

    public void setradiobtn() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> radioButton.isDisplayed() && radioButton.isEnabled());
        radioButton.click();
    }

    // clicking radio button 'yes'
    public void clickradiobuttontab() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> radiobtn_yes.isDisplayed() && radioButton.isEnabled());

        if (!radiobtn_yes.isSelected()) {
            radiobtn_yes.click();
        }
    }

    public void clickRadioImpresivebtn() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(driver -> radiobtn_impressive.isDisplayed() && radiobtn_impressive.isEnabled());

        if (!radiobtn_yes.isSelected()) {
            radiobtn_impressive.click();
        }
    }

    // Webtables page
    public void setwebtable() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> webTables.isDisplayed() && webTables.isEnabled());
        webTables.click();
    }

    public void selectRowperpage(String value) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(driver -> rowdropdown.isDisplayed() && rowdropdown.isEnabled());

        Select select = new Select(rowdropdown);
        // select.selectByIndex(1);
        select.selectByVisibleText(value);

    }

    // clicking delete button
    public void clickdeletebutton() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> deletebutton.isDisplayed() && deletebutton.isEnabled());
        deletebutton.click();

    }

    public void clicksearchbar(String value) {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> typeToSearch.isDisplayed() && typeToSearch.isEnabled());
        typeToSearch.sendKeys(value);
    }

    public void clicksearchbutton() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> searchicon.isDisplayed() && searchicon.isEnabled());
        searchicon.click();
    }

    public void rightclickbutton() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> rightClickMe.isDisplayed() && rightClickMe.isEnabled());

        // To perform mouse action (right click )
        action.contextClick(rightClickMe).perform();
    }

    public void doubleclickbutton() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> doubleClickMe.isDisplayed() && doubleClickMe.isEnabled());

        // To perform mouse action (right click )
        action.doubleClick(doubleClickMe).perform();
    }

    // Links page load link to new tab

    // public void Linktabload(){
    // new WebDriverWait(driver,
    // Duration.ofSeconds(5)).until(driver->Linkstab_page.isDisplayed()&&Linkstab_page.isEnabled());
    // Linkstab_page.click();

    // }

    // public void setlinks(){
    // new WebDriverWait(driver, Duration.ofSeconds(5))
    // .until(driver -> Linkstab_page.isDisplayed() && Linkstab_page.isEnabled());
    // Linkstab_page.click();

    // if(Linkstab_page.isSelected() == false){

    // System.out.println("selected but not clicked");

    // }
    // }

    // Loadhomepage.click();

    // Upload and Download tab page

    public void clickUploadAndDownloadtab(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", uploadAndDownload);

        try{
            WebElement fixedban = driver.findElement(By.id("fixedban"));
            ((JavascriptExecutor)driver).executeScript("arguments[0].remove();",fixedban);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        new WebDriverWait(driver, Duration.ofSeconds(9)).until(driver->uploadAndDownload.isDisplayed() && uploadAndDownload.isEnabled());
       uploadAndDownload.click();
    }
    WebDriverWait wait = new WebDriverWait(driver,(Duration.ofSeconds(20)));

    // clicking to file upload
    public void uploadfilebutton(String filepath){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(driver->selectAFile.isDisplayed() && selectAFile.isEnabled());
        selectAFile.sendKeys(filepath);
    }


    // 











}
