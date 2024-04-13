package naveen;

import org.testng.annotations.Test;

import allpages.Cssselectorsprac;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class CssselectorspracTest extends Cssselectorsprac {

	Cssselectorsprac cs;

	@Test(priority = 0)
	public void fTest() {

		cs = PageFactory.initElements(driver, Cssselectorsprac.class);
		cs.getuser();
		cs.getuser1();
		cs.getuser2();

	}

	@Test(priority = 1)
	public void f2Test() {

		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://practicetestautomation.com/practice-test-login/");

	}

	@Test(priority = 2)
	public void f3Test() {

		String title = driver.getTitle();
		System.out.println(title);

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
