package britErp.pages;

import britErp.utilities.ConfigurationReader;
import britErp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewOrdersReportPage{
   public ViewOrdersReportPage(){
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

    @FindBy(xpath ="/html/body/div[1]/div[1]/div[1]/div[6]/ul[3]/li/a/span")
    public WebElement mOders;

    public void MenufOrdersFunction() {
        clickDemo.click();
        Email.sendKeys(ConfigurationReader.getProperty("managerLogin"));
        password.sendKeys(ConfigurationReader.getProperty("managerPass"));
        loginButton.click();
        module.click();
        mOders.click();

    }
}
