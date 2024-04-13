package naveenexcel;

import org.testng.annotations.Test;

import com.navlabs.excel.reade.NALExcelXLSReader;

//import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Take1Test {
	WebDriver driver;
	NALExcelXLSReader n = new NALExcelXLSReader("C:\\Users\\Admin\\Desktop\\Book1.xlsx");


	
	
	
	
  @Test
  public void fTest() {
	  
	  ge();  
	  
  }
  
  public void ge()
  {
	  n.setCellData("Sheet1", "ftname", 9, "pragti");
	  n.setCellData("Sheet1", "ltname", 9, "gupta");
	  n.setCellData("Sheet1", "id", 9, "velit.eget@aol.ca");
	  n.setCellData("Sheet1", "pwd", 9, "pra78@12900");
	  n.setCellData("Sheet1", "date", 9, "02/02/2007");
	  
	  n.setCellData("Sheet1", "ftname", 10, "parul");
	  n.setCellData("Sheet1", "ltname", 10, "gupta");
	  n.setCellData("Sheet1", "id", 10, "velit1.eget@aol.ca");
	  n.setCellData("Sheet1", "pwd", 10, "pra78@129000");
	  n.setCellData("Sheet1", "date", 10, "02/02/2008");
	  
	  n.setCellData("Sheet1", "ftname", 11, "pra");
	  n.setCellData("Sheet1", "ltname", 11, "gup");
	  n.setCellData("Sheet1", "id", 11, "velit2.eget@aol.ca");
	  n.setCellData("Sheet1", "pwd", 11, "pra789@129000");
	  n.setCellData("Sheet1", "date", 11, "02/02/2007");
	  
	  
	  
	  n.setCellData("Sheet1", "ftname", 12, "pra1");
	  n.setCellData("Sheet1", "ltname", 12, "gup11");
	  n.setCellData("Sheet1", "id", 12, "velit2.eget@aol.ca");
	  n.setCellData("Sheet1", "pwd", 12, "pra789@129000");
	  n.setCellData("Sheet1", "date", 12, "02/02/2007");
	  
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  //WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		// System.out.println(driver.getTitle());
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
