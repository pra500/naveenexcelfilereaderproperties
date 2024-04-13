package naveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class H1 {

	static WebDriver driver;

	@FindBy(id = "username")
	@CacheLookup
	private WebElement username;

	@FindBy(id = "password")
	@CacheLookup
	private WebElement password;

	@FindBy(xpath = "//button[text()='Submit']")
	@CacheLookup
	private WebElement submitbtn;

	public void getusernameTest() {

		username.sendKeys("student");
	}

	public void getpwdTest() {

		password.sendKeys("Password123");

	}

	public void getsubmitbuttonTest() {
		submitbtn.click();

	}

}
