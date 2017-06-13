package Justrechargeit.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOGIN {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajitha\\Desktop\\Selenium\\Library\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.get("https://www.justrechargeit.com/");
		 driver.findElement(By.id("jriTop_signin9")).click();
		  driver.findElement(By.id("txtUserName")).sendKeys("rajitha.amraj@gmail.com");
		  driver.findElement(By.id("txtPasswd")).sendKeys("123456");
		  driver.findElement(By.id("imgbtnSignin")).click();

	}

}
