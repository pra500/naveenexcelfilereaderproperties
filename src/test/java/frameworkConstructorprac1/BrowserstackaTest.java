package frameworkConstructorprac1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BrowserstackaTest {
	
	
	Browserstacka br;
	WebDriver driver;
	Properties prop;
	
	
	
  @Test(priority = 0)
  public void fTest() throws IOException {	  
	  
	  br=new Browserstacka(driver, prop); 
	  br.get();	  	  
	  
  }
  
  
  //@BeforeTest
  public void beforeTest() {
	  
	  
	  
  }

  //@AfterTest
  public void afterTest() {
	  
	  
	  
	 
  }
  
  

}
