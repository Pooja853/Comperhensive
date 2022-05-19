package Runner;


import org.junit.runner.RunWith;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pageobject.Bedroom;
import Pageobject.Collection;
import Pageobject.Gift;
import Pageobject.Kids;
import Pageobject.Login;
import Pageobject.Room;
import Pageobject.Sale;
import Pageobject.Search;
import Pageobject.Study;
import Pageobject.Tvunits;
import Utility.BaseClass;
import Utility.Log4j;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features",
				 glue="stepDef",
				 dryRun=false,
				 plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

					
public class Testexecution extends BaseClass {
	@Test(priority=1)
		public void loginpage() {
		logger=report.createTest("login-We open");
		Login page=PageFactory.initElements(driver,Login.class);
		logger.info("Login 'We Accept' text in the login page");
		page.login();
		logger.pass("success");
	}
	@Test(priority=2)
	public void page1() {
		
		logger=report.createTest("Bedroom-AllNewArrivals");
		Bedroom page=PageFactory.initElements(driver,Bedroom.class);
		logger.info("Verifying 'AllNewArrivals'under bedroom page");
		page.newArrival();
		logger.pass("success");
	}
	
	@Test(priority=3)
	public void page2() throws InterruptedException {
		
		logger=report.createTest("Sale- Accept");
		Sale page=PageFactory.initElements(driver,Sale.class);
		logger.info("searching 'We Accept' text in the footer page test");
		page.sofa();
		logger.pass("success");
	}
	
	@Test(priority=4)
	public void page3() {
		
		logger=report.createTest("Gift-STARTS AT");
		Gift page=PageFactory.initElements(driver,Gift.class);
		logger.info("verify 'STARTS AT' text in giftcard page test");
		page.gift();
		logger.pass("text verified");
	}
	
	@Test(priority=5)
	public void page4() {
		
		logger=report.createTest("KidsRoom-KidsPlay Tables");
		Kids page=PageFactory.initElements(driver,Kids.class);
		logger.info("verify 'KidsPlay Tables' text in result page test");
		page.kid();
		logger.pass("text verified");
		
	}
	
	@Test(priority=6)
	public void page5() {
		
		logger=report.createTest("living-250 Products");
		Room page=PageFactory.initElements(driver,Room.class);
		logger.info("verify '250 Products' text under the top of heading test");
		page.room();
		logger.pass("text verified");
		
	}
	
	@Test(priority=7)
	public void page6() {
		
		logger=report.createTest("Search-Showcases");
		Search page=PageFactory.initElements(driver,Search.class);
		logger.info("verify the result of Showcases is opened ");
		page.search();
		logger.pass("text verified");
		
	}
	
	@Test(priority=8)
	public void page7() {
		
		logger=report.createTest("Study-Tablecolor");
		Study page=PageFactory.initElements(driver,Study.class);
		logger.info("verify 'Orange' text is displayed");
		page.study();
		logger.pass("text verified");
		
	}
	
	@Test(priority=9)
	public void page8() {
		
		logger=report.createTest("TvUnits-searchbox");
		Tvunits page=PageFactory.initElements(driver,Tvunits.class);
		logger.info("verify 'Tv unit' text is displayed in heading test");
		page.tvUnits();
		logger.pass("text verified");
		
	}
	
	
	
	@Test(priority=10)
	public void page10() {
		
		logger=report.createTest("Collections-exclusive");
		Collection page=PageFactory.initElements(driver,Collection.class);
		logger.info("verify 'UL Picks' text is present in the page");
		page.collection();
		logger.pass("text verified");
		Log4j.createLog();
	}
	
	
}

