package week3day1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcAgent {

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
		//WebElement findElement = driver.findElement(By.xpath("//span[(text(),'AGENT LOGIN')]"));
		//findElement.click();
		driver.findElementById("userRegistrationForm:userName").sendKeys("12345");
		driver.findElementById("userRegistrationForm:password").sendKeys("12345");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("12345");
		WebElement src=driver.findElementById("userRegistrationForm:securityQ");
		Select dd=new Select(src);
		dd.selectByVisibleText("What is your pet name?");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("scoppy");
		WebElement src1=driver.findElementById("userRegistrationForm:prelan");
		Select dd1=new Select(src1);
		dd1.selectByVisibleText("English");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("12345");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("12345");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("12345");
		WebElement src2=driver.findElementById("userRegistrationForm:countries");
		Select dd2=new Select(src2);
		dd2.selectByVisibleText("India");
		driver.findElementById("userRegistrationForm:email").sendKeys("test@test.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("123453434");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600045",Keys.TAB);
		WebElement src3=driver.findElementById("userRegistrationForm:cityName");
		Select dd3=new Select(src3);
		dd3.selectByIndex(0);
		driver.findElementById("userRegistrationForm:landline").sendKeys("1234534");
	    driver.close();
	}

}
