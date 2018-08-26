package DailyWork;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//Create object
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		
		//Confirm selenium is checked
		WebElement seleniumcheck = driver.findElementByXPath("//div[@id=\"contentblock\"]/section/div[2]/input");
		
		WebElement text = driver.findElementByXPath("//div[@id=\"contentblock\"]/section/div[2]/input/following-sibling::text()");
		
		System.out.println(text);
		boolean selected2 = seleniumcheck.isSelected();
		if(selected2==false)
		{
			seleniumcheck.click();
			System.out.println("The checkbox is checked");

		}
		else
			System.out.println("checkbox is not checked");
	}

}
		
		
		
		
		
		/*//language checkboxi
		WebElement src1=driver.findElementByXPath("//input[@type='checkbox'][1]");
		src1.click();
		 
		 * boolean selected2 = seleniumcheck.isSelected();
		if(selected2==false)
		{
			seleniumcheck.click();
			System.out.println("The checkbox is checked");

		}
		else
			System.out.println("checkbox is not checked");

		//Deselect the selected checkbox
		boolean selected = driver.findElementByXPath("//div[@id=\"contentblock\"]/section/div[3]/input[2]").isSelected();
		if(selected==true)
		{
			driver.findElementByXPath("//div[@id=\"contentblock\"]/section/div[3]/input[2]").click();
		}
		//SelectAll checkbox
		List<WebElement> a=driver.findElementsByXPath("//div[@id=\"contentblock\"]/section/div[4]/input");
	System.out.println(driver.findElementsByXPath("//div[@id=\"contentblock\"]/section/div[4]"));
		//System.out.println(webElement);
		System.out.println(a.size());
		for(int i=0;i<a.size();i++)
		{
			
			a.get(i).click();
			
		}
		driver.close();
	*/

