package Pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Uistore.KidsUi;

public class Kids {

	WebDriver driver; 

	public Kids(WebDriver driver) {
		
		this.driver=driver;
	}
		
public void kid() {
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	driver.findElement(KidsUi.kid).click();
	driver.findElement(KidsUi.play).click();
	
	if(driver.getPageSource().contains("Kids Play Tables")) {
		System.out.println("text is verified");
	}


	}
}