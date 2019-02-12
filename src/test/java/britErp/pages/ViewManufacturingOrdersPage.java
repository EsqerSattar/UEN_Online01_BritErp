package britErp.pages;

import britErp.utilities.ConfigurationReader;
import britErp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.awt.motif.X11CNS11643;

public class ViewManufacturingOrdersPage {

    public ViewManufacturingOrdersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//a[contains(.,'Demo')]")
    public WebElement clickDemo;

    @FindBy(id="login")
    public WebElement Email;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement loginButton;

    //clicking Manufacturing module
    @FindBy (linkText="Manufacturing")
    public WebElement module;

    @FindBy( xpath = "(//li[@class='active'])[3]")
    public WebElement Header;

    @FindBy(xpath ="//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(xpath = "//button[@accesskey='j']")
    public WebElement discardButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]/div[1]/button[8]")
    public WebElement cancelButton;

    @FindBy(xpath = "//div[@class='o_input_dropdown']/input")
    public WebElement productDropDown;

    @FindBy(xpath = "//li[@tabindex='-1'][2]")
    public WebElement createAndEditButton;

    @FindBy(xpath = "//h4[@class='modal-title']")
    public WebElement productHeader;

    @FindBy(xpath = "//input[@name='date_planned_start']")
    public WebElement deadlineStartBox;

    @FindBy(xpath = "(//input[@autocomplete='off'])[4]")
    public WebElement responsibleBox;

    @FindBy(xpath = "(//button[@draggable='false'])[3]")
    public WebElement arrowButton;

    @FindBy(xpath = "//h4[@class='modal-title']")
    public WebElement openPageHeader;

    @FindBy(xpath ="//*[.='ManufacturingManager'][1]")
    public WebElement userTitle;

    @FindBy(xpath = "//span[@name='login']")
    public WebElement loginUserName;

    @FindBy(xpath = "//*[@id=\"modal_303\"]/div/div/div[3]/button")
    public WebElement closeButton;

    @FindBy(xpath = "//li[@tabindex='-1'][8]")
    public WebElement searchMoreButton;

    @FindBy(xpath = "//h4[@class='modal-title']")
    public WebElement searchPageHeader;

    @FindBy(xpath = "//div[@class='o_searchview']")
    public WebElement searchBoxInResponsiblePage;

    @FindBy(xpath = "//*[@id=\"modal_361\"]/div/div/div[3]/button/span")
    public WebElement cancel2;

    @FindBy(xpath = "//li[@tabindex='-1'][1]")
    public WebElement selectAny;

    @FindBy(xpath = "//h4[@class='modal-title']")
    public WebElement errorPageHeader;



    public void managerLogin_1() {
        //click demo login
        clickDemo.click();
        Email.sendKeys(ConfigurationReader.getProperty("managerLogin"));
        password.sendKeys(ConfigurationReader.getProperty("managerPass"));
        loginButton.click();
        module.click();
    }

}
