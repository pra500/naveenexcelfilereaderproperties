package frameworkConstructorprac1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserstacka {
	
	WebDriver driver;
	Properties prop;
	
	public Browserstacka(WebDriver driver, Properties prop) throws IOException
	{
		this.driver=driver;
		this.prop=prop;
		
		
		String filepath="C:\\Users\\Admin\\eclipse-workspace\\twopagesautomation\\src\\test\\resources\\config\\config.properties";
		FileInputStream fip=new FileInputStream(filepath);
		prop=new Properties();
		prop.load(fip);
		
	    
		String url=prop.getProperty("url");	
			
		  
		    driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(url);			
			
		
		
	}
	
	
	
   private By heading1 = By.xpath("//h3[@id='toc0']");
   
   
   public void get()
   {
	
	   System.out.println(driver.findElement(heading1).isDisplayed());
	   
   }
	
	 

}
