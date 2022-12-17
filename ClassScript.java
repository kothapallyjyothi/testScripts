package testscripts;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ClassScript {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//launch the browser
//		WebDriver d = new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\webdrivers\\chromedrivers.exe");
		WebDriver d = new EdgeDriver();
		
	System.setProperty("webdriver.chrome.driver","D:\\Drivers\\webdrivers\\msedgedriver.exe");

		

		//load the browser
		d.get("https://retail.onlinesbi.sbi/retail/login.htm");
		
		//pause 3sec
		Thread.sleep(5000);
		
		//close 
		d.quit();
		
	}

}
