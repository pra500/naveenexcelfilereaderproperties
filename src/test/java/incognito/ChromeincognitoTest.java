package incognito;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class ChromeincognitoTest {
	
	//need to chk for firefox/edge browser also, for sure it will be same as we did for chrome 

	WebDriver driver;

	@Test
	public void giTest() {

		System.out.println(driver.getTitle());
	}

	@BeforeClass
	public void beforeClass() {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("incognito");
		driver = new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get("https://naveenautomationlabs.com/opencart/");
		
		driver.get("https://www.softwaretestinghelp.com/page-object-model-in-selenium-without-page-factory/");

	}

	@AfterClass
	public void afterClass() {

		driver.close();
	}

}
