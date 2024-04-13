package allpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Loptop {

	@FindBy(xpath = "//h1[text()='MacBook']")	
	@CacheLookup
	private WebElement macbookheading;

	@FindBy(id = "button-cart")
	@CacheLookup
	private WebElement addtocart;

	//@FindBy(id = "description-tab")
	@FindBy(xpath = "//a[text()='Description']")
	@CacheLookup
	private WebElement Description;

	//@FindBy(id = "specification-tab")
	@FindBy(xpath = "//a[text()='Specification']")
	@CacheLookup
	private WebElement Specification;

	@FindBy(linkText =  "Reviews (0)")
	@CacheLookup
	private WebElement Reviews;
		

	
	@FindBy(xpath = "//li[contains(text(), 'Brand: ')]")
	@CacheLookup
	private WebElement brand;
	

	@FindBy(xpath=  "//li[text()='Product Code: Product 16']")
	@CacheLookup
	private WebElement product;
	
	

	@FindBy(xpath=  "//li[text()='Reward Points: 600']")
	@CacheLookup
	private WebElement reward;
	
	

	@FindBy(xpath=  "//li[text()='Availability: In Stock']")
	@CacheLookup
	private WebElement availability;	
	
	

	public boolean getheading() {
		boolean b = macbookheading.isDisplayed();
		return b;

	}

	public boolean addtocartbtn() {
		boolean b = addtocart.isDisplayed();
		return b;

	}

	public boolean descriptionlink() {
		boolean b = Description.isDisplayed();
		return b;

	}

	public boolean specificationlink() {
		boolean b = Specification.isDisplayed();
		return b;

	}

	public boolean reviewslink() {
		boolean b = Reviews.isDisplayed();
		return b;
	}
		
	public boolean brandlink() {
			boolean b = brand.isDisplayed();
			return b;

	}
	
	public boolean productlink() {
		boolean b = product.isDisplayed();
		return b;

}

	
	public boolean rewardlink() {
		boolean b = reward.isDisplayed();
		return b;

}

	
	public boolean availabllink() {
		boolean b = availability.isDisplayed();
		return b;

}

	

}
