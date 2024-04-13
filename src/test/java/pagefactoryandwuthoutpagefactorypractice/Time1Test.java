package pagefactoryandwuthoutpagefactorypractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class Time1Test {
	
	

	WebDriver driver;
	Time1 tm;

	@Test
	public void fTest() {

		tm = new Time1(driver);
		tm.gethome();

	}

	@BeforeTest
	public void setup() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://practicetestautomation.com/practice-test-login/");

	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
