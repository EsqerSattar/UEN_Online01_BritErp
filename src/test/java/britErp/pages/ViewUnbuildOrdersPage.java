package britErp.pages;

import britErp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewUnbuildOrdersPage {
    public ViewUnbuildOrdersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText ="Unbuild Orders")
    public WebElement unbuildOrders;

    public void UnbuildOrdersFunction(){
        unbuildOrders.click();
    }
}
