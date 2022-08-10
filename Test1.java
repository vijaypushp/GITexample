package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test1 {
	public static void main (String[] args) {
		
	System.setProperty("webdriver.edge.driver","C:\\Users\\vijay\\Downloads\\edgedriver_win64\\msedgedriver.exe");	
		
	WebDriver driver=new EdgeDriver();
	
	driver.get("https://www.google.com");
		
	driver.quit();	
		
	}

}
