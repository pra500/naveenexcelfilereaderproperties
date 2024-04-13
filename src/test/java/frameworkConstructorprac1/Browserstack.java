package frameworkConstructorprac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Browserstack {

	WebDriver driver;

	public Browserstack(WebDriver driver) {

		this.driver = driver;

	}

	private By prod = By.id("products-dd-toggle");

	private By dev = By.xpath("//button[@id='developers-dd-toggle']");

	private By Live = By.xpath("//span[normalize-space()='Live for Teams']");
	
	

	
	//h3[@id='toc0']
	public void getproduct() {

		boolean b = driver.findElement(prod).isDisplayed();
		System.out.println(b);

	}

	public void getproduct1() {

		boolean b = driver.findElement(dev).isDisplayed();
		System.out.println(b);

	}

	public void getproduct2() {

		boolean b = driver.findElement(Live).isDisplayed();
		System.out.println(b);

	}

}
