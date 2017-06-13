package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class popup_sbi {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rajitha\\Desktop\\Selenium\\Library\\FF-64bit\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		String baseURL = "https://www.onlinesbi.com/";
		driver.get(baseURL);
		Thread.sleep(3000);
		//login
		
		driver.findElement(By.xpath("//*[@id='banking']/div[1]/div/a[1]")).click();
		Thread.sleep(5000);
		//continue login button
		driver.findElement(By.xpath(".//*[@id='phishing_banner']/div/a")).click();
		// get the title of current window
		String parentwindow = driver.getWindowHandle();// parent window title

		Thread.sleep(5000);
		// forget username link
		driver.findElement(By.xpath("//*[@id='login_block']/form/div[2]/div[1]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		// popup window
		String childwindow = "aboutus";
		driver.switchTo().window(childwindow);
		Thread.sleep(3000);
		// do some action on popup window
		driver.findElement(By.id("cifno")).sendKeys("1234567");// cif
																			// number
		// close popup
		driver.close();
		// move cursur point to parent window
		driver.switchTo().window(parentwindow);
		Thread.sleep(3000);

	}

}
