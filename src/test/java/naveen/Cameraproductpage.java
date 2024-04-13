package naveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Cameraproductpage {
	
	
    static WebDriver driver;
     
	@FindBy(partialLinkText = "Cam")
	@CacheLookup
	private WebElement Cameralink;

	@FindBy(linkText = "Canon EOS 5D")
	@CacheLookup
	private WebElement CanonEOSlink;

	@FindBy(xpath = "//h1[text()='Canon EOS 5D']")
	@CacheLookup
	private WebElement mainheading;

	@FindBy(xpath = "//h2[text()='$98.00']")
	@CacheLookup
	private WebElement price98;

	@FindBy(xpath = "//button[text()='Add to Cart']")
	@CacheLookup
	private WebElement addtocartbtn;

	public void getcameralink() {
		Cameralink.click();

	}

	public void getCanonEOSlink() {
		CanonEOSlink.click();

	}

	public boolean getmainheading() {
		boolean b = mainheading.isDisplayed();
		return b;
	}

	public boolean getprice98() {
		boolean b = price98.isDisplayed();
		return b;

	}

	public void getaddtocartbtn() {
		addtocartbtn.click();				
		

	}

}
