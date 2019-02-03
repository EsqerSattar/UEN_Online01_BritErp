package britErp.pages;

import britErp.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class ViewOrdersReportPage extends Menu{
   public ViewOrdersReportPage(){
       PageFactory.initElements(Driver.getDriver(),this);

    }
}
