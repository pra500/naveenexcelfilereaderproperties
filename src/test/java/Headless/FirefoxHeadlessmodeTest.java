package Headless;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;

public class FirefoxHeadlessmodeTest {

	WebDriver driver;

	@Test
	public void fTest() {

		System.out.println(driver.getTitle());

	}

	@BeforeClass
	public void beforeClass() {

		FirefoxOptions fir = new FirefoxOptions();
		fir.addArguments("headless");
		driver = new FirefoxDriver(fir);
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
