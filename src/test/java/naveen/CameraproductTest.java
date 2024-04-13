package naveen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CameraproductTest extends Cameraproductpage{
		
  static WebDriver driver;
	
  @Test
  public void verify1Test() {
	  
	  driver.get
  }
  
  @Test
  public void verify2Test() {
  }
  
  @Test
  public void verify3Test() {
  }
  
  @Test
  public void verify4Test() {
  }
  
  @Test
  public void verify5Test() {
  }
  
  @BeforeClass
	public void beforeClass() {

	
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://naveenautomationlabs.com/opencart/");		
		
	}
  
  
  @AfterClass
	public void afterClass() {
		driver.close();
	}
	
}
