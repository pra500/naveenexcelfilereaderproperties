package naveen;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class JavascriptexecutorallmethodsTest {
	
	
	WebDriver driver;
	
  @Test
  public void getTest() throws InterruptedException {
	  
	  //scrolldown:
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
//	  js.executeScript("document.getElementById('user_email_login').value='rbc@xyz.com';");
//	  js.executeScript("document.getElementById('user_password').value='password';");
//	  js.executeScript("document.getElementById('user_submit').click();");
	  
	  
	  //need to chk below 
	  //js.executeScript("document.getElementByXpath(\"//span[text()='My Account']\").click();");
	  
	  
	  
	  
	  js.executeScript("document.getElementsByName('search').value='laptop';");
	  
	  
	  js.executeScript("window.scrollBy(0, 230)", "");
	  
	  Thread.sleep(8000);
	  js.executeScript("window.scrollBy(100, 240)", "");
	  
	 	
	  
	  
	  //js.executeScript("alert('enter correct login credentials to continue');");
	  Thread.sleep(8000);
	  
	  
	  
	  
	  
	  
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
	  
	  driver.quit();
	  
  }

}
