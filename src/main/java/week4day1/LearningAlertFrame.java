package week4day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningAlertFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//Create object
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElementById("lst-ib").sendKeys("W3school popup box", Keys.TAB);
		driver.findElementByName("btnK").click();
		driver.findElementByXPath("//a[text()='JavaScript Popup Boxes - W3Schools']").click();
        driver.findElementByXPath("//a[@href=\"tryit.asp?filename=tryjs_prompt\"]").click();
        //driver.findElementByName("iframeResult");
      //WebElement frame1 = driver.findElementByXPath("//iframe[@id='iframeResult']");
       driver.switchTo().frame(0);      
        driver.findElementByXPath("//button[text()='Try it']").click();
       
	}

}
