package DailyWork;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownCheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		//Create object
		ChromeDriver driver=new ChromeDriver();
		//Load the URL
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		//WebElement src1=driver.findElementById("dropdown1");
		WebElement src1 = driver.findElementByXPath("//div[@id=\"contentblock\"]/section/div[1]/select");
		Select dd1=new Select(src1);		
		List<WebElement> options = dd1.getOptions();
		//System.out.println(options.size());
		for(int i=0;i<options.size();i++)
		{
			options.get(i).click();
		}
		//dropdown2

		WebElement src2 = driver.findElementByXPath("//div[@id=\"contentblock\"]/section/div[2]/select");
		Select dd2=new Select(src2);		
		List<WebElement> options1 = dd2.getOptions();
		//System.out.println(options1.size());
		for(int i=0;i<options1.size();i++)
		{
			options1.get(i).click();

		}
		//driver.close();

	}

}
