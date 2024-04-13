package allpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Cssselectorsprac {
	
	public static WebDriver driver;

	@FindBy(css = "input[id='username']")
	@CacheLookup
	private WebElement user;

	@FindBy(css = "input[id='password']")
	@CacheLookup
	private WebElement passw;

	@FindBy(css = "button[id='submit']")
	@CacheLookup
	private WebElement submit;
	

	public void getuser() {
		user.sendKeys("admin");
	}

	public void getuser1() {
		passw.sendKeys("admin1");
	}

	public void getuser2() {
		submit.click();
	}

}
