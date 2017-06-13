package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class validation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",	"C:\\Users\\Rajitha\\Desktop\\Selenium\\Library\\FF-64bit\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
driver.get("https://accounts.google.com");
//maximize the browser
driver.manage().window().maximize();
driver.findElement(By.id("identifierId")).sendKeys("rajiTha");

driver.findElement(By.id("yDmH0d")).click();
Thread.sleep(3000);
//validate whether stay signed in chek box is selected or not
if (driver.findElement(By.id(null)) != null) {
	
}
	}

}
