package britErp.tests.functional_tests.login;

import britErp.utilities.ApplicationConstants;
import britErp.utilities.ConfigurationReader;
import britErp.utilities.TestBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class ManagerLogin extends TestBase {


    @Test()
    public void managerLogin(){
        extentLogger = report.createTest("manager login test");
        extentLogger.info("Verifying login page title");

//        assertEquals(driver.getTitle(), ApplicationConstants.LOGIN_PAGE_TITLE);
//        extentLogger.info("Login to application");
        pages.login().managerLogin();
//        extentLogger.info("Verifying url");
//        assertEquals(driver.getTitle(),
//                ApplicationConstants.LOGIN_PAGE_TITLE);
//        assertEquals(driver.getCurrentUrl(),
//                "http://52.39.162.23/web?");

    }

}
