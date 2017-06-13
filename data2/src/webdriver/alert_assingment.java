package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class alert_assingment {

	public static void main(String[] args) throws InterruptedException {
		String path = "C:\\Users\\Rajitha\\Desktop\\Selenium\\Library\\chromedriver.exe";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", path);
		driver =  new ChromeDriver();
		String baseURL =" https://www.irctc.co.in";
		driver.get(baseURL);
		//click login button
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);
		//get the text using get text
		String alertText = driver.switchTo().alert().getText();
		System.out.println("alertText is: >>" +alertText);
		
		
		System.out.println("Before alert");
		//Alert handle
		driver.switchTo().alert().accept();
		System.out.println("After alert");

	}

}