package DailyWork;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class EditCompany {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElementById("username").sendKeys("DemosalesManager");
			driver.findElementById("password").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
			driver.findElementByLinkText("CRM/SFA").click();
			driver.findElementByLinkText("Leads").click();
			driver.findElementByLinkText("Find Leads").click();
			driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Harry");
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"))).click();
			System.out.println(driver.findElementById("sectionHeaderTitle_leads").getText());
			driver.findElementByLinkText("Edit").click();
			driver.findElementById("updateLeadForm_companyName").sendKeys(Keys.CONTROL,"a",Keys.DELETE);
			Thread.sleep(500);
			driver.findElementById("updateLeadForm_companyName").sendKeys("Infoysis");
			driver.findElementByName("submitButton").click();
			/*WebElement data=driver.findElementByXPath("//[@id=\"G11288_body\"]/table/tbody/tr[1]/td[2]");
			String companyText=data.getText();*/
			String companyText=driver.findElementByXPath("//*[@id=\"viewLead_companyName_sp\"]").getText();
			System.out.println(companyText);
			String companyName="";
			  for(int i = 0; i < companyText.length(); i++)
		        {
		            if(companyText.charAt(i) == ' ')
		            {
		                 companyName=companyText.substring(0, i);
		            }
		        }
			System.out.println(companyName);
			if (companyName.equals("Infoysis"))
			{
				System.out.println("Company Value updated successfully .New Company is:  " + companyText);
			}
			else
			{
				System.out.println("Company value not updated ");
			}
			
			
		
			

		}

	}


