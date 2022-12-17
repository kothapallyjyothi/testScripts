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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParticularElementScreenshot {

	WebDriver cd;
	@BeforeMethod
	public void setup() {
		cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(600));
		cd.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));
		cd.manage().deleteAllCookies();
		
	}
	@AfterMethod 
	public void close() throws Exception
	{
		cd.quit();
		Thread.sleep(1000);
	}

	@Test
	public void testing() throws Exception  
	{
		cd.get("https://retail.onlinesbi.sbi/retail/login.htm");
		cd.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		Thread.sleep(1000);
		cd.findElement(By.xpath("//input[@id='capOption']")).click();
		Thread.sleep(3000);
		
//		WebElement audio= cd.findElement(By.xpath("//input[@id='capOption']"));
//		
//		DateFormat sdf= new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
//		Date dt = new Date(0);
//		File screenshotfile=audio.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(screenshotfile, new File("D:\\SeleniumScreenshots\\"+sdf.format(dt)+"014.png"));
		
		WebElement audio1= cd.findElement(By.xpath("//audio[@id='loginAudioCaptcha']"));
		DateFormat sdf1= new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		Date dt1 = new Date(0);
		File screenshotfile1=audio1.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotfile1, new File("D:\\SeleniumScreenshots\\"+sdf1.format(dt1)+"audio.png"));
		
	}
//	public void getScreenshot() throws Exception
//	{
//		DateFormat sdf= new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
//		Date dt = new Date(0);
//		File screenshotfile=((TakesScreenshot) cd).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(screenshotfile, new File("D:\\SeleniumScreenshots\\"+sdf.format(dt)+".png"));
//
//		
//	}
	
}

