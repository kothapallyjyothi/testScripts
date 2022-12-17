package testscripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FbArrayDD {

	WebDriver cd;
	@BeforeMethod
	public void setup()
	{
		cd= new ChromeDriver();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));	

	}

	@Test
	public void testPart()
	{

		//to remove the duplicate the numbers
		List<WebElement>arr;
		//load web page
		cd.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		//assign the elements to string as expected
		String[] expected = { "Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		//creating object the select class
		Select dd= new Select(cd.findElement(By.id("month")));
		//getting the options from webpage
		arr=dd.getOptions();
		System.out.println("Size of the array is"+arr.size());
		//System.out.println("elements"+arr);
		for(int i=0;i<arr.size();i++)
		{
			for(int j=0;j<expected.length;j++)
			{
				//particular month we need to give the month name in place of expected j
				
				if(expected[j].equals(arr.get(i).getText()))
				{
					arr.get(i).click();
					System.out.println((arr.get(i)).getText());
				}
				

			}
		}

	}

	@AfterMethod
	public void close()
	{

		cd.quit();
	}
}
