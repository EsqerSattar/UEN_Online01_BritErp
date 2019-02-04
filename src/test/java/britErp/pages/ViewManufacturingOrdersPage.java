package britErp.pages;

import britErp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewManufacturingOrdersPage {

    public ViewManufacturingOrdersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText ="Manufacturing Orders")
    public WebElement manufacturingOrders;

    public void ManufacturingOrdersFunction(){
        manufacturingOrders.click();
    }

}
