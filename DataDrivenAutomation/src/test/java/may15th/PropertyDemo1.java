package may15th;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyDemo1 {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis= new FileInputStream("Properties\\config.properties");
		
		Properties pr=new Properties();
		
		pr.load(fis);
		
		System.out.println(pr.getProperty("100"));
		System.out.println(pr.getProperty("101"));
		System.out.println(pr.getProperty("102"));
		System.out.println(pr.getProperty("browser"));
		System.out.println(pr.getProperty("url"));

	}

}
