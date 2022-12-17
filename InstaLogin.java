package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLogin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//launch the browser
		WebDriver d = new ChromeDriver();
		
		//load web page
		d.get("https://instagram.com");
		
		//enter name into email using find element sendkeys 
		d.findElement(By.id("email")).sendKeys("Quality thought Selenium");
		
		d.findElement(By.id("pass")).sendKeys("jyothi");
		
		d.findElement(By.name("login")).click();
		
		Thread.sleep(7800);
		d.quit();
		
	}

}
