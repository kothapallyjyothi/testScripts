package testscripts;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyTitle {
	
	
	WebDriver cd;
	@BeforeMethod
	public void setup()
	{
		cd= new ChromeDriver();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));	
		
		
	}
	@Test
	public void test() throws Exception 
	{
		//load the page
//		cd.get("https://paytm.com/");
		cd.get("https://paytm.com/");
		String title=cd.getTitle();
		System.out.println(title);
		//using assertequals to compare the actual and expected
//		assertEquals(cd.getTitle(),"Paytm: Secure & Fast UPI Payments, Recharge Mobile & Pay Bills");
//		asserEquals(cd.getTitle(),"");
		cd.findElement(By.xpath("//span[text()='Sign In']")).click();
		//switch driver to focus
	cd.switchTo().frame(0);
	cd.findElement(By.xpath("")).click();
	
//		System.out.println("No of frames"+cd.findElements(By.tagname("iframe")).size());
		
	}
	@AfterMethod
	public void close() throws Exception
	{
		Thread.sleep(1000);
		cd.quit();
	}
}
