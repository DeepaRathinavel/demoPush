package wdmethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DuplicLead extends ProjectMethods {
	@Test
public void duplicLead() throws InterruptedException
{
	/*startApp("chrome", "http://leaftaps.com/opentaps/");
	WebElement eleUserName = locateElement("id", "username");
	type(eleUserName, "DemoSalesManager");
	WebElement elePassword = locateElement("id","password");
	type(elePassword, "crmsfa");
	WebElement eleLogin = locateElement("class","decorativeSubmit");
	click(eleLogin);*/
	locateElement("LinkText", "CRM/SFA").click();
	locateElement("xpath", "//a[@href=\"/crmsfa/control/leadsMain\"]").click();
	locateElement("xpath", "//a[@href=\"/crmsfa/control/findLeads\"]").click();
	locateElement("xpath", "//*[text()='Email']").click();
	WebElement email = locateElement("xpath", "//input[@name='emailAddress']");
	type(email, "Connor@tnas.com");
	locateElement("xpath", "//button[text()='Find Leads']").click();
	Thread.sleep(2000);
	String fname = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]").getText();
	System.out.println(fname);
	locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a").click();
	locateElement("xpath", "//a[text()='Duplicate Lead']").click();
	WebElement headerLoc = locateElement("xpath", "//*[@id='sectionHeaderTitle_leads']");
	String headername = locateElement("xpath", "//*[@id='sectionHeaderTitle_leads']").getText();
	verifyExactText(headerLoc, headername);
	WebElement locateElement = locateElement("xpath", "//*[@id='createLeadForm_firstName']");
	String attribute = locateElement("xpath", "//*[@id='createLeadForm_firstName']").getAttribute("value");
	System.out.println(attribute);
	verifyExactAttribute(locateElement, attribute, fname);
	locateElement("LinkText", "Create Lead").click();
	
}
}
