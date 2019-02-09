package britErp.tests.smoke_tests;

import britErp.utilities.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class smokeTests extends TestBase {

    WebDriverWait wait;

    @BeforeMethod
    public void setWait(){
        wait = new WebDriverWait(Driver.getDriver(),30);
    }

    @Test(groups = {"smoke"})
    public void britSmokeTest_BRIT_3786(){
        // create a new test / test case in the report and give name : Manufacturing Orders Page title test
        extentLogger = report.createTest("User login as a Manager BRIT-3786");

        // use logger to log the steps
        extentLogger.info("Logging to the application");
        pages.viewManufacturingOrders().managerLogin_1();

        extentLogger.info("Verify url : http://52.39.162.23/web?#view_type=list&model=mrp.production&menu_id=431&action=592");
        wait.until(ExpectedConditions.urlToBe("http://52.39.162.23/web?#view_type=list&model=mrp.production&menu_id=431&action=592"));
        assertEquals(driver.getCurrentUrl(), "http://52.39.162.23/web?#view_type=list&model=mrp.production&menu_id=431&action=592");
        extentLogger.info("Verify title : Manufacturing Orders - Odoo");
        wait.until(ExpectedConditions.titleIs("Manufacturing Orders - Odoo"));
        assertEquals(driver.getTitle(), "Manufacturing Orders - Odoo");

        extentLogger.pass("PASS: Login as a manager BRIT-3786");

    }

    @Test(groups = {"smoke"})
    public void britSmokeTest_BRIT_3787(){
        // create a new test / test case in the report and give name : Unbuild Order fuction Test
        extentLogger = report.createTest("User login as a Manager BRIT-3787");

        extentLogger.info("Logging to the application");
        pages.viewUnbuildOrders().UnbuildOrdersFunction();

        extentLogger.info("Verify url : http://52.39.162.23/web?#view_type=list&model=mrp.unbuild&menu_id=438&action=605");
        wait.until(ExpectedConditions.urlToBe("http://52.39.162.23/web?#view_type=list&model=mrp.unbuild&menu_id=438&action=605"));
        assertEquals(driver.getCurrentUrl(), "http://52.39.162.23/web?#view_type=list&model=mrp.unbuild&menu_id=438&action=605");
        extentLogger.info("Verify title : Unbuild Orders - Odoo");
        wait.until(ExpectedConditions.titleIs("Unbuild Orders - Odoo"));
        assertEquals(driver.getTitle(), "Unbuild Orders - Odoo");

        extentLogger.pass("PASS: Login as a manager BRIT-3787");

    }

    @Test(groups = {"smoke"})
    public void britSmokeTest_BRIT_3788(){

        // create a new test / test case in the report and give name : Manufacturing Orders fuction under Reporting Test
        extentLogger = report.createTest("User login as a Manager BRIT-3788");

        extentLogger.info("Logging to the application");
        pages.viewOrdersReportPage().MenufOrdersFunction();

        extentLogger.info("Verify url : http://52.39.162.23/web?#view_type=graph&model=mrp.production&menu_id=433&action=596");
        wait.until(ExpectedConditions.urlToBe("http://52.39.162.23/web?#view_type=graph&model=mrp.production&menu_id=433&action=596"));
        assertEquals(driver.getCurrentUrl(), "http://52.39.162.23/web?#view_type=graph&model=mrp.production&menu_id=433&action=596");
        extentLogger.info("Verify title : Manufacturing Orders - Odoo");
        wait.until(ExpectedConditions.titleIs("Manufacturing Orders - Odoo"));
        assertEquals(driver.getTitle(), "Manufacturing Orders - Odoo");

        extentLogger.pass("PASS: Login as a manager BRIT-3788");

    }
}
