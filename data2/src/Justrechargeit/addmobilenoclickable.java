package Justrechargeit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class addmobilenoclickable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajitha\\Desktop\\Selenium\\Library\\chromedriver.exe");
		driver =  new ChromeDriver();
		//URL
		driver.get("https://www.justrechargeit.com/");
		//SIGNIN
		 driver.findElement(By.id("jriTop_signin9")).click();
		 //USERNSME
		  driver.findElement(By.id("txtUserName")).sendKeys("rajitha.amraj@gmail.com");
		  //PASSWORD
		  driver.findElement(By.id("txtPasswd")).sendKeys("123456");
		  //SIGIN
		  driver.findElement(By.id("imgbtnSignin")).click();
		//ADDMOBILE NO
		  driver.findElement(By.xpath("//*[@id='divLnkAddMobile']/a")).click();
		
	}

}
