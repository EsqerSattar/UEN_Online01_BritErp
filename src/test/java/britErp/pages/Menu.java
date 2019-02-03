package britErp.pages;

import britErp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu {
    public Menu() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@class='active']")
    public WebElement header;

    @FindBy(linkText="Manufacturing Orders")
    public WebElement ManufacturingOrdersLink;

    @FindBy(linkText="Unbuild Orders")
    public WebElement UnbuildOrdersLink;

    @FindBy(linkText="Manufacturing Orders")
    public WebElement OrdersReportLink;

    @FindBy(xpath ="//span[@class='oe_topbar_name']")
    public WebElement userName;

}
