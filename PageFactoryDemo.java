package testscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class PageFactoryDemo 
{
	WebDriver cd;
	@Test
	public void test() throws Exception 
	{
		cd.get("https://demo.cyclos.org/ui/home");
		//created object
		LoginOR loginPage=new LoginOR(cd);
		loginPage.fillLoginDetail("demo", "1234");
//		//click on login link
//		loginPage.lnklogin.click();
//		//Enter user name and password
//		loginPage.tfUsername.sendKeys("demo");
//		loginPage.tfPassword.sendKeys("1234");
//		//click on 	submit button
//		loginPage.btnSubmit.click();
//		Thread.sleep(3000);
		//logout
		loginPage.clKLogout.click();
		Thread.sleep(2000);				
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
