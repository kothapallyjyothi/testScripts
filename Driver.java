package testscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Driver {
	
	public WebDriver cd;
	public String url="https://demo.cyclos.org/ui/home";
	@BeforeMethod
	@Parameters("broswer")

	public void driverSetup(String browser)
	{
		
		 if(browser.equals("GC"))
		{
			cd=new ChromeDriver();
		}
		else if(browser.equals("Edge"))
		{
			cd=new EdgeDriver();
		}
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		cd.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));
		cd.manage().deleteAllCookies();
	}

	@AfterMethod
	public void tearDown()
	{
		// Close the browser
		cd.quit();
	}
}
