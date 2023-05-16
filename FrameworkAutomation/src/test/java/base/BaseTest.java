package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	FileInputStream fis1;
	Properties configProp;
	@BeforeTest
	public void fileSetUp() throws IOException, InterruptedException
	{
		fis1= new FileInputStream("Properties\\config.properties");
		
		configProp=new Properties();
		
		configProp.load(fis1);
		
				
	}
	

}
