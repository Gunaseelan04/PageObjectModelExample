package PagefactorywithoutAnnotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginWithoutFindby {
	
	
	public static WebElement email;
	public static WebElement pass;
	public static WebElement login;
	@Test
	public void Login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		PageFactory.initElements(driver, LoginWithoutFindby.class);
		email.sendKeys("gunaseelan96.gg@gmail.com");
		pass.sendKeys("9944460277");
		login.click();
			

	}

}
