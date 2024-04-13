package extrasites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Homepage {
	/**
	 * 
	 * 
	 * https://www.globalsqa.com/demo-site/select-dropdown-menu/
	 */
	
	static WebDriver driver;
	
	
	@FindBy(linkText = "GlobalSQA")
	@CacheLookup
	private WebElement heading;

	@FindBy(linkText = "Home")
	@CacheLookup
	private WebElement Home;
	

	@FindBy(xpath = "//option[text()='Albania']")
	@CacheLookup
	private WebElement Albania;
	
	
	public boolean geth()
	{
		boolean value=heading.isDisplayed();
		return value;
		
	}
	

	public boolean geth1()
	{
		boolean value=Home.isDisplayed();
		return value;
		
	}
	
	


	
	
	
	
	
	
}
