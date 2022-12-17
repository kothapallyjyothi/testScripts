package testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CssLocateElements {

				WebDriver cd;
				@BeforeMethod
				public void setup()
				{
					cd = new ChromeDriver();
				}
				
				@Test
				public void testingPart()
				{
					cd.get("https://retail.onlinesbi.sbi/retail/login.htm");
					cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
					//cd.findElement(By.xpath("//a[@id='login-link']")).click();

					cd.findElement(By.cssSelector(".continue_btn:nth-child(2) > .login_button")).click();
//					cd.findElement(By.cssSelector("label"));
					//using id (syntax= tagname#id_value)
					cd.findElement(By.cssSelector("input#username")).sendKeys("selenium");
					//using class(syntax= .class_value)
					cd.findElement(By.cssSelector(".form-control"));
					//using unique(syntax = tagname[uattributename='value']
					cd.findElement(By.cssSelector("a[tabindex='20']"));
					//using parent (syntax =.pclass_value ctagname[cattributename='value']
					cd.findElement(By.cssSelector(".user_links a[tabindex='20']"));
					//using unique css=tagname[uattributename='value']
					cd.findElement(By.cssSelector("label[for='captcha']"));
				}
				@AfterMethod
				public void closeB() throws Exception
				{
					Thread.sleep(6000);
					cd.quit();
					
				}
	
	
}
