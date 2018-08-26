package week3day1;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();		
		driver.findElementById("createLeadForm_companyName").sendKeys("TestCompany1");
		driver.findElementById("createLeadForm_firstName").sendKeys("ValarMathi");
		driver.findElementById("createLeadForm_lastName").sendKeys("Arikrishnan");
		WebElement src=driver.findElementById("createLeadForm_dataSourceId");
		Select dd=new Select(src);
		dd.selectByVisibleText("Conference");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Valar");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Test");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("TestTitle");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("2000");
		WebElement src1=driver.findElementById("createLeadForm_industryEnumId");
		Select dd1=new Select(src1);
		dd1.selectByVisibleText("Computer Software");
		WebElement src2=driver.findElementById("createLeadForm_ownershipEnumId");
		Select dd2=new Select(src2);
		dd2.selectByVisibleText("Corporation");
		driver.findElementById("createLeadForm_sicCode").sendKeys("1234");
		driver.findElementById("createLeadForm_description").sendKeys("TestDescription");
		driver.findElementById("createLeadForm_importantNote").sendKeys("TestNote");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("123");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("1");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("1");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("test@test.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("TestName");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("Address");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Tambaram");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600045");		
		driver.findElementById("createLeadForm_parentPartyId").sendKeys("1");
		WebElement src6=driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd6=new Select(src6);
		dd6.selectByValue("CATRQ_CARNDRIVER");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("TestLocal");
		driver.findElementById("createLeadForm_departmentName").sendKeys("TestDepartmentName");
		WebElement src3=driver.findElementById("createLeadForm_currencyUomId");
		Select dd3=new Select(src3);
		dd3.selectByValue("QAR");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("189");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("TestTicketSymbol");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9374837433");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("TestURL");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("TestName");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("TestAddress");
		WebElement src4=driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dd4=new Select(src4);
		dd4.selectByVisibleText("India");
		Thread.sleep(1000);
		WebElement src5=driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select dd5=new Select(src5);
		dd5.selectByValue("IN-TN");
		/*List<WebElement> options = dd1.getOptions();
		System.out.println(options.size());
		for (WebElement eachOpt : options) {
			if(eachOpt.getText().startsWith("A"))
			System.out.println(eachOpt.getText());

		}*/
		 driver.close();

	}

}
