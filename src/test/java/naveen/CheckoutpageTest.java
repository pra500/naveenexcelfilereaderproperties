package naveen;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

public class CheckoutpageTest extends Checkoutpage {

	@Test
	public void validate1Test() {

		Checkoutpage co = PageFactory.initElements(driver, Checkoutpage.class);
		co.checkoutlinkclick();

	}

	@Test
	public void validate2Test() {

		Checkoutpage co = PageFactory.initElements(driver, Checkoutpage.class);
		co.mainheadingpresent();

	}

	@Test
	public void validate3Test() {
		Checkoutpage co = PageFactory.initElements(driver, Checkoutpage.class);
		co.continuebtnclick();

	}

	@BeforeClass
	public void beforeClass() {
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
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
