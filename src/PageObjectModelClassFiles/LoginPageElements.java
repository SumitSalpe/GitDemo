package PageObjectModelClassFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElements {

	WebDriver driver;

	public LoginPageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// pageFactory
	@FindBy(id = "user-name")
	WebElement username;

	@FindBy(id = "password")
	WebElement passcode;

	@FindBy(id = "login-button")
	WebElement submit;
	
	public void loginApplication(String email, String password)
	{
		username.sendKeys(email);
		passcode.sendKeys(password);
		submit.click();
	}
	
	public void goTo()
	{
		driver.get("https://www.saucedemo.com/");
	}
}
