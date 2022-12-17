package testscripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOR 
{
	@FindBy(id="login-link") public WebElement lnklogin;
	@FindBy(xpath="//input[@type='text']") public WebElement tfUsername;
	@FindBy(xpath="//input[@type='password']") public WebElement tfPassword;
	@FindBy(xpath="//button[contains(.,'Submit')]")public WebElement btnSubmit;
	@FindBy(id="logout-trigger")
	public WebElement clKLogout;

	public LoginOR(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void fillLoginDetail(String uname ,String password )
	{
		
		lnklogin.click();
		tfUsername.sendKeys(uname);
		tfPassword.sendKeys(password);
		btnSubmit.click();
	}
	
}
