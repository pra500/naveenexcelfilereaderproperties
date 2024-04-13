package howtousebaseclassintestclass1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import howtousebaseclassintestclass.WebDriverCommonLib;

public class WebDriverCommonLibTest extends WebDriverCommonLib {

	WebDriverCommonLib wb1;

	@Test
	public void fTest() {

		wb1 = new WebDriverCommonLib();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://formstone.it/components/dropdown/demo/");

		WebElement wb = driver.findElement(By.id("demo_basic"));
		WebElement wb2 = driver.findElement(By.xpath("//a[text()='View Documentation']"));

		wb1.getselectbyvisibleText(wb, "Two");
		wb1.getactioncontextClick(wb2, driver);
		

	}

}
