package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver;


// driver.get("https://www.facebook.com/");System.setProperty("webdriver.gecko.driver",	"C:\\Users\\Rajitha\\Desktop\\Selenium\\Library\\FF-64bit\\geckodriver.exe");
driver = new FirefoxDriver();
   driver.get("https://www.facebook.com/");

//type email
driver.findElement(By.id("email")).sendKeys("rajitha");


//driver.findElement(By.id("email")).click();

}
{
}
}


