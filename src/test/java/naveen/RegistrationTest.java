package naveen;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class RegistrationTest {

	WebDriver driver;

	@Test
	public void getregisteredTest() {

		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();

		// title
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Register Account");

		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("HopBrown");

		driver.findElement(By.id("input-lastname")).clear();
		driver.findElement(By.id("input-lastname")).sendKeys("BrownBrown");

		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys("luctus.vulputate@outlook.ca");

		driver.findElement(By.id("input-telephone")).clear();
		driver.findElement(By.id("input-telephone")).sendKeys("9098789900");

		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys("luc@123");

		driver.findElement(By.id("input-confirm")).clear();
		driver.findElement(By.id("input-confirm")).sendKeys("luc@123");

		driver.findElement(By.xpath("//input[@name='agree']")).click();

		driver.findElement(By.xpath("//input[@value='Continue']")).click();

		boolean present = driver.findElement(By.xpath("//h1[contains(text(), 'Your Account Has Been Created!')]"))
				.isDisplayed();
		Assert.assertTrue(present);

	}

	@BeforeClass
	public void beforeClass() {

		WebDriverManager.chromedriver().setup();
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
