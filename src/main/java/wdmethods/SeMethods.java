package wdmethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods extends LearningReport implements WdMethods{
	public int i = 1;
	public RemoteWebDriver driver;
	public void startApp(String browser, String url) {
		try {
			if(browser.equalsIgnoreCase("chrome")){
				 ChromeOptions handlePopup = new ChromeOptions();
					handlePopup.addArguments("--disable-notifications");				
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				driver = new ChromeDriver();
				driver = new ChromeDriver(handlePopup);
			} else if (browser.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("The Browser "+browser+" Launched Successfully");
		} catch (WebDriverException e) {
			System.err.println("The Browser "+browser+" not Launched");
		} finally {
			takeSnap();
		}

	}


	public WebElement locateElement(String locator, String locValue) {
		try {
			switch(locator) {
			case "id"	 : return driver.findElementById(locValue);
			case "class" : return driver.findElementByClassName(locValue);
			case "xpath" : return driver.findElementByXPath(locValue);
			case "LinkText" : return driver.findElementByLinkText(locValue);
			case "name" : return driver.findElementByName(locValue);


			}
		} catch (NoSuchElementException e) {
			System.err.println("The Element is not found");
		} catch (Exception e) {
			System.err.println("Unknown Exception ");
		}
		return null;
	}

	@Override
	public WebElement locateElement(String locValue) {
		WebElement link = driver.findElementByXPath(locValue);
		getText(link);
		clickWithNoSnap(link);
		return null;
	}


	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			//System.out.println("The data "+data+" is Entered Successfully");
			reportStep("The data "+data+" is Entered Successfully", "Pass");
		} catch (WebDriverException e) {
			//System.out.println("The data "+data+" is Not Entered");
			reportStep("The data "+data+" is not Entered", "Fail");
		} finally {
			takeSnap();
		}
	}


	public void clickWithNoSnap(WebElement ele) {
		try {
			ele.click();
			//System.out.println("The Element "+ele+" Clicked Successfully");
			reportStep("The Element "+ele+" Clicked Successfully", "Pass");
		} catch (Exception e) {
			reportStep("The Element "+ele+"is not Clicked","fail");
		}
	}


	@Override
	public void click(WebElement ele) {
		try {
			ele.click();
			//System.out.println("The Element "+ele+" Clicked Successfully");
			reportStep("The Element "+ele+" Clicked Successfully", "Pass");
		} catch (WebDriverException e) {
			//System.err.println("The Element "+ele+"is not Clicked");
			reportStep("The Element "+ele+"is not Clicked", "Pass");
		} finally {
			takeSnap();
		}
	}

	@Override
	public String getText(WebElement ele) {
		ele.getText()	;	
		return null;
	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {
		try {
			Select dd = new Select(ele);
			dd.selectByVisibleText(value);
			//System.out.println("The DropDown Is Selected with VisibleText "+value);
			reportStep("The DropDown Is Selected with VisibleText "+value+".", "Pass");
		} catch (Exception e) {
			reportStep("The DropDown Is not Selected with VisibleText "+value+".", "Fail");
		} finally {
			takeSnap();
		}

	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		try {
			Select dd = new Select(ele);
			dd.deselectByIndex(index);;
			//System.out.println("The DropDown Is Selected with VisibleText "+index);
			reportStep("The DropDown Is Selected with VisibleText "+index+".", "Pass");
		} catch (Exception e) {
			reportStep("The DropDown Is not Selected with VisibleText "+index+".", "Fail");
		} finally {
			takeSnap();
		}
	}

	@Override
	public boolean verifyTitle(String expectedTitle) {
		try {
			String title=driver.getTitle();
			if(title.contains(expectedTitle))
			{
				//System.out.println("Page Title"+expectedTitle+" verified successfully");
				reportStep("Page title verified successfully", "Pass");
			}
			
		} catch (Exception e) {
			reportStep("Page title not verified", "Fail");
		}
		return false;
	}

	@Override
	public void verifyExactText(WebElement ele, String expectedText) {

		try {
			if((ele.getText()).equals(expectedText))
			//System.out.println("Text verified successfully");
				reportStep("Exact text"+expectedText+" verified successfully", "Pass");
		
			
		} catch (Exception e) {
			reportStep("Exact text"+expectedText+" is not verified", "Fail");
		}


	}

	@Override
	public void verifyPartialText(WebElement ele, String expectedText) {
		try {
			if((ele.getText()).contains(expectedText))
			{

				//System.out.println("Text verified successfully");
				reportStep("Partial text"+expectedText+" verified successfully", "Pass");
			
				//System.out.println("Verification failed");
			}
		} catch (Exception e) {
			reportStep("Partial text"+expectedText+" is not verified", "Pass");
		}

	}

	@Override
	public void verifyExactAttribute(WebElement ele, String attribute, String value) {

		try {
			if (attribute.equals(value))
			{
				//System.out.println("The name captured in the screen and duplicate screen same");
				reportStep("The name captured in the screen and duplicate screen same", "Pass");
			}
			else
			{
				//System.out.println("The name captured in the screen and duplicate screen not same");
				reportStep("The name captured in the screen and duplicate screen not same", "Pass");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		try {
			if (attribute.contains(value))
			{
				reportStep("The name captured in the screen and duplicate screen same", "Pass");
				
			}
			else
			{
				//System.out.println("The name captured in the screen and duplicate screen not same");  
				reportStep("The name captured in the screen and duplicate screen not same", "Pass");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyDisplayed(WebElement ele) {

	}

	@Override
	public void switchToWindow(int index) {		
		try {
			Set<String> windows = driver.getWindowHandles();
			int a=windows.size();
			System.out.println(a);
			List<String> numOfWindows=new ArrayList<String>();
			numOfWindows.addAll(windows);
			String secondWindow=numOfWindows.get(index);
			driver.switchTo().window(secondWindow);
			reportStep("Successfully switched to window", "Pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void switchToFrame(WebElement ele) {
		driver.switchTo().frame(ele);
	}

	@Override
	public void acceptAlert() {
		driver.switchTo().alert().accept();

	}

	@Override
	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}

	@Override
	public String getAlertText() {
		driver.switchTo().alert().getText();
		return null;
	}


	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			System.err.println("IOException");
		}
		i++;
	}

	@Override
	public void closeBrowser() {
		driver.close();
	}

	@Override
	public void closeAllBrowsers() {


	}


	@Override
	public void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}







}
