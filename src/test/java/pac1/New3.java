package pac1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class New3 {
	
	WebDriver driver;	
	
	
	
	public void get() throws IOException
	{	
		
	String path="C:\\Users\\Admin\\eclipse-workspace\\filereaderproperties\\src\\test\\resources\\config.properties";
	FileInputStream fip=new FileInputStream(path);
	Properties prop=new Properties();
	prop.load(fip);
	
	String browser=prop.getProperty("browser");
	
	if(browser.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	else if(browser.equalsIgnoreCase("edge"))		
	{
	   WebDriverManager.edgedriver().setup();
	   driver=new EdgeDriver();	
	
	}
	
	else if(browser.equalsIgnoreCase("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	
	else
	{
		System.out.println("please provide correct browser name");
	}
			
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://naveenautomationlabs.com/opencart/");
	System.out.println(driver.getTitle());
	driver.close();
			
	}
	
		

}
