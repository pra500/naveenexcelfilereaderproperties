package howtousebaseclassintestclass1;

import org.testng.annotations.Test;

import howtousebaseclassintestclass.JavaScriptUtil;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class JavaScriptUtilTest extends JavaScriptUtil {

	JavaScriptUtil ja;

	@Test
	public void fTest() throws InterruptedException {

		ja = new JavaScriptUtil();

		WebElement wb = driver.findElement(By.xpath("//div[@id='cart']"));

		ja.scrollhorizonandverti();

		ja.clickelement(wb);
		ja.refreshbrowser();

		ja.enterelementbyname();

		ja.enterelementbyid();

	}

	@BeforeClass
	public void beforeClass() {

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
