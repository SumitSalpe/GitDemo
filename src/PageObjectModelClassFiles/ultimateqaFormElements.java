package PageObjectModelClassFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ultimateqaFormElements {

	WebDriver driver;
	public ultimateqaFormElements (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Fill out forms")
	WebElement FillOutForms;
	@FindBy(id = "et_pb_contact_name_0")
	WebElement Name1;
	@FindBy(id = "et_pb_contact_message_0")
	WebElement Message1;
	@FindBy(xpath = "//*[@id=\"et_pb_contact_form_0\"]/div[2]/form/div/button")
	WebElement submit1;
	@FindBy(id = "et_pb_contact_name_1")
	WebElement Name2;
	@FindBy(id = "et_pb_contact_message_1")
	WebElement Message2;
	@FindBy(xpath = "//input[@name='et_pb_contact_captcha_1']")
	WebElement captcha;
	@FindBy(xpath = "//*[@id=\"et_pb_contact_form_1\"]/div[2]/form/div/button")
	WebElement submit2;
	
	public void goTo()
	{
		driver.get("https://ultimateqa.com/automation");
	}
	
	public void clickonLink()
	{
		FillOutForms.click();
	}
	
	public void fillForm1(String name1, String message1)
	{
		Name1.sendKeys(name1);
		Message1.sendKeys(message1);
		submit1.click();
	}
	
	public void fillForm2(String name2, String message2)
	{
		Name2.sendKeys(name2);
		Message2.sendKeys(message2);
		captcha.sendKeys("10");
		submit2.click();
	}
	
	public void CloseBrowser()
	{
		driver.close();
	}
}
