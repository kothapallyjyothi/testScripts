package testscripts;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login 
{
	WebDriver cd;
	@Test
	public void testLogin() throws Exception
	{
		//launch the browser
		cd.get("https://demo.cyclos.org/ui/home");
		cd.findElement(By.xpath("//a[@id='login-link']/div")).click();
		Thread.sleep(3000);
		cd.findElement(By.xpath(" //input[@type='text']")).clear();
		cd.findElement(By.xpath("//input[@type='text']")).sendKeys("");
		//assign the uname as string using the locator

		String uname=cd.findElement(By.xpath("//a[@id='login-link']/div")).getAttribute("Value");
		//password
		cd.findElement(By.xpath("//input[@type='password']")).clear();
		cd.findElement(By.xpath("//input[@type='password']")).sendKeys("1352");
		//assign the passwd as string using the locator
		String passwd =cd.findElement(By.xpath("//input[@type='password']")).getAttribute("Value");
		cd.findElement(By.xpath("//button[contains(.,'Submit')]")).click();
		Thread.sleep(3000);	
		//blank user and blank passwd
		if(uname.equals("") && passwd.equals(""))
		{
			assertEquals(cd.findElement(By.cssSelector(".principal .invalid-feedback")).getText(),"This field is required");
			assertEquals(cd.findElement(By.cssSelector(".d-block .invalid-feedback")).getText(),"This field is required");
		}
		//blank username &valid/invalid passwd
		else if(uname.equals("") && !(passwd.equals("")))
		{
			assertEquals(cd.findElement(By.cssSelector(".principal .invalid-feedback")).getText(),"This field is required");
		}
		//blank passwd and valid/invalid username 
		else if(!(uname.equals(""))&& passwd.equals("") )
		{
			assertEquals(cd.findElement(By.cssSelector(".d-block .invalid-feedback")).getText(),"This field is required");
		}
		//both are invalid username and  password
		else if(isElemPresent(cd,By.cssSelector("#logout-trigger .ci")))
		{
			Thread.sleep(3000);
			cd.findElement(By.cssSelector("#logout-trigger .ci")).click();
		}
		else 
		{
			assertEquals(cd.findElement(By.cssSelector(".notification-message")).getText(),"The given name / password are incorrect. Please, try again.");
			cd.findElement(By.xpath("//span[contains(.,'×')]")).click();		
		}
	}
	public boolean isElemPresent(WebDriver driver,By locator)
	{	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		try
		{
			driver.findElement(locator);
			return true;
		}
		catch(Exception e)
		{
		return false;

		}	
}
	
	@BeforeMethod
	public void load()
	{
		cd= new ChromeDriver();
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		cd.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));
		cd.manage().deleteAllCookies();
	}
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		cd.quit();
		Thread.sleep(1000);
	}


}
