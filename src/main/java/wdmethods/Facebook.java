package wdmethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Facebook extends ProjectMethods{
	@BeforeSuite
	public void setData()
	{
		testCaseName="Facebook";
		testcaseDescription="TestLeaf search";
		author="valar";
		category="Smoke";
		
	}
	@Test
public void facebook() throws InterruptedException
{
		
	startApp("chrome", "https://www.facebook.com/");
	WebElement eleUserName = locateElement("xpath", "//table[@role=\"presentation\"]/tbody/tr[2]/td[1]/input");
	type(eleUserName, "deepamca88@gmail.com");
	WebElement elePassword = locateElement("xpath","//table[@role=\"presentation\"]/tbody/tr[2]/td[2]/input");
	type(elePassword, "htyutuyt");
    locateElement("xpath","//table[@role=\"presentation\"]/tbody/tr[2]/td[3]/label/input").click();
    	
	WebElement search = locateElement("xpath", "//input[@aria-label=\"Search\"]");
	type(search,"testleaf");
	Thread.sleep(2000);
	locateElement("xpath", "//button[@data-testid=\"facebar_search_button\"]").click();
	//locateElement("(//div[@role=\"gridcell\"]/a)[1]").click();
	Thread.sleep(3000);
	//String linktest = locateElement("//a[@href=\"https://www.facebook.com/TestleafSolutionsIncChennai/?ref=br_rs\"]/div").getText();
	WebElement link = locateElement("//a[@href=\"https://www.facebook.com/TestleafSolutionsIncChennai/?ref=br_rs\"]/div");
	if(driver.getPageSource().contains("TestLeaf"))
	{
		System.out.println("TestLeaf text is verified");
	}
	Thread.sleep(2000);
    String text = locateElement("xpath", "(//button[contains(text(),'Like')])[1]").getText();
	if(text.equalsIgnoreCase("Like"))
	{
		locateElement("xpath", "(//button[contains(text(),'Like')])[1]").click();
	}
	else if(text.equalsIgnoreCase("Liked"))
	{
		System.out.println("Already liked TestLeaf site");
		//locateElement("(//a[@href=\"https://www.facebook.com/TestleafSolutionsIncChennai/?ref=br_rs\"])[2]").click();
	}
	Thread.sleep(2000);
    locateElement("(//a[@href=\"https://www.facebook.com/TestleafSolutionsIncChennai/?ref=br_rs\"])[2]").click();
		//String text2 = locateElement("xpath", "(//span[contains(text(),'TestLeaf')])[1]").getText();
	WebElement leaftext = locateElement("xpath", "(//span[contains(text(),'TestLeaf')])[1]");
	verifyPartialText(leaftext, "TestLeaf");
	WebElement links = locateElement("xpath", "//a[contains(@href,\"/reaction\")]/span[2]");
	String text2 = links.getText();
	System.out.println(text2);
	
	
}
}
