package frameworkConstructorprac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DriverandpropertiestogetherTest {
	
	WebDriver driver;
	
  @Test
  public void fTest() {
	  
	  
	  
	  
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
