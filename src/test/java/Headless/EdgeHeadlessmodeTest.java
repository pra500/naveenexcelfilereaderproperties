package Headless;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EdgeHeadlessmodeTest {
	WebDriver driver;

	@Test
	public void fTest() {

		System.out.println(driver.getTitle());

	}

	@BeforeClass
	public void beforeClass() {

		EdgeOptions edg = new EdgeOptions();
		edg.addArguments("headless");
		driver = new EdgeDriver(edg);
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
