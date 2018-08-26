package DailyWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// To Fill out form in TestLeaf admin form
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Alight");
		driver.findElementById("createLeadForm_firstName").sendKeys("Krishna");
		driver.findElementById("createLeadForm_lastName").sendKeys("Kumaran");

		WebElement value = driver.findElementById("createLeadForm_dataSourceId");
		Select kk = new Select(value);
		kk.selectByVisibleText("Employee");

	/*	WebElement value1 = driver.findElementById("createLeadForm_marketingCampaignId");
		Select kk1 = new Select(value1);
		kk1.selectByVisibleText("Catalog Generating Marketing Campaigns");

		driver.findElementById("createLeadForm_parentPartyId").sendKeys("98456");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Krish");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("S");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Mr");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Form");
		driver.findElementById("createLeadForm_departmentName").sendKeys("Benefits");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("2K");

		WebElement value2 = driver.findElementById("createLeadForm_currencyUomId");
		Select kk2 = new Select(value2);
		kk2.selectByVisibleText("INR - Indian Rupee");

		WebElement value3 = driver.findElementById("createLeadForm_industryEnumId");
		Select kk3 = new Select(value3);
		kk3.selectByVisibleText("General Services");

		driver.findElementById("createLeadForm_numberEmployees").sendKeys("562");

		WebElement value4 = driver.findElementById("createLeadForm_ownershipEnumId");
		Select kk4 = new Select(value4);
		kk4.selectByVisibleText("Corporation");

		driver.findElementById("createLeadForm_sicCode").sendKeys("4589");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("Checkbox");
		driver.findElementById("createLeadForm_description").sendKeys("TestProgram");
		driver.findElementById("createLeadForm_importantNote").sendKeys("Leaning my Selenium Coding");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("+91");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("600016");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("044");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Benefits Manager");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("kumarankrishna10@gmail.com");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.google.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("Vinoth");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("Thangam");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("Flat No:2,Paradise Apartments");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Romeo Street");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");

		WebElement value5 = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select kk5 = new Select(value5);
		kk5.selectByVisibleText("India");
		
		Thread.sleep(3000);
		
		WebElement value6 = driver.findElementById("generalStateProvinceGeoId");
		Select kk6 = new Select(value6);
		kk6.selectByVisibleText("TAMILNADU");

		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600016");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("16");*/
		
	    driver.findElementByName("submitButton").click();
	    WebElement firstname = driver.findElementByXPath("//span[@id=\"viewLead_firstName_sp\"]");
		System.out.println(firstname);

	}
	}


