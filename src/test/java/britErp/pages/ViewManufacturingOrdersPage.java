package britErp.pages;

import britErp.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class ViewManufacturingOrdersPage extends Menu{
    public ViewManufacturingOrdersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
