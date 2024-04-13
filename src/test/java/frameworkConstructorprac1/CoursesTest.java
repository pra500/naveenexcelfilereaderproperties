package frameworkConstructorprac1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class CoursesTest {
	
	
	WebDriver driver;
	Properties prop;
	Courses cs;
	
	
	
  @Test
  public void fTest() {
	  
	  
	  cs=new Courses(driver);
	  cs.get();     //true
  }
  
	
  @Test
  public void fiTest() throws IOException {
	  
	  
	  cs=new Courses(driver,prop);   //HopBrown
	  cs.geti();   //true
	  
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
