package naveen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Accountspage {

	@FindBy(xpath = "//h1[text()='Register Account']")
	@CacheLookup
	private WebElement mainheading;

	@FindBy(name = "firstname")
	@CacheLookup
	private WebElement fn;

	@FindBy(id = "input-lastname")
	@CacheLookup
	private WebElement ln;

	@FindBy(id = "input-email")
	@CacheLookup
	private WebElement email;

	@FindBy(id = "input-password")
	@CacheLookup
	private WebElement pwd;
		

	@FindBy(id = "input-newsletter-no")
	@CacheLookup
	private WebElement subscribeno;
	
	
    /*
	@FindBy(id = "input-newsletter-yes")
	@CacheLookup
	private WebElement subscribeyes;
	*/
	
	@FindBy(xpath = "//input[@name='agree']")
	@CacheLookup
	private WebElement privacy;

	@FindBy(xpath = "//button[text()='Continue']")
	@CacheLookup
	private WebElement Continue;

	public String getheading() {
		String head = mainheading.getText();
		return head;
	}

	public void getfirst() {
		fn.sendKeys("Elton");

	}

	public void getlast() {
		ln.sendKeys("Barry");
	}

	public void getemail() {
		email.sendKeys("justo@yahoo.com");

	}

	public void getpwd() {
		pwd.sendKeys("elton@123");
	}

	public void getsubscribeno() {
		subscribeno.click();
	}
	
    /*
	public void getsubscribeyes() {
		subscribeyes.click();
	}
    */
	
	public void getprivacy() {
		privacy.click();
	}

	public void getcontinue() {
		Continue.click();
	}

}
