package wdmethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeleteLead extends ProjectMethods {
	@BeforeClass(groups="common")
	public void setData()
	{
		testCaseName="DeleteLead";
		testcaseDescription="Delete a Lead";
		author="valar";
		category="Smoke";
		filename="DeleteLead";
		
	}
@Test(/*dependsOnMethods="wdmethods.CreateLead.createLead"groups="regression",dependsOnGroups="sanity",*/ dataProvider="FetchData")
	public void deleteLead(String Pnumber) throws InterruptedException
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
		locateElement("xpath","//ul[@class=\"x-tab-strip x-tab-strip-top\"]/li[2]/a[2]").click();
		WebElement phoneElement = locateElement("xpath", "//input[starts-with(@name,\"phoneAreaCode\")]");
		type(phoneElement, Pnumber);
		locateElement("xpath", "//button[text()=\"Find Leads\"]").click();
		Thread.sleep(3000);
		WebElement firstLink = locateElement("xpath","//div[@class=\"x-grid3-body\"]/div[1]/table/tbody/tr[1]/td[1]/div/a");
		String firstColumnText = firstLink.getText();
		System.out.println(firstColumnText);
		locateElement("//div[@class=\"x-grid3-body\"]/div[1]/table/tbody/tr[1]/td[1]/div/a");
		Thread.sleep(3000);
	    locateElement("//a[text()=\"Delete\"]");		
		locateElement("xpath","//a[@href=\"/crmsfa/control/findLeads\"]").click();
		WebElement leadID = locateElement("xpath","//div[@class=\"x-panel-body x-panel-body-noheader x-panel-body-noborder\"]/div[1]/div/input");
		type(leadID, firstColumnText);
		locateElement("xpath", "//button[text()=\"Find Leads\"]").click();
		WebElement messageLoc = locateElement("xpath","//div[@class=\"x-paging-info\"]");
		String message=messageLoc.getText();
		System.out.println(message);
		verifyExactText(messageLoc, message);
	}

/*@DataProvider(name="DeleteLead")
public Object[][] getDate()
{
	Object[][] data=new Object[1][1];
	data[0][0]="044";	
	return data;
	
}*/

}
