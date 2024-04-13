package pages11;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import util11.Base11;

public class Base11Test {
	
	Base11 b;
	
	WebDriver driver;	
	Properties prop;
	
	
  @Test
  public void fTest() throws IOException {
	  
	  b=new Base11(driver, prop);
	  
	  b.getbrow();
	  
  }
}
