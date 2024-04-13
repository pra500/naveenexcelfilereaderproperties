package util11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base11 {
	
	 public WebDriver driver;
	   public Properties prop;
	   
		
		public Base11(WebDriver driver, Properties prop) throws IOException
		{
			this.driver=driver;
			this.prop=prop;
			
			String filepath="C:\\Users\\Admin\\eclipse-workspace\\filereaderproperties\\src\\test\\resources\\frameworkConstructorprac1.properties";
			FileInputStream fip=new FileInputStream(filepath);
			 prop=new Properties();
			prop.load(fip);
		
			
		}
		
		
		public void getbrow()
		{
			String browser=prop.getProperty("browser");
			String url=prop.getProperty("url");
			if(browser.equalsIgnoreCase("chrome"))
			{
				driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
				
			}			
			
			
		}
		
		public void getTitleshow()
		{
			
			
			System.out.println(driver.getTitle());
		}


}
