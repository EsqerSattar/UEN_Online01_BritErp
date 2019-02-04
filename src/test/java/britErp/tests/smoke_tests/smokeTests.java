package britErp.tests.smoke_tests;

import britErp.utilities.ApplicationConstants;
import britErp.utilities.ConfigurationReader;
import britErp.utilities.TestBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class smokeTests extends TestBase {

    @Test
    public void britSmokeTest(){
        // create a new test / test case in the report and give name : Page headers test
        extentLogger = report.createTest("Page headers test");

        // use logger to log the steps
        extentLogger.info("Logging to the application");
        pages.login().managerLogin();



    }

}
