package testscripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClickAction {
	
	
	WebDriver cd;
	@BeforeMethod
	public void Before()
	{
		cd =new ChromeDriver();
				
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		cd.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));
		cd.manage().deleteAllCookies();
	}
	
	@AfterMethod
	public void close() {
		cd.quit();
	}
	
	@Test
	public void rightClick() throws Exception
	{
		//load web page
		cd.get("https://retail.onlinesbi.sbi/retail/login.htm");
		Actions a =new Actions(cd);
		a.moveToElement(cd.findElement(By.xpath("//a[@class='login_button']"))).contextClick().perform();
		Thread.sleep(3000);
		Alert al = cd.switchTo().alert();
		Assert.assertEquals(al.getText(),"This function is not allowed here.");
		Thread.sleep(3000);
		al.accept();
		Thread.sleep(3000);

		
		
	}
}
