package Justrechargeit.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tansactionhistory {

	public static void main(String[] args) {
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
		  //my account
		  driver.findElement(By.xpath("//*[@id='myaccountmenu']/div/a")).click();
		  //trasaction history
		  driver.findElement(By.xpath("//*[@id='myaccountdd']/div/table/tbody/tr[6]/td/a")).click();
		  String orderstatus = driver.findElement(By.id("RepDetails_lnkOrderStatus_0")).getText();
		  System.out.println("order status should be:"+ orderstatus );

	}

}
