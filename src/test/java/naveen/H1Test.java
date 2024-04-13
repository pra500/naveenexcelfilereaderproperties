package naveen;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

public class H1Test extends H1 {

	@Test(priority = 0)
	public void getsubmittedTest() {

		H1 h1 = PageFactory.initElements(driver, H1.class);
		h1.getusernameTest();

	}

	@Test(priority = 1)
	public void getsubmitted1Test() {

		H1 h1 = PageFactory.initElements(driver, H1.class);
		h1.getpwdTest();

	}

	@Test(priority = 2)
	public void getsubmitted2Test() {

		H1 h1 = PageFactory.initElements(driver, H1.class);
		h1.getsubmitbuttonTest();

	}

	@BeforeClass
	public void beforeClass() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://practicetestautomation.com/practice-test-login/");

	}

	@AfterClass
	public void afterClass() {

		driver.close();
	}

}
