package DailyWork;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[@href=\"/crmsfa/control/leadsMain\"]").click();
		driver.findElementByLinkText("Merge Leads").click();;
		driver.findElementByXPath("//img[@src=\"/images/fieldlookup.gif\"]").click();
		Set<String> windows = driver.getWindowHandles();
		int a=windows.size();
		System.out.println(a);
		List<String> numOfWindows=new ArrayList<String>();
		numOfWindows.addAll(windows);
		String secondWindow=numOfWindows.get(1);
		driver.switchTo().window(secondWindow);
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElementByXPath("//input[@name=\"id\"]").sendKeys("10037");
		driver.findElementByXPath("//button[text()=\"Find Leads\"]").click();
		//driver.findElementByLinkText("10037").click();
		int allrows=driver.findElementsByXPath("//table[@class=\"x-grid3-row-table\"]/tbody/tr[1]/td[1]/div/a").size();
		System.out.println(allrows);
		//allrows.get(0).click();	
		//driver.switchTo().window(numOfWindows.get(0));
		driver.close();
		driver.switchTo().window(numOfWindows.get(0));
		//driver.findElementByLinkText("Merge Leads").click();;
		driver.findElementByXPath("//a[@class=\"buttonDangerous\"]").click();
		driver.switchTo().alert().accept();
		//driver.findElementByLinkText("Find Leads").click();	
		driver.findElementByXPath("//input[@id=\"ComboBox_partyIdFrom\"]").sendKeys("10037", Keys.TAB);
		Thread.sleep(3000);
		driver.findElementByXPath("//a[@class=\"buttonDangerous\"]").click();
		driver.switchTo().alert().accept();
		String text = driver.findElementByXPath("//div[@class=\"errorMessageHeader\"]").getText();
		System.out.println(text);
		if(text!= null)		
			System.out.println("Error message shown successfully");
		else
			System.out.println("Incorrect error message");			
		driver.findElementByXPath("//img[@src=\"/images/fieldlookup.gif\"]").click();	
		Set<String> windows1 = driver.getWindowHandles();
		int a1=windows.size();
		System.out.println(a1);
		List<String> numOfWindows1=new ArrayList<String>();
		numOfWindows1.addAll(windows1);
		String secondWindow1=numOfWindows1.get(1);
		driver.switchTo().window(secondWindow1);
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/img.png");
		FileUtils.copyFile(scr, dest);
		
		
	}

}
