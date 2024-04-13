package pac2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Base {

	
	Base() throws IOException
	{
		String path="C:\\Users\\Admin\\eclipse-workspace\\filereaderproperties\\src\\test\\resources\\ config1.properties";
		try {
			FileInputStream fip=new FileInputStream(path);
			Properties prop=new Properties();
			prop.load(fip);
			
			
			
		} catch (FileNotFoundException e) {
     			 e.printStackTrace();
		}
		
	}
}

