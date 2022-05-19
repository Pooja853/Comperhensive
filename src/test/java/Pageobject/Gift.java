package Pageobject;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Uistore.GiftUi;

public class Gift {

	WebDriver driver; 

	public Gift(WebDriver driver) {
		
		this.driver=driver;
	}
		
public void gift() {
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	driver.findElement(GiftUi.gift).click();
	
	if(driver.getPageSource().contains("STARTS AT")) {
		System.out.println("text is verified");
	}
	}
}
