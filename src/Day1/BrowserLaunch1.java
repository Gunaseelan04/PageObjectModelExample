package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch1 {

	public static void main(String[] args) {
		// Initialize the webDriver-----interface
				// To load the driver

				WebDriver driver = new ChromeDriver();

				// load the url
				driver.get("https://www.facebook.com/");

				// maximize the webpage
				driver.manage().window().maximize();

				// to get the title of the web page
				String title = driver.getTitle();
				System.out.println(title);

				// to get the current url
				String currentUrl = driver.getCurrentUrl();
				System.out.println(currentUrl);

	}

}
