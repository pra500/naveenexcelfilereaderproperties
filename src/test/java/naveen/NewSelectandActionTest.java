package naveen;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class NewSelectandActionTest {
	
	WebDriver driver;
	
	
  @Test
  public void gTest() {
	  
		/*
		 * WebElement wb=driver.findElement(By.id("demo_basic")); Select sel=new
		 * Select(wb); sel.selectByVisibleText("Two");
		 */
	  
	  
	  
	  
	  WebElement wb1=driver.findElement(By.xpath("//a[text()='View Documentation']"));
	  Actions act=new Actions(driver);
	  act.contextClick(wb1).perform();
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://formstone.it/components/dropdown/demo/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
