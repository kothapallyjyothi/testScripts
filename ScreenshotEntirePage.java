package testscripts;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenshotEntirePage {
	
	WebDriver cd;
	@BeforeMethod
	public void setup()
	{
		
	cd= new ChromeDriver();
	cd.manage().window().maximize();
	cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));	
	cd.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));
	cd.manage().deleteAllCookies();
	
	}

	@AfterMethod
	public void close()
	{
		cd.quit();
	}
	@Test
	public void test() throws Exception
	{
		cd.get("https://retail.onlinesbi.sbi/retail/login.htm");
		cd.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		cd.findElement(By.id("chkbox")).click();	
		Thread.sleep(3000);
		//method to execute screenshot
		getScreenshot();
		}
	
	//steps for the screenshot storage
	public void getScreenshot() throws Exception
	{
		DateFormat sdft = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		Date dt = new Date(0);
		File screenshotFile=(File) ((TakesScreenshot) cd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("D:\\SeleniumScreenshots\\"+sdft.format(dt)+".png"));
		
	}
}
