package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    private static String SUITE_NAME;

    @Override
    public void onTestStart(ITestResult iTestResult) {
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        DBLog.pass(SUITE_NAME, getTestMethodName(iTestResult));
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        DBLog.fail(SUITE_NAME, iTestResult.getTestName());

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        DBLog.skip(SUITE_NAME, iTestResult.getTestName());

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        SUITE_NAME = iTestContext.getSuite().getName();
    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }

    private static String getTestMethodName(ITestResult result) {
        return result.getMethod().getConstructorOrMethod().getName();
    }
}
