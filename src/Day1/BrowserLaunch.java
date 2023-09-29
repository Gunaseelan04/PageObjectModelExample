package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import PageObject.LoginPageObject;

public class BrowserLaunch {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.omrbranch.com/");

		driver.manage().window().maximize();

		/*driver.findElement(By.id("email")).sendKeys("mgunaseelan1996@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("Gunaseelan1996$");

		driver.findElement(By.xpath("//button[@value='login']")).click();*/
		
		
		LoginPageObject LoginPageObject = new LoginPageObject();
		

		Thread.sleep(6000);

		WebElement username = driver.findElement(By.xpath("//a[@class='icoTwitter mr-2 dropdown-toggle']"));

		String text = username.getText();

		System.out.println(text);

		WebElement Search = driver.findElement(By.id("search"));

		Search.sendKeys("nuts", Keys.ENTER);

		// driver.findElement(By.xpath("//i[@class='fa fa-search
		// colorWhite']")).click();
		// Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//a[@class='hover1 font16 fontsemibold colorWhite bgTheme px-4 py-1 radius50 dyna_btn addBtn-17']"))
				.click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@id='cart-21']")).click();

		Thread.sleep(3000);

		// JavascriptExecutor js = (JavascriptExecutor) driver;

		Thread.sleep(2000);
		WebElement exe = driver.findElement(By.xpath("//a[text()=' Go To Cart ']"));
		exe.click();

		// js.executeScript("arguments[0].click", exe);

		Thread.sleep(3000);

		WebElement mycrt = driver.findElement(By.xpath("//h5[text()='My Cart']"));

		String text2 = mycrt.getText();

		System.out.println(text2);

		driver.findElement(By.xpath(
				"//div[@class='diffAddres addAddress d-flex justify-content-center align-items-center mb-md-0 mb-2']"))
				.click();

		WebElement address = driver.findElement(By.xpath("//select[@id='address_type']"));

		Select slt = new Select(address);

		slt.selectByIndex(2);

		driver.findElement(By.name("first_name")).sendKeys("Gunaseelan");

		driver.findElement(By.name("last_name")).sendKeys("M");

		driver.findElement(By.name("mobile")).sendKeys("9894545712");

		driver.findElement(By.name("apartment")).sendKeys("S45");

		driver.findElement(By.name("address")).sendKeys("Aavaram Poo Street, Poonganagar, Tiruvallur");

		// WebElement cntry = driver.findElement(By.name("country"));
		//
		// Select country = new Select(cntry);
		//
		// country.selectByIndex(0);

		WebElement st = driver.findElement(By.name("state"));

		Select state = new Select(st);

		state.selectByValue("35");

		Thread.sleep(1000);

		WebElement ct = driver.findElement(By.name("city"));

		Select city = new Select(ct);

		city.selectByIndex(35);

		driver.findElement(By.name("zipcode")).sendKeys("602001");

		driver.findElement(By.xpath("//*[@id=\"updateAddress\"]/div[6]/button")).click();

		Thread.sleep(2000);

		WebElement payment = driver.findElement(By.id("payment_type"));

		Select pay = new Select(payment);

		pay.selectByIndex(1);

		Thread.sleep(500);

		WebElement crd = driver.findElement(By.xpath("//*[@id=\"hidden_section\"]/div[1]/ul/li[2]/div/label"));
		crd.click();

		driver.findElement(By.xpath("//input[@name='card_no']")).sendKeys("5555555555552222");

		WebElement mnth = driver.findElement(By.xpath("//select[@id='month']"));

		Select mnt = new Select(mnth);

		mnt.selectByIndex(1);

		WebElement yr = driver.findElement(By.xpath("//select[@id='year']"));

		Select year = new Select(yr);

		year.selectByIndex(1);

		driver.findElement(By.xpath("//input[@name='cvv']")).sendKeys("844");

		driver.findElement(By.xpath("//button[@id='placeOrder']")).click();

		Thread.sleep(10000);

		driver.findElement(By.id("email")).sendKeys("mgunaseelan1996@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("Gunaseelan1996$");

		driver.findElement(By.xpath("//button[@value='login']")).click();

		Thread.sleep(6000);

		driver.findElement(By.xpath("//a[@class='icoTwitter mr-2 dropdown-toggle']")).click();

		Thread.sleep(1500);

		driver.findElement(By.xpath("//a[@class='dropdown-item padding_manage acc_anchor border-bottom ']")).click();

		driver.findElement(By.id("v-pills-orders-tab")).click();

		Thread.sleep(1000);

		WebElement orderid = driver.findElement(By.xpath("//*[@id=\"v-pills-orders\"]/div/div[1]/div[1]/a/p[1]/span"));

		String text6 = orderid.getText();

		System.out.println(text6);

	}

}
