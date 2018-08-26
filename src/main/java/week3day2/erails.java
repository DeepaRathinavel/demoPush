package week3day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class erails {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		//Create object
		ChromeDriver driver=new ChromeDriver();
		//Load the URL
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS", Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SBC", Keys.TAB);
		boolean selected = driver.findElementById("chkSelectDateOnly").isSelected();
		if(selected)
		{
			driver.findElementById("chkSelectDateOnly").click();
		}		
		Thread.sleep(2000);
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		List<WebElement> tableRow = table.findElements(By.tagName("tr"));

		for(int i=0;i<tableRow.size()-1;i++)
		{
			WebElement firstRow = tableRow.get(i);
			List<WebElement> td = firstRow.findElements(By.tagName("td"));		
			System.out.println(td.get(1).getText());		
		}		
	}

}
