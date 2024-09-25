package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModelClassFiles.LoginPageElements;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		LoginPageElements lpe = new LoginPageElements(driver);
		lpe.goTo();
		lpe.loginApplication("standard_user","secret_sauce");
	}
}