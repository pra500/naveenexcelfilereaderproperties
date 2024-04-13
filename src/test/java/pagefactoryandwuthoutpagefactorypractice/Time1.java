package pagefactoryandwuthoutpagefactorypractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Time1 {
	
	
	WebDriver driver;	
	
	public Time1(WebDriver driver)
	{
		this.driver=driver;		
		
	}
	
	private By home=By.xpath("//a[text()='Home']");
	
	public void gethome()
	{
		boolean b =driver.findElement(home).isDisplayed();
		System.out.println(b);		
		
	}


}
