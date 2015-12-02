package framework;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * Created by Lena on 01.10.2014.
 */
public class RetryAnalyzer implements IRetryAnalyzer {
    private int count = 0;
    private int maxCount = 1; // set your count to re-run test from 0
    protected Logger log;
    private static Logger testBaseLog;

    static {
        PropertyConfigurator.configure("test-config/log4j.properties");
        testBaseLog = Logger.getLogger("TestClassName");
    }

    public RetryAnalyzer()
    {
        testBaseLog.trace( " ModeledRetryAnalyzer constructor " + this.getClass().getName() );
        log = Logger.getLogger("TestClassName");
    }

    @Override
    public boolean retry(ITestResult result) {
        testBaseLog.trace("running retry logic for  '"
                + result.getName()
                + "' on class " + this.getClass().getName() );
        if(count < maxCount) {
            count++;
            return true;
        }
        return false;
    }
}
