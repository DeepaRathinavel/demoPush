package wdmethods;
import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import week5day2.LearningExcel;

public class LearningReport {

	public static ExtentReports extent;
	public static  ExtentTest test;
	public static String testCaseName,testcaseDescription,author,category,filename;

	@DataProvider(name="FetchData")
	
	public Object[][] getData() throws IOException
	{
		Object[][] excelData = LearningExcel.getExcelData(filename);
		return excelData;		
	}
	
	
	@BeforeSuite(groups="common")
	public void startReport()
	{
		ExtentHtmlReporter html=new ExtentHtmlReporter("./reports/result.html");
		new ExtentReports();
		html.setAppendExisting(true);
		extent=new ExtentReports();
		extent.attachReporter(html);
	}

	@AfterSuite(groups="common")
	public void stopReport()
	{
		extent.flush();
	}

	@BeforeMethod(groups="common")
	public void stepTest()
	{
		test=extent.createTest(testCaseName,testcaseDescription);
		test.assignAuthor(author);
		test.assignCategory(category);


		//	test.pass("Demo Sales manager ",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img.png").build());
		//test.fail("Password entered");
	}

	public void reportStep(String desc,String status)
	{
		if(status.equalsIgnoreCase("pass"))
		{
			test.pass(desc);
		}
		if(status.equalsIgnoreCase("fail"))
		{
			test.fail(desc);
		}

	}

}
