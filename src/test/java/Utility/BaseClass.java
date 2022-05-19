package Utility;

import org.openqa.selenium.WebDriver;
/*import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;*/

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


public class BaseClass {
	public static WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	public ExtentReports report;
	public ExtentTest logger;
	
	
	public void setUpSuit() {
		
		excel=new ExcelDataProvider();
		config=new ConfigDataProvider();
		
		//ExtentSparkReporter extent=new ExtentSparkReporter(new File("./Reports/test"+Helper.getCurrentDateTime()+".html"));
		//report=new ExtentReports();
		//report.attachReporter(extent);

		
	}
	
	
	public WebDriver setup() {
		
		config=new ConfigDataProvider();
		
		//Reporter.log("trying to start browser and ready",true);
		
		driver=BrowserFactory.startApp(driver,config.getBrowser(),config.getURL());
		
		//Reporter.log("application and browser is running",true);
		
		    
		    return driver;
	
	}
	
	public void teardown() throws InterruptedException {
	BrowserFactory.quitBrowser(driver);
	}
	


}
