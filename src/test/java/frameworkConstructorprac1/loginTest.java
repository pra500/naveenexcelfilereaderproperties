package frameworkConstructorprac1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class loginTest {
		
	WebDriver driver;
	login lg;
	
	
  @Test
  public void fTest() {
	  
	  lg=new login(driver);
	 lg.get();
	 lg.get1();
	 lg.get2();
	 	  
	  
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
	  driver.close();
	  
  }
  
  

}
