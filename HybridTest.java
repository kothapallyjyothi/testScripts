package testscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HybridTest extends Driver {
	WebDriver cd;
//	@BeforeMethod
//	public void load()
//	{
//		cd= new ChromeDriver();
//		cd.manage().window().maximize();
//		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//		cd.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));
//		cd.manage().deleteAllCookies();
//	}
//	
//	@AfterMethod
//	public void tearDown() throws Exception
//	{
//		cd.quit();
//		Thread.sleep(1000);
//	}

//	@Test
//	public void testLogin1() throws Exception 
//	{
//		cd.get(url);
//		LoginOR loginPage=new LoginOR(cd);
//		//setting path and sheetname in ExcelUtils predefined class
//		ExcelUtils excel=new ExcelUtils("D:\\excel\\Book1.xlsx","Sheet1");
//		//to get from excel giving the parameters
//		loginPage.fillLoginDetail(excel.getCellData(1, 0),excel.getCellData(1, 1));
//		Thread.sleep(2000);
//		loginPage.clKLogout.click();
//		Thread.sleep(2000);

		
	}
//}
