package week4day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragDrop {

	public static void main(String[] args) {
		//set driver
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");				
				//Create object
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				//Load the URL
				driver.get("http://jqueryui.com");
				driver.findElementByLinkText("Draggable").click();
				driver.switchTo().frame(0);
				Actions builder=new Actions(driver);
				WebElement webElement = driver.findElementByXPath("//div[@id='draggable']/p");
				builder.dragAndDropBy(webElement, 10, 100).perform();

	}

}
