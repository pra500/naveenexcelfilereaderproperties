package naveen;

import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class AccountsTest extends Accountspage {

	static WebDriver driver;

	@Test(priority = 0)
	public void first() {

		Accountspage a = PageFactory.initElements(driver, Accountspage.class);
		String heading = a.getheading();
		Assert.assertEquals(heading, "Register Account");

	}

	@Test(priority = 1)
	public void sec() {
		Accountspage a = PageFactory.initElements(driver, Accountspage.class);
		a.getfirst();

	}

	@Test(priority = 2)
	public void third() {
		Accountspage a = PageFactory.initElements(driver, Accountspage.class);
		a.getlast();
	}

	@Test(priority = 3)
	public void fourth() {
		Accountspage a = PageFactory.initElements(driver, Accountspage.class);
		a.getemail();
	}
	
	
	@Test(priority = 4)
	public void fifth() {
		
		
		
		
		
	}
	
	
	@Test(priority = 5)
	public void six() {
		
	}
	
	@Test(priority = 6)
	public void seven() {
		
	}
	
	@Test(priority = 7)
	public void eight() {
		
	}
	

	@BeforeClass
	public void beforeClass() {

		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		System.out.println(driver.getTitle());

	}

	@AfterClass
	public void afterClass() {
		driver.close();

	}

}
