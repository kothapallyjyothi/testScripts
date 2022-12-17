package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNgFBLogin 
{
	
	WebDriver d;
	@BeforeMethod
	
	public void 	setup ()
	{
		//launch the browser
		 d = new ChromeDriver();
		
	}
	
	@Test
	public void testingPart()
	{
		//to load the web page
		d.get("https://www.facebook.com");
		
		//enter the name in email field 
		d.findElement(By.id("email")).sendKeys("Testng@gmail.com");
		
		//enter the password in password field
		d.findElement(By.id("pass")).sendKeys(" annotation");
		
		//click on the login
		d.findElement(By.name("login")).click();
	}
	
	@AfterMethod
	public void  closePart() throws Exception
	{
		
		Thread.sleep(5000);

		//close the browser
		d.quit();
	}
	
	

}
