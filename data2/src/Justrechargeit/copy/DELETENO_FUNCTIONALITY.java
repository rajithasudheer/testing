package Justrechargeit.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DELETENO_FUNCTIONALITY {

	public static void main(String[] args) {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajitha\\Desktop\\Selenium\\Library\\chromedriver.exe");
		driver =  new ChromeDriver();
		//URL
		driver.get("https://www.justrechargeit.com/");
		//SIGNIN
		 driver.findElement(By.id("jriTop_signin9")).click();
		// Thread.sleep("3000");
		 //USERNSME
		  driver.findElement(By.id("txtUserName")).sendKeys("rajitha.amraj@gmail.com");
		  //PASSWORD
		  driver.findElement(By.id("txtPasswd")).sendKeys("123456");
		  //SIGIN
		  driver.findElement(By.id("imgbtnSignin")).click();
		 // Thread.sleep("3000");
		 
		  //DELETE BUTTON
		  driver.findElement(By.id("listingtable_btnGridDelete_1")).click();
		 // Thread.sleep("3000");
		  //click on cancel button on conformation alert
		  driver.switchTo().alert().dismiss();
		  //DELETE BUTTON
		  driver.findElement(By.id("listingtable_btnGridDelete_1")).click();
		  //click on ok button on conformation alert
		  driver.switchTo().alert().accept();
		  //NOW second has deleted
		  //validate the second row mobile no is old or new one
		  //Thread.sleep("3000");
		   String OldMobileNumber = driver.findElement(By.id("listingtable_btnGridDelete_1")).getText();
		   System.out.println("OldMobileNumber:"+OldMobileNumber);

	}

}
