package testscripts;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class AjaxDemo {
	
	
	WebDriver d;
	
	@Test
	public void ajaxTest() throws Exception
	{
		//to load the web page
		d.get("https://retail.onlinesbi.sbi/retail/login.htm");
		//to get the title using assert equals
		Thread.sleep(3000);
//		String title=d.getTitle();
//		System.out.println(title);
		assertEquals(d.getTitle(), "State Bank of India - Personal Banking");
//		String str=d.getCurrentUrl();
//		System.out.println(str);
		//assertEquals(d.getCurrentUrl(),"https://demo.cyclos.org/ui/");
		
		d.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		Thread.sleep(3000);
//		assertFalse(d.findElement(By.partialLinkText("Forgot Username / Login Password")));
		
		
	}
	
	@BeforeMethod
	public void setup()
	{
		//launch the browser
		d= new ChromeDriver();

		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
	}
	
	@AfterMethod
	public void close()
	{
		
		//to close the browser
		d.quit();
		
		
	}
	

}
