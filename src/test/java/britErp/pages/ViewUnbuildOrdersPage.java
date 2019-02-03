package britErp.pages;

import britErp.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class ViewUnbuildOrdersPage extends Menu {
    public ViewUnbuildOrdersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
