package naveen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import allpages.Loptop;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends Loptop {

	static WebDriver driver;

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://naveenautomationlabs.com/opencart/");
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//a[text()='MacBook']")).click();

		Loptop l = PageFactory.initElements(driver, Loptop.class);
		boolean val = l.getheading();
		Assert.assertTrue(val);
		
	
		
		Loptop l1=PageFactory.initElements(driver, Loptop.class);
		boolean val1 =l1.descriptionlink();
		Assert.assertTrue(val1);	
		
		
		
		
		
		

		driver.close();

	}

}
