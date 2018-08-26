package DailyWork;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
		
		public class DuplicateLead {

			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				FirefoxDriver driver=new FirefoxDriver();
				driver.get("http://leaftaps.com/opentaps/");
				Thread.sleep(1000);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElementByXPath("//input[@id='username']").sendKeys("DemosalesManager");
				driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
				driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
				driver.findElementByXPath("//div[@for='crmsfa']//a").click();
				driver.findElementByLinkText("Leads").click();
				driver.findElementByLinkText("Find Leads").click();
				driver.findElementByXPath("//*[text()='Email']").click();
				driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("Connor@tnas.com");
				driver.findElementByXPath("//button[text()='Find Leads']").click();
				 Thread.sleep(2000);
				 String fName=driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]").getText();
				 System.out.println(fName);
				 driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a").click();
				 driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
				 String headerName=driver.findElementByXPath("//*[@id='sectionHeaderTitle_leads']").getText();
				 if(headerName.equals("Duplicate Lead"))
				 {
					 System.out.println("Header name matched  : " +headerName);
				 }
				 else 
				 {
					 System.out.println("Header name not matched : " +headerName);
				 }
				 
				 String dFname=driver.findElementByXPath("//*[@id='createLeadForm_firstName']").getAttribute("Value");
				 
				 System.out.println(dFname);
				 
				 if (dFname.equals(fName))
				 {
					System.out.println("The name captured in the screen and duplicate screen same"); 
				 }
				 else
				 {
					 System.out.println("The name captured in the screen and duplicate screen not same");  
				 }
				 
				 driver.findElementByLinkText("Create Lead").click();
				 driver.close();
				 
				 
				
			}
		}

