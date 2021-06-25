package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    private static String SUITE_NAME;

    @Override
    public void onTestStart(ITestResult iTestResult) {
        Log.info("## " + getTestMethodName(iTestResult) + " test method started.");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        Log.info("## " + getTestMethodName(iTestResult) + " test method succeed.");
        DBLog.pass(SUITE_NAME, getTestMethodName(iTestResult));
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        Log.info("## " + getTestMethodName(iTestResult) + " test method failed.");
        DBLog.fail(SUITE_NAME, iTestResult.getTestName());

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        Log.info("## " + getTestMethodName(iTestResult) + " test method skipped.");
        DBLog.skip(SUITE_NAME, iTestResult.getTestName());

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        Log.info("## " + getTestMethodName(iTestResult) + " test method failed within success %.");

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        SUITE_NAME = iTestContext.getSuite().getName();
        Log.info("#### " + iTestContext.getName() + " test classes started.");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        Log.info("#### " + iTestContext.getName() + " test classes finished.");
    }

    private static String getTestMethodName(ITestResult result) {
        return result.getMethod().getConstructorOrMethod().getName();
    }
}
