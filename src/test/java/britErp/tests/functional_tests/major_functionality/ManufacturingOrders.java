package britErp.tests.functional_tests.major_functionality;

import britErp.pages.ViewManufacturingOrdersPage;
import britErp.utilities.ApplicationConstants;
import britErp.utilities.ConfigurationReader;
import britErp.utilities.Driver;
import britErp.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sun.jvm.hotspot.memory.HeapBlock;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class ManufacturingOrders extends TestBase {
        WebDriverWait wait;
        ViewManufacturingOrdersPage MOrdersHeader, create, save, discard, cancel;


    @BeforeMethod
    public void setReady(){
        pages.viewManufacturingOrders().managerLogin_1();
    }

    @Test
    public void BRIT_935() {
        /*
         * Verify that when click the Manufacturing module on #inbox page system should display
         *    the manufacturing order page
         * 1. Open the url
         * 2. click the sign in button
         * 3. click the BriteErpDemo
         * 4. Enter valid manager username "in_manuf_manager@info.com" and valid password "kop98tfgQ68"
         *    click "log In" button
         * 5. click the Manufacturing module
         */

        extentLogger = report.createTest("User login as a Manager BRIT-935");
        // use logger to log the steps
        extentLogger.info("Logging to the application");
        extentLogger = report.createTest("Test BRIT-935 WebApplication is ready and Manufacturing Orders " +
                "functions are selected as default");
    }

    @Test
    public void BRIT_1437() throws InterruptedException {
        /*
         * Verify that page header Verify that  page header Manufacturing Orders, create button(blue color),
         *    import button, search box, page number, privies page and next page button, List button,
         *    Kansan button, Calendar button, Pivot, and Graph button are display.
         * 1. login as a manager
         * 2. click manufacturing module
         * 3. verify that header Manufacturing Order is display
         * 4. verify that all page elements are display
         */
         wait=new WebDriverWait(Driver.getDriver(),25);
         MOrdersHeader = new ViewManufacturingOrdersPage();

        extentLogger = report.createTest("User login as a Manager BRIT-1437");
        extentLogger.info("Logging to the application");
        wait.until(ExpectedConditions.visibilityOf( MOrdersHeader.Header));
        Thread.sleep(1000);
        String expectedMOrdersHeader = "Manufacturing Orders";
        String actualMOrdersHeader = MOrdersHeader.Header.getText();
        Assert.assertEquals(actualMOrdersHeader,expectedMOrdersHeader);

    }

    @Test
    public void BRIT_1455() throws InterruptedException {

        /* Verify that create button should be clickable and New create page should display
        * 1. login as a manager
        * 2. click Manufacturing module
        * 3. verify that Create button is display
        * 4. verify that Create button is clickable
        * 5. verify the page tile as New - Odoo
        */
        wait=new WebDriverWait(Driver.getDriver(),25);
        create = new ViewManufacturingOrdersPage();
        save = new ViewManufacturingOrdersPage();
        discard = new ViewManufacturingOrdersPage();
        cancel = new ViewManufacturingOrdersPage();
        Assert.assertTrue(create.createButton.isDisplayed());
        create.createButton.click();
        Thread.sleep(1500);
        String expectedNewUrl = "http://52.39.162.23/web?#id=&view_type=form&model=mrp.production&menu_id=431&action=592";
        Assert.assertEquals(driver.getCurrentUrl(),expectedNewUrl);
        Assert.assertEquals(driver.getTitle(),ApplicationConstants.NEW_PAGE_TITLE);
        Assert.assertTrue(save.saveButton.isDisplayed());
        Assert.assertTrue(discard.discardButton.isDisplayed());
        Assert.assertTrue(cancel.cancelButton.isDisplayed());
    }













}



