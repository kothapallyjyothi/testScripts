package testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class XpathCycloPratice {
	
	WebDriver cd;
	@BeforeMethod
	public void abc()
	{
		cd= new ChromeDriver();
	}

	@Test
	
	public void testingpart()
	{
		cd.get("https://demo.cyclos.org/ui/home");
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		cd.findElement(By.xpath("//a[@id='login-link']")).click();

	}
	@AfterMethod
	public void close()
	{
		cd.quit();
	}
}
