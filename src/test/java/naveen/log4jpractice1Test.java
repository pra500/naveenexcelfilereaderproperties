package naveen;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class log4jpractice1Test {
	
	WebDriver driver;
	
	
	Logger log1=LogManager.getLogger(log4jpractice1Test.class);
			
			
  @Test
  public void fTest() {
	  
	 log1.info("************title************************");
	  
	  System.out.println(driver.getTitle());
  }
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://practicetestautomation.com/practice-test-login/");
  }

  @AfterClass
  public void afterClass() {
	  //after44
	  log1.info("************closing1**********************");
	  log1.info("************closing**********************");
	  log1.info("************closing**********************");
	  log1.info("************closing**********************");
	  
	  
	  log1.info("************sampling**********************");
	  
	  log1.info("************sampling1**********************");
	  
	  
	  driver.quit();
	  
	  
  }

}
