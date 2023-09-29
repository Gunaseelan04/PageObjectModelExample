package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObject.LoginPageObject;

public class LoginTestCase {

	@Test
	public void login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
		Thread.sleep(3000); 
		
		PageFactory.initElements(driver, LoginPageObject.class);
		
		LoginPageObject.username.sendKeys("gunaseelan96.gg@gmail.com");
		LoginPageObject.password.sendKeys("9944460277");
		LoginPageObject.login.click();


		/*LoginPageObject.username(driver).sendKeys("gunaseelan96.gg@gmail.com");
		LoginPageObject.password(driver).sendKeys("9944460277");
		LoginPageObject.login(driver).click();
		LoginPageObject.video(driver).click();*/

	}

	/*
	 * driver.findElement(By.id("email")).sendKeys("mgunaseelan1996@gmail.com");
	 * 
	 * driver.findElement(By.id("pass")).sendKeys("Gunaseelan1996$");
	 * 
	 * driver.findElement(By.xpath("//button[@value='login']")).click();
	 */

}
