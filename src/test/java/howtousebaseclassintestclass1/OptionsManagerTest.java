package howtousebaseclassintestclass1;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import howtousebaseclassintestclass.OptionsManager;

public class OptionsManagerTest extends OptionsManager{
	
	OptionsManager om;
	
	
	
  @Test
  public void fTest() throws IOException {
	  
	  om=new OptionsManager();
	  om.getbrowserincognito();
	 System.out.println(driver.getTitle());
	 
	 
	 
	  
	  
  }
  

}
