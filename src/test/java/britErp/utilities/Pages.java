package britErp.utilities;

import britErp.pages.LoginPage;
import britErp.pages.ViewManufacturingOrdersPage;
import britErp.pages.ViewOrdersReportPage;
import britErp.pages.ViewUnbuildOrdersPage;

public class Pages {
    private LoginPage loginPage;
    private ViewManufacturingOrdersPage viewManufacturingOrderPage;
    private ViewUnbuildOrdersPage viewUnbuildOrdersPage;
    private ViewOrdersReportPage viewOrdersReportPage;


    public LoginPage login() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public ViewManufacturingOrdersPage viewManufacturingOrders() {
        if (viewManufacturingOrderPage == null) {
            viewManufacturingOrderPage = new ViewManufacturingOrdersPage();
        }
        return viewManufacturingOrderPage;
    }

    public ViewUnbuildOrdersPage viewUnbuildOrders() {
        if (viewUnbuildOrdersPage == null) {
            viewUnbuildOrdersPage = new ViewUnbuildOrdersPage();
        }
        return viewUnbuildOrdersPage;
    }

    public ViewOrdersReportPage viewOrdersReportPage(){
        if(viewOrdersReportPage == null){
            viewOrdersReportPage = new ViewOrdersReportPage();
        }
        return viewOrdersReportPage;
    }


}
