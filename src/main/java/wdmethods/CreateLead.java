package wdmethods;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class CreateLead extends ProjectMethods {	
	@BeforeClass(groups="common")
	public void setData()
	{
		testCaseName="CreateLead";
		testcaseDescription="Create a New Lead";
		author="valar";
		category="Smoke";
		filename="CreateLead";
		
	}
	@Test(/*invocationCount=2,invocationTimeOut=300 groups="smoke",*/ dataProvider="FetchData")
	public void createLead(String cname,String firstname,String lastname) {
		//startApp("chrome", "http://leaftaps.com/opentaps/");
	locateElement("LinkText", "CRM/SFA").click();
	locateElement("LinkText", "Create Lead").click();
	WebElement companyName = locateElement("id", "createLeadForm_companyName");
	type(companyName, cname);
	WebElement fname = locateElement("id","createLeadForm_firstName");
	type(fname, firstname);
	WebElement lname = locateElement("id","createLeadForm_lastName");
	type(lname, lastname);
	WebElement dropdown1 = locateElement("id","createLeadForm_marketingCampaignId");
    selectDropDownUsingText(dropdown1, "Catalog Generating Marketing Campaigns");    
	locateElement("name","submitButton").click();
	WebElement frstname = locateElement("xpath","//span[@id=\"viewLead_firstName_sp\"]");
	String nameText= locateElement("xpath","//span[@id=\"viewLead_firstName_sp\"]").getText();
	//verifyExactText(firstname, nameText);
	verifyPartialText(frstname, nameText);
	
}
	
	
	
	
}
