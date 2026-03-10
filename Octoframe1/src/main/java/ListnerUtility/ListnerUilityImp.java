package ListnerUtility;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.Octopussaass.WebdriverUtility.utilityclassobject;

public class ListnerUilityImp implements ITestListener, ISuiteListener {
	 ExtentSparkReporter spark;
		public ExtentReports report;
		public static ExtentTest test;

		@Override
		public void onStart(ISuite suite) {
			// TODO Auto-generated method stub
			System.out.println("report configuration");
			// spark report config
			String time = new Date().toString().replace(" ", "_").replace(":", "_");

			spark = new ExtentSparkReporter("./Advance report/report" + time + ".html");
			spark.config().setDocumentTitle("Octopussaas Test case Results");
			spark.config().setReportName("Octopus saas reporter");
			spark.config().setTheme(Theme.DARK);
			// add environment information and create
			report = new ExtentReports();
			report.attachReporter(spark);
			report.setSystemInfo("os", "windows - 10");
			report.setSystemInfo("Browser", "chrome-10");
		}

		@Override
		public void onFinish(ISuite suite) {
			// TODO Auto-generated method stub
			System.out.println("Report finish");
			report.flush();

		}

		@Override
		public void onTestStart(ITestResult result) {
			// TODO Auto-generated method stub
			System.out.println("----" + result.getMethod().getMethodName() + "--start--");
			test = report.createTest(result.getMethod().getMethodName());
			utilityclassobject.setTest(test);
			 
			test.log(Status.INFO, result.getMethod().getMethodName()+"==started==");

		}

		@Override
		public void onTestSuccess(ITestResult result) {
			// TODO Auto-generated method stub
			System.out.println("----" + result.getMethod().getMethodName() + "--end--");
			test.log(Status.PASS, result.getMethod().getMethodName() + "===completed==");
		}

		@Override
		public void onTestFailure(ITestResult result) {
			// TODO Auto-generated method stub
			String testname = result.getMethod().getMethodName();
			TakesScreenshot ts = (TakesScreenshot) utilityclassobject.getDriver();
			  String srcFile = ts.getScreenshotAs(OutputType.BASE64);
			String time = new Date().toString().replace(" ", "_").replace(":", "_");
			test.addScreenCaptureFromBase64String(srcFile,testname+" "+time);	 
			test.log(Status.FAIL, result.getMethod().getMethodName() + "==Failed==");
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			// TODO Auto-generated method stub
			test.log(Status.FAIL, result.getMethod().getMethodName() + "==Failed==");
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub
			ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
		}

		@Override
		public void onTestFailedWithTimeout(ITestResult result) {
			// TODO Auto-generated method stub
			ITestListener.super.onTestFailedWithTimeout(result);
		}

		@Override
		public void onStart(ITestContext context) {
			// TODO Auto-generated method stub
			ITestListener.super.onStart(context);
		}

		@Override
		public void onFinish(ITestContext context) {
			// TODO Auto-generated method stub
			ITestListener.super.onFinish(context);
		}
}
