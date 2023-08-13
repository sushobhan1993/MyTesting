package FailedTestCaseRetry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {

    // Count to retry items
    private int retryCount = 0;

    // Set max limit for retry
    private static final int MAX_RETRY_LIMIT = 3;

    // This method determines whether to retry a failed test case
    public boolean retry(ITestResult result) {
        if (retryCount < MAX_RETRY_LIMIT) {
            retryCount++;
            return true; // Retry the test
        }
        return false; // Do not retry the test
    }
}
