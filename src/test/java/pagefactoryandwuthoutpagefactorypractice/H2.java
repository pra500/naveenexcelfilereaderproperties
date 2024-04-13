package pagefactoryandwuthoutpagefactorypractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class H2 {

	WebDriver driver;
	
	public H2(WebDriver driver) {
		
		this.driver = driver;
	
	}

	private By username = By.id("username");
	private By password = By.id("password");
	private By submitbtn = By.xpath("//button[text()='Submit']");

	public void get() {
		driver.findElement(username).sendKeys("student");

	}

	public void get1() {
		driver.findElement(password).sendKeys("Password123");

	}

	public void get2() {
		driver.findElement(submitbtn).click();

	}

}
