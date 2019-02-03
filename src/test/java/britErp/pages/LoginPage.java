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

    @FindBy(linkText = "BriteErpDemo")
    public WebElement BriteErpDemoClick;

    @FindBy(id="login")
    public WebElement Email;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement loginButton;

    //clicking Manufacturing module
    @FindBy (css=".oe_menu_toggler")
    public WebElement manufacturing;



    public void login(String username, String password){
        this.Email.sendKeys("in_manuf_manager@info.com");
        this.password.sendKeys("kop98tfgQ68");
        loginButton.click();
    }

    public void open() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }


}
