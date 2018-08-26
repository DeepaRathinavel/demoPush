package week4day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWindow {

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
		driver.findElementByLinkText("Contact Us").click();
		Set<String> windows = driver.getWindowHandles();
		int a=windows.size();
		System.out.println(a);
		List<String> numOfWindows=new ArrayList<String>();
		numOfWindows.addAll(windows);
		String secondWindow=numOfWindows.get(1);
		driver.switchTo().window(secondWindow);
		String title=driver.getTitle();
		System.out.println("Current window title"+title);
		String url=driver.getCurrentUrl();
		System.out.println("Current window URL"+url);
		driver.close();	
	}

}
