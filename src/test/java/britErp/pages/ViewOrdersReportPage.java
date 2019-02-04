package britErp.pages;

import britErp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewOrdersReportPage{
   public ViewOrdersReportPage(){
       PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(linkText ="Manufacturing Orders")
    public WebElement reportManufacturingOrders;

    public void ManufacturingOrdersFunctionRe(){
        reportManufacturingOrders.click();
    }
}
