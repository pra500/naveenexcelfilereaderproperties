package pac1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class New2 {
	
	WebDriver driver;
	
	  String path="C:\\Users\\Admin\\eclipse-workspace\\filereaderproperties\\src\\test\\resources\\config.properties";
	  
	  
	   
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
		
		else if(browser.equalsIgnoreCase("edge"));
		{			
			 WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
						
		}
		
		
		
		
		{
			System.out.println("please provide correct browser");
			
		}
		
			
	   }
	   
		
		
		
	}
	
	  
 }
}
		
		
		


}
