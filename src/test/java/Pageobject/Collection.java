package Pageobject;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Uistore.CollectionUi;

public class Collection {

	WebDriver driver; 

	public Collection(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void collection() {
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(CollectionUi.coll).click();
		driver.findElement(CollectionUi.ul).click();
		
		if(driver.getPageSource().contains("UL Picks")) {
			System.out.println("text is verified");
		}
			
		
	}
	
}
