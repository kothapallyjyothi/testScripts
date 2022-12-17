package testscripts;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ConfirmationPratice {

	WebDriver cd;
	@BeforeMethod
	public void setup()
	{
		cd= new ChromeDriver();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));	
		
		
	}
	
	@AfterMethod
	public void close() throws Exception
	{
		Thread.sleep(1000);
		cd.quit();
	}	
	
	@Test
	public void testingpart() throws Exception
	{
	//load the web page
	cd.get("https://retail.onlinesbi.sbi/retail/login.htm");
	//locating the element linktext
	cd.findElement(By.linkText("CONTINUE TO LOGIN")).click();
	//timer to page sleep
	Thread.sleep(1000);
	//locating the element linktext
	cd.findElement(By.id("username")).click();
	
	//locating the element linktext
	cd.findElement(By.id("Button2")).click();
	//creating the alert object
	Alert al=cd.switchTo().alert();
	//validating the page
	assertEquals(al.getText(),"Enter username");
	//accepting the alert
	al.accept();
	//locating the element 
	cd.findElement(By.xpath("//a[contains(text(),'New User ? Register here/Activate')]")).click();
	//validating the element
	assertEquals(al.getText(),"If you have already obtained Pre-Printed Kit  from the branch for activating INB facility , please don't proceed  with this link. You can input userid and password given in PPK on normal login screen. Note: This link is applicable for Retail customers only.");
	Thread.sleep(1000);
	al.dismiss();
	}
	
}
