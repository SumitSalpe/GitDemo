package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModelClassFiles.ultimateqaFormElements;

public class ultimateqaForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		ultimateqaFormElements ult = new ultimateqaFormElements(driver);
		ult.goTo();
		ult.clickonLink();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ult.fillForm1("David", "Page Object Model Testing tutorial");
		ult.fillForm2("Warner", "Page Object Model Testing tutorial");
		//ult.CloseBrowser();
	}

}
