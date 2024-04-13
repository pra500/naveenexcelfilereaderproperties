package naveenexcel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.navlabs.excel.reade.NALExcelXLSReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Takedata1 {
	public static void main(String[] args) {

		WebDriver driver;

		/*
		 * 
		 * NALExcelXLSReader n=new
		 * NALExcelXLSReader("C:\\Users\\Admin\\Desktop\\Book1.xlsx");
		 * 
		 * int a=n.getRowCount("Sheet1"); System.out.println(a);
		 * 
		 * 
		 * String ftname=n.getCellData("Sheet1", "ftname", 2);
		 * System.out.println(ftname);
		 * 
		 * 
		 * String date=n.getCellData("Sheet1", "date", 2); System.out.println(date);
		 * //12/11/22
		 */

		NALExcelXLSReader n = new NALExcelXLSReader("C:\\Users\\Admin\\Desktop\\Book1.xlsx");
		String firstname = n.getCellData("Sheet1", "ftname", 2);
		String lastname = n.getCellData("Sheet1", "ltname", 2);
		String emailid = n.getCellData("Sheet1", "id", 2);

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		System.out.println(driver.getTitle());

		
		
		driver.findElement(By.name("firstname")).sendKeys(firstname);
		driver.findElement(By.id("input-lastname")).sendKeys(lastname);
		driver.findElement(By.id("input-email")).sendKeys(emailid);

		// driver.close();

	}

}
