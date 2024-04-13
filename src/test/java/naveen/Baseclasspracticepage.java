package naveen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Baseclasspracticepage {
	
	
	public static WebDriver driver;
	public Properties prop;
	String env;
	
	
	//where we put our final env
	public String getenv() throws IOException
	{
		
		String filepath = "C:\\Users\\Admin\\eclipse-workspace\\filereaderproperties\\src\\test\\resources\\mycon.properties";
		FileInputStream fip=new FileInputStream(filepath);
		prop = new Properties();
		prop.load(fip);	
		String env=prop.getProperty("env");
		return env;
	}
	
	
	//here we will choose the env
	public void init_env() throws IOException
	{
		
		String env=getenv();
		if(env.equals("qa"))
		{
			//String filepath = "C:\\Users\\Admin\\eclipse-workspace\\filereaderproperties\\src\\test\\resources\\mycon1.qa.properties";
			
			String filepath = "C:\\Users\\Admin\\eclipse-workspace\\filereaderproperties\\src\\test\\resources\\mycon.properties";

			FileInputStream fip=new FileInputStream(filepath);
			prop = new Properties();
			prop.load(fip);			
		
		}
		
		else if(env.equals("stage"))
		{
			String filepath = "C:\\Users\\Admin\\eclipse-workspace\\filereaderproperties\\src\\test\\resources\\mycon1.stage.properties";
			FileInputStream fip=new FileInputStream(filepath);
			prop = new Properties();
			prop.load(fip);			
		
		}
	
		else if(env.equals("dev"))
		{
			String filepath = "C:\\Users\\Admin\\eclipse-workspace\\filereaderproperties\\src\\test\\resources\\mycon1.dev.properties";
			FileInputStream fip=new FileInputStream(filepath);
			prop = new Properties();
			prop.load(fip);			
		
		}
	}
	

	
	public void init_browserlaunch() throws IOException
	{
		
		init_env();
		
		String browser=prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome"))
		{ 
			driver=new ChromeDriver();			
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{ 
			driver=new FirefoxDriver();		
			
		}
		else if(browser.equalsIgnoreCase("safari"))
		{
			driver=new SafariDriver();
		}
		
		else
		{
			System.out.println("please enter correct browser name");
		}		
		
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		
		
	}
}
