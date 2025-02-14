package com.mystore.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportUtil {

    private static ExtentReports extent;
    private static ExtentTest test;

    // Initialize ExtentReports
    public static ExtentReports initExtentReports() {
        // Initialize ExtentReports and SparkReporter
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extentReport.html");
        sparkReporter.config().setReportName("Selenium Test Report");
        sparkReporter.config().setDocumentTitle("Test Execution Report");

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        return extent;
    }

    // Start a test in ExtentReports
    public static ExtentTest startTest(String testName, String description) {
        test = extent.createTest(testName, description);
        return test;
    }

    // Log step details (pass/fail)
    public static void logStep(String message, String status) {
        switch (status.toLowerCase()) {
            case "pass":
                test.pass(message);
                break;
            case "fail":
                test.fail(message);
                break;
            case "skip":
                test.skip(message);
                break;
            default:
                test.info(message);
        }
    }

    // End the test and write to the report
    public static void endTest() {
        extent.flush();
    }
}
