package testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginDemo  
{
	WebDriver cd;

	@Test
	public void testLogin()
	{
		//launch the browser
		cd.get("https://demo.cyclos.org/ui/home");
		cd.findElement(By.xpath("//a[@id='login-link']/div")).click();
		cd.findElement(By.xpath(" //input[@type='text']")).clear();
	}
	
}
