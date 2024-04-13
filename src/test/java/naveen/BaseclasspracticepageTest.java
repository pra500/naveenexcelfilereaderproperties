package naveen;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class BaseclasspracticepageTest extends Baseclasspracticepage{
	
	Baseclasspracticepage b;
		
	
  @Test
  public void fTest() throws IOException {
	  
	  b=new Baseclasspracticepage();		
	  String s=b.getenv();
	  System.out.println(s);
	  
	  b.init_env();
	  
	  b.init_browserlaunch();
	  
	  
	  System.out.println(driver.getTitle()); 
	  
	  
	  
	  
	  
	  
  }
  

}
