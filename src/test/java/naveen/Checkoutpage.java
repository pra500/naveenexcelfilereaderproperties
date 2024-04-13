package naveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Checkoutpage {

    static WebDriver driver;
    
    //webelements
	@FindBy(linkText = "Checkout")
	@CacheLookup
	private WebElement checkoutlink;

	@FindBy(xpath = "//h1[text()='Shopping Cart']")
	@CacheLookup
	private WebElement mainheading;

	@FindBy(linkText = "Continue")
	@CacheLookup
	private WebElement continuebtn;
	
	
    //methods
	public void checkoutlinkclick() {
		checkoutlink.click();
	}

	public boolean mainheadingpresent() {
		boolean b = mainheading.isDisplayed();
		return b;

	}

	public void continuebtnclick() {

		continuebtn.click();
	}

}
