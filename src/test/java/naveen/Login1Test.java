package naveen;

import org.testng.annotations.Test;

import allpages.Loptop;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Login1Test {

	static WebDriver driver;

	@BeforeClass
	public void beforeClass() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://naveenautomationlabs.com/opencart/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='MacBook']")).click();
	}

	@Test(priority = 0)
	public void firstTest() {

		Loptop l = PageFactory.initElements(driver, Loptop.class);
		boolean val = l.getheading();
		Assert.assertTrue(val);

	}

	@Test(priority = 1)
	public void secTest() {

		Loptop l = PageFactory.initElements(driver, Loptop.class);
		boolean val = l.addtocartbtn();
		Assert.assertTrue(val);

	}

	@Test(priority = 2)
	public void thirdTest() {

		Loptop l = PageFactory.initElements(driver, Loptop.class);
		boolean val = l.descriptionlink();
		Assert.assertTrue(val);

	}

	@Test(priority = 3)
	public void fourthTest() {

		Loptop l = PageFactory.initElements(driver, Loptop.class);
		boolean val = l.specificationlink();
		Assert.assertTrue(val);

	}

	@Test(priority = 4)
	public void fifthTest() {

		Loptop l = PageFactory.initElements(driver, Loptop.class);
		boolean val = l.reviewslink();
		Assert.assertTrue(val);

	}

	@Test(priority = 5)
	public void  sixTest() {

		Loptop l = PageFactory.initElements(driver, Loptop.class);
		boolean val = l.reviewslink();
		Assert.assertTrue(val);

	}
	
	@Test(priority = 6)
	public void sevenTest() {

		Loptop l = PageFactory.initElements(driver, Loptop.class);
		boolean val = l.reviewslink();
		Assert.assertTrue(val);

	}
	
	@Test(priority = 7)
	public void eightTest() {

		Loptop l = PageFactory.initElements(driver, Loptop.class);
		boolean val = l.reviewslink();
		Assert.assertTrue(val);

	}
	
	@Test(priority = 8)
	public void nineTest() {

		Loptop l = PageFactory.initElements(driver, Loptop.class);
		boolean val = l.reviewslink();
		Assert.assertTrue(val);

	}
	
	@Test(priority = 9)
	public void tenTest() {

		Loptop l = PageFactory.initElements(driver, Loptop.class);
		boolean val = l.reviewslink();
		Assert.assertTrue(val);

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
	
	
}
