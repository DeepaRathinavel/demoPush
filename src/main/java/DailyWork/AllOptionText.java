package DailyWork;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllOptionText {

	public static void main(String[] args) {
		//set driver
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");				
		//Create object
		ChromeDriver driver=new ChromeDriver();
		//Load the URL
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		//driver.find_element_by_link_text("Login.java").click()
		driver.findElementByLinkText("AGENT LOGIN").click();
		driver.findElementByLinkText("Sign up").click();
		List<WebElement> options = driver.findElementsByXPath("//select[@id=\"userRegistrationForm:countries\"]/option");
		System.out.println(options.size());
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}

	}

}
