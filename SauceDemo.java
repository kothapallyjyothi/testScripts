package testscripts;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class SauceDemo {
	WebDriver cd;
	@BeforeMethod
	public void start()
	{
		cd= new ChromeDriver();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));	
		cd.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));
		cd.manage().deleteAllCookies();
		
	}
	@AfterMethod
	public void close() throws Exception
	{
		Thread.sleep(1000);
		cd.quit();
	}
	@Test
	public  void test() throws Exception
	{
		//load web page
		cd.get(("https://www.saucedemo.com/"));
		//login credintials
		cd.findElement(By.id("user-name")).sendKeys("standard_user");
		//password creditials
		cd.findElement(By.id("password")).sendKeys("secret_sauce");	
		//click on the login
		cd.findElement(By.id("login-button")).click();
		//click on the menu bar
		cd.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(3000);
		cd.findElement(By.id("about_sidebar_link")).click();
		WebElement verifypg= cd.findElement(By.xpath("//div[2]/ul/li/a/span"));
	}


}
