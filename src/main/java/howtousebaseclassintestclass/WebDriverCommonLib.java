package howtousebaseclassintestclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverCommonLib {

	public static WebDriver driver;

	public void getselectbyvisibleText(WebElement wb, String s) {

		Select sel = new Select(wb);
		sel.selectByVisibleText(s);

	}

	public void getactioncontextClick(WebElement wb, WebDriver d) {

		Actions act = new Actions(d);
		act.contextClick(wb).perform();

	}

}
