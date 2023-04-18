package assignments;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeLaunch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		
		new EdgeDriver();

	}

}
