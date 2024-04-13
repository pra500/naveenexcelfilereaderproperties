package howtousebaseclassintestclass1;

import org.testng.annotations.Test;

import howtousebaseclassintestclass.ExcelLib;

public class ExcelLibTest{
	
	// here rows started by 1, column by 0
	
	String path1="C:\\Users\\Admin\\eclipse-workspace\\filereaderproperties\\src\\main\\java\\twofebtestdata\\practicetestdata1.xlsx";
	ExcelLib ex=new ExcelLib(path1);	
  

  @Test
  public void fTest() {
	
	String s=ex.getCellData("contacts", "username", 2);
	System.out.println(s);  //test1
	
	
	String s1=ex.getCellData("contacts", 1, 3);   
	System.out.println(s1);   //test234
	
	
	int count=ex.getRowCount("contacts");
	System.out.println(count);	
	
	
	
  }


}
