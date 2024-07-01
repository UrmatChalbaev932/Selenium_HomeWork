package org.example.ui.listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    private int retryCount =0;
    private static final int maxRetryCount = 3;

    @Override
    public boolean retry(ITestResult result){
        if(retryCount<maxRetryCount){ // set the max retry count
            retryCount++;
            return true; // retry the test
        }
        return false; // no more retries
    }
}
