package britErp.tests.functional_tests.login;

import britErp.utilities.ApplicationConstants;
import britErp.utilities.TestBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class UserLogin extends TestBase {

    @Test()
    public void userLogin(){
        extentLogger = report.createTest("user login test");
        extentLogger.info("Verifying login page title");

        assertEquals(driver.getTitle(), ApplicationConstants.LOGIN_PAGE_TITLE);
        extentLogger.info("Login to application");
        pages.login().userLogin();
        extentLogger.info("Verifying url");
        assertEquals(driver.getTitle(),
                ApplicationConstants.LOGIN_PAGE_TITLE);
        assertEquals(driver.getCurrentUrl(),
                "http://52.39.162.23/web?");

    }
}
