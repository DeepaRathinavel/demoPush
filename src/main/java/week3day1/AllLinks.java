package week3day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		//driver.findElementByName("submitButton").click();
				//driver.close();
			    /*List<WebElement> allLinks=driver.findElementsByTagName("a");
			    System.out.println(allLinks.size());
			    for (WebElement eachlink : allLinks) {
				 System.out.println(eachlink.getText());	
				}
			    System.out.println( allLinks.get(1).getText());
			    allLinks.get(1).click();*/
	}

}
