package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	WebDriver driver;
	long Starttime;
	long Endtime;

	@BeforeSuite
	private void launchBrowser() {
		System.setProperty("Webdriver.Chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		Starttime = System.currentTimeMillis();
		System.currentTimeMillis();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

	}

	@Test
	public void openGoogle() {

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

	}

	@Test
	public void openYahoo() {

		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();

	}

	@AfterSuite
	private void closeBrowser() {

		// driver.quit();
		Endtime = System.currentTimeMillis();
		System.currentTimeMillis();
        System.currentTimeMillis();
		long Totaltime = Endtime - Starttime;
		System.out.println("Total Time Taken" + Totaltime);
	}

}
