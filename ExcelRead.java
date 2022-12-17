package testscripts;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExcelRead 
{
WebDriver cd;
	@Test
	public void testlogin() throws Exception
	{
		cd.get("https://demo.cyclos.org/ui/home");
		//Read data from excel
		FileInputStream fis=new FileInputStream("D:\\excel\\Book1.xlsx");
		//XSSFWorkbook wb=new XSSFWorkbook(fis);
		//XSSFSheet s=wb.getSheet("Sheet1");
		
	}
		
}
