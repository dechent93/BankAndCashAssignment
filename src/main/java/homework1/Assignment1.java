package homework1;

import java.util.concurrent.TimeUnit;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	static WebDriver driver;

	@Before
	public void WebLaunch() {

		System.setProperty("webdriver.chrome.driver", "chromedriver");

		driver = new ChromeDriver();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void testDemo() throws InterruptedException {

		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123"); // identify password and pass value
		driver.findElement(By.name("login")).click(); // identify login and pass value

		Thread.sleep(2000);

		driver.findElement(By.xpath("html/body/section/div/nav/div/ul/li[10]/a/span[1]")).click();
		driver.findElement(By.xpath("html/body/section/div/nav/div/ul/li[10]/ul/li/a[1]")).click();

		Thread.sleep(1000);

		driver.findElement(By.id("account")).sendKeys("Dechen Tshering");
		driver.findElement(By.id("description")).sendKeys("Saving Account");
		driver.findElement(By.id("balance")).sendKeys("1000000");
		driver.findElement(By.id("account_number")).sendKeys("AC009827272");
		driver.findElement(By.id("contact_person")).sendKeys("Dechen Tshering");
		driver.findElement(By.id("contact_phone")).sendKeys("99779909");
		driver.findElement(By.id("ib_url")).sendKeys("N/A");
		driver.findElement(By.xpath("html/body/section/div/div[1]/div[3]/div/div[1]/div/div[2]/form/button")).click();

		Thread.sleep(3000);

	}

	@After
	public void tearDown() {

		driver.close();
		driver.quit();
	}

}