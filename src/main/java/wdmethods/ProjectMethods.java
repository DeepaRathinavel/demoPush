package wdmethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectMethods extends SeMethods{
	@BeforeMethod
	@Parameters({"username","password","url"})
public void Login(String uname,String pwd,String url)
{
		System.out.println("@BeforeMethod");
	startApp("chrome", url);
	WebElement eleUserName = locateElement("id", "username");
	type(eleUserName, uname);
	WebElement elePassword = locateElement("id","password");
	type(elePassword, pwd);
	WebElement eleLogin = locateElement("class","decorativeSubmit");
	click(eleLogin);
	
}
	@AfterMethod
public void close()
{
	System.out.println("@AfterMethod");
	closeBrowser();
}
}
