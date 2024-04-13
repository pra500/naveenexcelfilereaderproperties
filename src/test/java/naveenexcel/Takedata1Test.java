package naveenexcel;

import org.testng.annotations.Test;

import com.navlabs.excel.reade.NALExcelXLSReader;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Takedata1Test {

	WebDriver driver;

	@Test
	public void getthedataTest() throws InterruptedException {
		// here rows started by 1, column by 0

		NALExcelXLSReader n = new NALExcelXLSReader("C:\\Users\\Admin\\Desktop\\Book1.xlsx");
		/*
		 * //entering the data; sheetname, cellname, row no String firstname =
		 * String firstname =n.getCellData("Sheet1", "ftname", 2); String lastname =
		 * String lastname =n.getCellData("Sheet1", "ltname", 2); String emailid =
		 * String emailid =n.getCellData("Sheet1", "id", 2); 
		 * String password = n.getCellData("Sheet1","pwd", 2); 
		 * String date = n.getCellData("Sheet1", "date", 2);
		 * 
		 * driver.findElement(By.name("firstname")).sendKeys(firstname);
		 * driver.findElement(By.id("input-lastname")).sendKeys(lastname);
		 * driver.findElement(By.id("input-email")).sendKeys(emailid);
		 * driver.findElement(By.id("input-password")).sendKeys(password);
		 * 
		 * Thread.sleep(6000);
		 * driver.findElement(By.id("input-newsletter-yes")).click();
		 * driver.findElement(By.xpath("//input[@name='agree']")).click();
		 * driver.findElement(By.xpath("//button[text()='Continue']")).click();
		 * 
		 * //gv row count int count=n.getRowCount("Sheet1"); System.out.println(count);
		 */

		// sheetname, cell no, row no
		String s = n.getCellData("Sheet1", 2, 2); // mauris11
		String s1 = n.getCellData("Sheet1", 1, 3); // Beasley1
		System.out.println(s);
		System.out.println(s1);

		/*
		 * boolean b = n.setCellData("Sheet1", "ftname", 7, "Tom");
		 * System.out.println(b);
		 * 
		 * boolean b1 = n.setCellData("Sheet1", "ltname", 7, "Cruse");
		 * System.out.println(b1);
		 * 
		 * boolean b2 = n.setCellData("Sheet1", "id", 7, "Cruse123@yahoo.com");
		 * System.out.println(b2);
		 * 
		 * boolean b3 = n.setCellData("Sheet1", "pwd", 7, "tom@123");
		 * System.out.println(b3);
		 * 
		 * boolean b4 = n.setCellData("Sheet1", "date", 7, "12/12/2006");
		 * System.out.println(b4);
		 */

		/*
		 * boolean b = n.setCellData("Sheet1", "ftname", 8, "shel");
		 * System.out.println(b);
		 * 
		 * boolean b1 = n.setCellData("Sheet1", "ltname", 8, "Chari");
		 * System.out.println(b1);
		 * 
		 * boolean b2 = n.setCellData("Sheet1", "id", 8, "chari123@yahoo.com");
		 * System.out.println(b2);
		 * 
		 * boolean b3 = n.setCellData("Sheet1", "pwd", 8, "shel@123");
		 * System.out.println(b3);
		 * 
		 * boolean b4 = n.setCellData("Sheet1", "date", 8, "09/07/2000");
		 * System.out.println(b4);
		 */

		/*
		 * boolean b = n.setCellData("Sheet1", "ftname", 9, "shel");
		 * System.out.println(b);
		 * 
		 * boolean b1 = n.setCellData("Sheet1", "ltname", 9, "Chari");
		 * System.out.println(b1);
		 * 
		 * boolean b2 = n.setCellData("Sheet1", "id", 9, "chari123@yahoo.com");
		 * System.out.println(b2);
		 * 
		 * boolean b3 = n.setCellData("Sheet1", "pwd", 9, "shel@123");
		 * System.out.println(b3);
		 * 
		 * boolean b4 = n.setCellData("Sheet1", "date", 9, "09/07/2000");
		 * System.out.println(b4);
		 * 
		 * boolean b = n.setCellData("Sheet1", "ftname", 8, "shel");
		 * System.out.println(b);
		 * 
		 * boolean b1 = n.setCellData("Sheet1", "ltname", 8, "Chari");
		 * System.out.println(b1);
		 * 
		 * boolean b2 = n.setCellData("Sheet1", "id", 8, "chari123@yahoo.com");
		 * System.out.println(b2);
		 * 
		 * boolean b3 = n.setCellData("Sheet1", "pwd", 8, "shel@123");
		 * System.out.println(b3);
		 * 
		 * boolean b4 = n.setCellData("Sheet1", "date", 8, "09/07/2000");
		 * System.out.println(b4);
		 */
	}

	@BeforeClass
	public void beforeClass() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		// System.out.println(driver.getTitle());

	}

	@AfterClass
	public void afterClass() {

		driver.close();
	}

}
