package howtousebaseclassintestclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class OptionsManager {
	
	public static WebDriver driver;
	
	
    ChromeOptions co;
    FirefoxOptions fi;
    EdgeOptions ed;    
	Properties prop;
	FileInputStream fip;
	
 public void getbrowserincognito() throws IOException
 {
	 
	 String filepath ="C:\\Users\\Admin\\eclipse-workspace\\filereaderproperties\\src\\test\\resources\\howtousebaseclassintestclass.properties";
	fip=new FileInputStream(filepath);
	prop= new Properties();
	prop.load(fip);
	String browser= prop.getProperty("browser");
	
	
	
	if(browser.equalsIgnoreCase("chrome"))
	{
		co=new ChromeOptions();
		co.addArguments("--incognito");
		driver=new ChromeDriver(co);
	}
	else if(browser.equalsIgnoreCase("firefox"))
	{
		fi=new FirefoxOptions();
		//fi.addArguments("--incognito");
		fi.addArguments("-private");
		driver=new FirefoxDriver(fi);
	}
	
	else if(browser.equalsIgnoreCase("edge"))
	{
		ed=new EdgeOptions();
		//need to chk
		//ed.addArguments("--incognito");
		ed.addArguments("--InPrivate");  //working fine
		driver=new EdgeDriver(ed);
	}
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	String url=prop.getProperty("url");	
	driver.get(url);
	
		 
 }
 
 
	}
