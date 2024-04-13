package frameworkConstructorprac1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Courses {
	
	
	WebDriver driver;
	
	Properties prop;
	
	public Courses(WebDriver driver)
	{
		this.driver=driver;
	}
		
	
	public Courses(WebDriver driver, Properties prop) throws IOException
	{
		this.driver=driver;
		this.prop=prop;
		
		String filepath="C:\\Users\\Admin\\eclipse-workspace\\filereaderproperties\\src\\test\\resources\\ config1.properties";
		
		try {
			FileInputStream fip=new FileInputStream(filepath);
			prop=new Properties();
			prop.load(fip);
			String f=prop.getProperty("firstname");
			System.out.println(f);	
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				
		
		
		
	}
	
	private By cour=By.xpath("//a[text()='Courses']");
	private By blog=By.xpath("//a[text()='Blog']");
	
	
	public void get() {
		System.out.println(driver.findElement(cour).isDisplayed());
	}
	
	public void geti() {
		System.out.println(driver.findElement(blog).isDisplayed());
	}

}
