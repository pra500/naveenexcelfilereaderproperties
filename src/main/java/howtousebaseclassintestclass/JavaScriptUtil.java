package howtousebaseclassintestclass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class JavaScriptUtil {
	
	//always use " in the last, '' use inside

	public static WebDriver driver;
	

	//public void scrollhorizonandverti(int a, int b) {
		public void scrollhorizonandverti() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(120, 170)", "");

	}
     
	
	public void clickelement(WebElement wb)
	{
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", wb);
		
		
	}
	
	
	public void refreshbrowser()
	{
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("history.go(0)");	
		
		
	}
	

	//public void enterelementbyname(String s) {
		public void enterelementbyname() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByName('search').value='laptop';");
		//js.executeScript("document.getElementsByName('search').value=s;");

	}
	
	
	
	
	
	   //public void enterelementbyid(String s){
		public void enterelementbyid() {
			
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('cart').click();");
		
	
		
	}
		
		
		
	/*
  public void enterelementbyxpath(String s){
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("document.getElementByXpath('(//span[@class='hidden-xs hidden-sm hidden-md'])[1]').isDisplayed();");
	
	}
	

  
  public void enterelementbyclassname(String s){
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementByClassName('form-control input-lg').value='phones';");
		
		}
		

public void generatAlert(String message)
{
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("alert(  ' "+ message +" ')");
	
}
*/





}
