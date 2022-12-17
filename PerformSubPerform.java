package testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;

public class PerformSubPerform {
	
	
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
	public void Test() throws Exception
	{
		//load web page
		cd.get("https://retail.onlinesbi.sbi/");
		
		Actions a = new Actions(cd);
		a.clickAndHold(cd.findElement(By.xpath("//a[contains(text(),'Apply for SB/ Current Account')]"))).release().build().perform();
		Thread.sleep(1000);
	//a.moveToElement(cd.findElement(By.xpath("//ul[@id='sub-menu']"))).perform();
	//Thread.sleep(5000);
		a.clickAndHold(cd.findElement(By.xpath("(//a[text()='Current Account '])[1]"))).build().perform();
		Thread.sleep(1000);

//		//perform on mca account
//		a.clickAndHold(cd.findElement(By.xpath("//a[contains(.,'MCA Current Account')]"))).build().perform();
//		Thread.sleep(1000);

	}
}
