package britErp.pages;

import britErp.utilities.ConfigurationReader;
import britErp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
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


    public void managerLogin(){
        //click demo login
        clickDemo.click();
        Email.sendKeys(ConfigurationReader.getProperty("managerLogin"));
        password.sendKeys(ConfigurationReader.getProperty("managerPass"));
        loginButton.click();
        module.click();
    }

    public void userLogin(){
        clickDemo.click();
        Email.sendKeys(ConfigurationReader.getProperty("userLogin"));
        password.sendKeys(ConfigurationReader.getProperty("userPass"));
        loginButton.click();
        module.click();
    }





//    public void open() {
//        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
//
//    }


}
