package Pageobject;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Uistore.NewUi;


public class Bedroom {

	WebDriver driver; 

	public Bedroom(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void newArrival() {
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(NewUi.bed).click();
		driver.findElement(NewUi.Allnew).click();
		driver.findElement(NewUi.close).click();
		
		if(driver.getPageSource().contains("All New Arrivals")) {
			System.out.println("text is verified");
		}
			
		
	}
}
