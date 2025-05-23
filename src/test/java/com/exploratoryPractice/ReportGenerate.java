package com.exploratoryPractice;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.Test;

public class ReportGenerate {
   @Test
    public void test1()
    {
        ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/AutomationReport.html");
    }
}
