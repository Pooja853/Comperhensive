package Pageobject;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;



import Uistore.searchUi;
import Utility.ExcelDataProvider;

public class Search {

	WebDriver driver; 

	public Search(WebDriver driver) {
		
		this.driver=driver;
	}
		
public void search() {
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	ExcelDataProvider excel=new ExcelDataProvider();
	String data=excel.getStringData("Input", 0, 0);
	
	driver.findElement(searchUi.input).sendKeys(data);
	driver.findElement(searchUi.click).click();
	
	}
}

