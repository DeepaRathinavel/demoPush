package wdmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ZoomCar extends ProjectMethods{
	@BeforeSuite
	public void setData()
	{
		testCaseName="ZoomCar";
		testcaseDescription="TestLeaf search";
		author="valar";
		category="Smoke";
		
	}
	@Test
	public void zoomCar() {
	startApp("chrome", "https://www.zoomcar.com/chennai");
	locateElement("LinkText","Start your wonderful journey").click();
	locateElement("xpath","(//div[@class=\"items\"])[1]").click();
	locateElement("xpath","//button[@class=\"proceed\"]").click();
	locateElement("xpath","//div[@class=\"days\"]/div[2]").click();
	locateElement("xpath","//button[@class=\"proceed\"]").click();
	locateElement("xpath","//button[@class=\"proceed\"]").click();
	
	//WebElement locateElement = locateElement("xpath", "//button[@class=\"book-car\"]");
	
	List<WebElement> xpathCount =driver.findElements(By.xpath("//button[@class=\"book-car\"]"));
	System.out.println(xpathCount.size());
	List<String> onlyPrice = new ArrayList<String>();
	System.out.println(driver.findElementByXPath("//div[@class=\"price\"]").getText());
	/*List<WebElement> allPriceText = driver.findElementsByXPath("//div[@class=\"price\"]/text()");
	
	for (WebElement eachPrice : allPriceText) {
		onlyPrice.add(eachPrice.getText());
		System.out.println(onlyPrice);
	}*/
	
	


	}
}
