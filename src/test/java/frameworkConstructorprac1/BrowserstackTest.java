package frameworkConstructorprac1;

import org.testng.annotations.Test;

import naveen.H;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BrowserstackTest {

	WebDriver driver;
	Browserstack bs = new Browserstack(driver);

	@Test(priority = 0)
	public void fTest() {

		bs = new Browserstack(driver);
		bs.getproduct();
	}

	@Test(priority = 1)
	public void f1Test() {

		bs = new Browserstack(driver);
		bs.getproduct1();
	}

	@Test(priority = 2)
	public void f2Test() {

		bs = new Browserstack(driver);
		bs.getproduct2();
	}

	@BeforeTest
	public void beforeTest() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.browserstack.com/guide/page-object-model-in-selenium");

	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
