package naveen;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class JavascriptpracticeTest {
	
	WebDriver driver;
	
	
	
  @Test
  public void fTest() {
	  
	  	
	 
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(123, 145)");
	  
  }
  
  
  @Test
  public void f12Test() {
	  
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("document.getElementById('password').value='pttttii'");
	  
	  

  }
  
  
  
  @Test
  public void f13Test() {
	  
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  //js.executeScript("document.getElementsByName('password').clear();");
	 //js.executeScript("document.getElementsByName('password').value='abh@1222'");
	  
	  WebElement e=driver.findElement(By.id("submit"));	  
	  js.executeScript("arguments[0].click();",e);
	  
	  
	  
	  
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
