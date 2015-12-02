package framework;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.*;

import java.io.File;
import java.util.Calendar;

/**
 * Created by Lena on 08.08.2014.
 */
public class Listener implements ITestListener, ISuiteListener{

    private final Logger log = LoggerFactory.getLogger(SeleniumTestCase.class);

    // This belongs to ISuiteListener and will execute before the Suite start

    @Override

    public void onStart(ISuite arg0) {

    }



    // This belongs to ISuiteListener and will execute, once the Suite is finished

    @Override

    public void onFinish(ISuite arg0) {

    }



    // This belongs to ITestListener and will execute before starting of Test set/batch

    public void onStart(ITestContext arg0) {

    }



    // This belongs to ITestListener and will execute, once the Test set/batch is finished

    public void onFinish(ITestContext arg0) {

    }



    // This belongs to ITestListener and will execute only when the test is pass

    public void onTestSuccess(ITestResult arg0) {

        // This is calling the printTestResults method

        printTestResults(arg0);

    }



    // This belongs to ITestListener and will execute only on the event of fail test

    public void onTestFailure(ITestResult arg0) {

        // This is calling the printTestResults method

        printTestResults(arg0);
        takeDriverSnapShot(SeleniumTestCase.driver, generateScreenShotFileName());
    }



    // This belongs to ITestListener and will execute before the main test start (@Test)

    public void onTestStart(ITestResult arg0) {
    }



    // This belongs to ITestListener and will execute only if any of the main test(@Test) get skipped

    public void onTestSkipped(ITestResult arg0) {

        printTestResults(arg0);

    }



    // This is just a piece of shit, ignore this

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

    }

    // This is the method which will be executed in case of test pass or fail

    // This will provide the information on the test

    private void printTestResults(ITestResult result) {

        Reporter.log("Test Method resides in " + result.getTestClass().getName(), true);

        if (result.getParameters().length != 0) {

            String params = "";

            for (Object parameter : result.getParameters()) {

                params += parameter.toString() + ", ";

            }

            Reporter.log("Test Method had the following parameters : " + params, true);

        }

        String status = null;

        switch (result.getStatus()) {

            case ITestResult.SUCCESS:

                status = "Pass";

                break;

            case ITestResult.FAILURE:

                status = "Failed";

                break;

            case ITestResult.SKIP:

                status = "Skipped";

        }

        Reporter.log("Test Status: " + status, true);

    }

    private String generateScreenShotFileName() {
        Calendar c = Calendar.getInstance();
        SeleniumTestCase.fileName = Constants.FILE_PATH + //./src/test/screenshots/
                "" + c.get(Calendar.YEAR) +
                "-" + Integer.toString(c.get(Calendar.MONTH) + 1) +
                "-" + c.get(Calendar.DAY_OF_MONTH) +
                "-" + c.get(Calendar.HOUR_OF_DAY) +
                "-" + c.get(Calendar.MINUTE) +
                "-" + c.get(Calendar.SECOND) +
                "-" + SeleniumTestCase.fileName +
                ".png";

        return SeleniumTestCase.fileName;
    }

    public void takeDriverSnapShot(WebDriver driver, String screenSnapshotName) {
        File browserFile = new File(screenSnapshotName);
        snapshotBrowser((TakesScreenshot) driver, screenSnapshotName, browserFile);
    }

    private void snapshotBrowser(TakesScreenshot driver, String screenSnapshotName, File browserFile) {
        try {

            File scrFile = driver.getScreenshotAs(OutputType.FILE);
            log.info("PNG browser snapshot file name: \"{}\"", browserFile.toURI().toString());
            FileUtils.deleteQuietly(browserFile);
            FileUtils.copyFile(scrFile, browserFile);
        } catch (Exception e) {
            log.error("Could not create browser snapshot: " + screenSnapshotName, e);
        }
    }

}
