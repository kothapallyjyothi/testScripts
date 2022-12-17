package testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowPratice {
	
	WebDriver cd;
	@BeforeMethod
	public void setup()
	{
		cd= new ChromeDriver();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));	
		cd.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));
		cd.manage().deleteAllCookies();
		
	}
	
	@AfterMethod
	public void close() throws Exception
	{
		Thread.sleep(5000);
		cd.close();
	}	

	@Test
	public void windowTest() throws Exception
	{
		//load the web page
		cd.get("https://retail.onlinesbi.sbi/retail/login.htm");
		//click on continue to login
		cd.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		//locating the element
		cd.findElement(By.xpath("//a[contains(text(),'New User ? Register here/Activate')]")).click();
		Thread.sleep(2000);
		//click on alert ok
		Alert al =cd.switchTo().alert();
		//validate the window
		assertEquals(al.getText(),"If you have already obtained Pre-Printed Kit  from the branch for activating INB facility , please don't proceed  with this link. You can input userid and password given in PPK on normal login screen. Note: This link is applicable for Retail customers only.");	
		al.accept();
		
		Thread.sleep(3000);
		//assign the window as array
		ArrayList<String> sw =new ArrayList<String>(cd.getWindowHandles());
		//show the handles
		System.out.println("No of Handles:"+sw.size());
		System.out.println(sw);
		//switch driver focus online---Home loan window
		cd.switchTo().window(sw.get(1));
		Thread.sleep(3000);
		//selecting the options from New user registration
		Select ss=new Select(cd.findElement(By.xpath("//select[@title='NewUserReg']")));
		//considering list as options
		List<WebElement>d=ss.getOptions();
		
		for (int i = 0; i <d.size(); i++) {
			d.get(i).click();
			System.out.println(d.get(i).getText());
		}
		assertTrue(cd.findElement(By.id("nextStep")).isDisplayed());
		Thread.sleep(3000);
		//switch driver focus Home -- online window
		cd.switchTo().window(sw.get(0));
		Thread.sleep(3000);
		//find the element and the typing the name
		cd.findElement(By.id("username")).sendKeys("Selenium");
		Thread.sleep(3000);
		
		}
	}
