package week3day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Learningxpath {

	public static void main(String[] args) {
		//set driver
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				
				//Create object
				ChromeDriver driver=new ChromeDriver();
				//Load the URL
				driver.get("http://leaftaps.com//opentaps");
				driver.manage().window().maximize();
				driver.findElementById("username").sendKeys("DemoSalesManager");
				driver.findElementById("password").sendKeys("crmsfa");
				driver.findElementByClassName("decorativeSubmit").click();
				driver.findElementByLinkText("CRM/SFA").click();
				driver.findElementByXPath("//a[text()=\"Leads\"]").click();
				driver.findElementByXPath("//a[text()=\"Find Leads\"]").click();
				//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.findElementByXPath("//div[contains(@id,'gen248')]/input").sendKeys("Valar");
				driver.findElementByXPath("//button[text()=\"Find Leads\"]").click();
				WebDriverWait wait=new WebDriverWait(driver,10);
				wait.until(ExpectedConditions.elementToBeClickable(By.className("linktext")));
				driver.findElementByXPath("//a[text()=\"ValarMathi\"]").click();
	}

}
