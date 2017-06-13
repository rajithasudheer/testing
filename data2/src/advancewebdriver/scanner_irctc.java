package advancewebdriver;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scanner_irctc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rajitha\\Desktop\\Selenium\\Library\\FF-64bit\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.irctc.co.in");
		//scanner;to get the data from console
		System.out.println("please enter capthcha");
		Scanner test1  = new Scanner(System.in);
		String captcha = test1.nextLine();
		
		Thread.sleep(15000);
		driver.findElement(By.id("cimage")).sendKeys(captcha);
		

	}

}
