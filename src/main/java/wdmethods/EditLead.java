package wdmethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EditLead extends ProjectMethods {
	@BeforeClass(groups="common")
	public void setData()
	{
		testCaseName="EditLead";
		testcaseDescription="Edit a Lead";
		author="valar";
		category="Smoke";
		filename="EditLead";
	}
	@Test(/*dependsOnMethods="wdmethods.CreateLead.createLead" groups="sanity", dependsOnGroups="smoke",*/ dataProvider="FetchData")
public void editLead(String firstName, String CName) throws InterruptedException {
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
	WebElement fnameelement = locateElement("xpath", "//input[@id=\"ext-gen248\"]");
	type(fnameelement,firstName);
	locateElement("xpath", "//button[text()=\"Find Leads\"]").click();
	Thread.sleep(3000);
	//String firstColumnText = locateElement("//div[@class=\"x-grid3-body\"]/div[1]/table/tbody/tr[1]/td[1]/div/a").getText();
	locateElement("//div[@class=\"x-grid3-body\"]/div[1]/table/tbody/tr[1]/td[1]/div/a");
	String title = driver.getTitle();
	System.out.println(title);
	verifyTitle(title);
	Thread.sleep(3000);
	locateElement("//div[@class=\"frameSectionExtra\"]/a[3]");
	WebElement cname = locateElement("id", "updateLeadForm_companyName");
	type(cname, CName);
	locateElement("xpath", "//input[@value=\"Update\"]").click();
	WebElement cNameLoc = locateElement("id","viewLead_companyName_sp");
	String newCname= locateElement("id","viewLead_companyName_sp").getText();
	verifyExactText(cNameLoc, newCname);
}
	/*@DataProvider(name="EditLead")
	public Object[][] getDate()
	{
		Object[][] data=new Object[1][2];
		data[0][0]="valar";
		data[0][1]="PalmTree";
		
		return data;
		
	}*/
}