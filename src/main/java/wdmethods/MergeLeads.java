package wdmethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MergeLeads extends ProjectMethods{

	@BeforeClass
	public void setData()
	{
		testCaseName="MergeLead";
		testcaseDescription="Merge two Leads";
		author="Deepa";
		category="Smoke";

	}
	@Test(enabled=false)
	public void mergeLead() throws InterruptedException
	{
		startApp("chrome", "http://leaftaps.com/opentaps/");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		locateElement("LinkText", "CRM/SFA").click();
		locateElement("xpath", "//a[@href=\"/crmsfa/control/leadsMain\"]").click();
		locateElement("LinkText", "Merge Leads").click();
		locateElement("xpath", "//img[@src=\"/images/fieldlookup.gif\"]").click();
		switchToWindow(1);
		getTitle();
		WebElement locateElement = locateElement("xpath","//input[@name=\"id\"]");
		type(locateElement, "10571");		
		locateElement("xpath", "//button[text()=\"Find Leads\"]").click();
		Thread.sleep(3000);
		locateElement("xpath","//table[@class=\"x-grid3-row-table\"]/tbody/tr[1]/td[1]/div/a").click();
		Thread.sleep(3000);
		switchToWindow(0);
		locateElement("xpath", "//a[@class=\"buttonDangerous\"]").click();
		acceptAlert();		
		Thread.sleep(3000);
		WebElement errMsgLoc = locateElement("xpath","//div[@class=\"errorMessageHeader\"]");
		String errMsg= locateElement("xpath","//div[@class=\"errorMessageHeader\"]").getText();
		verifyExactText(errMsgLoc, errMsg);
		takeSnap();		
	}
}
