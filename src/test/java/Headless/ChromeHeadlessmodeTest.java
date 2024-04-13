package Headless;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class ChromeHeadlessmodeTest {

	WebDriver driver;

	@Test
	public void fTest() {

		System.out.println(driver.getTitle());

	}

	@BeforeClass
	public void beforeClass() {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("headless");		
		driver = new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://naveenautomationlabs.com/opencart/");

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
