package pac1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	WebDriver driver;
	
  @Test
  public void getTest() throws IOException {
	  
	   String path="C:\\Users\\Admin\\eclipse-workspace\\filereaderproperties\\src\\test\\resources\\config.properties";
	   try {
		FileReader fr=new FileReader(path);
		Properties prop=new Properties();
		prop.load(fr);
		String url=prop.getProperty("url");
		System.out.println(url);
		
		
		String browser=prop.getProperty("browser");
		
		
		if(browser.equalsIgnoreCase("chrome"))
				{
			 WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			
				}
		
		else if(browser.equalsIgnoreCase("firefox"));				
		{
			 WebDriverManager.firefoxdriver().setup();
				driver = new ChromeDriver();
			
		}
		
		//else 
		{
			System.out.println("please provide correct browser");
			
		}
		
			
	   
		
		
		
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	
	  
  }

		
		
		
  }
  /*
  @BeforeClass
  public void beforeClass() {
	  
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://naveenautomationlabs.com/opencart/");
  }

  //@AfterClass
  public void afterClass() {
	  
	  driver.close();
  }
*/
}
  
}
