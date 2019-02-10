package britErp.pages;

import britErp.utilities.ConfigurationReader;
import britErp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(xpath ="(//button[@type='button'])[8]")
    public WebElement ImportButton;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBox;

    @FindBy(xpath = "//span[@class='o_pager_value']")
    public WebElement pageNumber;

    @FindBy(xpath = "//button[@accesskey='l']")
    public WebElement listButton;

    @FindBy(xpath = "//button[@accesskey='k']")
    public WebElement kanbanButton;

    @FindBy(xpath = "//button[@data-original-title='Calendar']")
    public WebElement calendarButton;

    @FindBy(xpath = "//button[@data-original-title='Pivot']")
    public WebElement pivotButton;

    @FindBy(xpath = "//button[@data-original-title='Graph']")
    public WebElement graphButton;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(xpath = "//button[@accesskey='j']")
    public WebElement discardButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]/div[1]/button[8]")
    public WebElement cancelButton;

    @FindBy(id = "o_field_input_254")
    public WebElement productDropDown;

    @FindBy(xpath = "//li[@tabindex='-1'][2]")
    public WebElement createAndEditButton;

    @FindBy(xpath = "//h4[@class='modal-title']")
    public WebElement productHeader;

    @FindBy(xpath = "//input[@name='date_planned_start']")
    public WebElement deadlineStartBox;


    public void managerLogin_1() {
        //click demo login
        clickDemo.click();
        Email.sendKeys(ConfigurationReader.getProperty("managerLogin"));
        password.sendKeys(ConfigurationReader.getProperty("managerPass"));
        loginButton.click();
        module.click();
    }

}
