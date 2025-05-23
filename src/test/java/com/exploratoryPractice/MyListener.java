package com.exploratoryPractice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {
    public void onTestStart(ITestResult result) {
        System.out.println("Test started: listenercheck 122434345 " + result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test succeeded: " + result.getName());
    }
    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed: " + result.getName());
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("Test skipped: " + result.getName());
    }
    public void onStart(ITestContext context) {
        System.out.println("Test suite started: " + context.getName());
    }
    public void onFinish(ITestContext context) {
        System.out.println("Test suite finished: " + context.getName());
    }
}
