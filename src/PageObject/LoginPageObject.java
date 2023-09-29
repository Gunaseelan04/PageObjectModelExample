package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObject {

	@FindBy(how=How.NAME,using="email")
	public static  WebElement username;
	@FindBy(name="pass")
	public static WebElement password;
	@FindBy(xpath="//Button[@value=1]")
	public static WebElement login;
	
	
	
	

	/*public static WebElement username(WebDriver driver) {
		return driver.findElement(By.id("email"));

	}

	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.id("pass"));

	}

	public static WebElement login(WebDriver driver) {
		return driver.findElement(By.xpath("//Button[@value=1]"));

	}
	
	public static WebElement video(WebDriver driver) {
		return driver.findElement
				(By.xpath("//span[@Class='x1lliihq x6ikm8r x10wlt62 x1n2onr6']"));
		

	}*/

}
