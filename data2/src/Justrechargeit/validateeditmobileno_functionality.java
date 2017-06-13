package Justrechargeit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class validateeditmobileno_functionality {

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
		//ADDMOBILE NO
		  driver.findElement(By.xpath("//*[@id='divLnkAddMobile']/a")).click();
		//MOBILE NO TO ENTER
		  driver.findElement(By.id("txtpopMobileNo")).sendKeys("9959651221");
		  //sp
		  driver.findElement(By.id("lblpopMobileSPCaption"));
		  //sp drop drown
		  new Select(driver.findElement(By.id("ddlpopMobileSP"))).selectByVisibleText("AIRTEL");
		  //NICKNAME
		  driver.findElement(By.id("lblpopMobileNicknameCaption")).sendKeys("nani");
		  //EDIT BUTTON
		  driver.findElement(By.id("listingtable_btnGridEdit_1")).click();
		  //SAVE BUTTON
		  driver.findElement(By.id("listingtable_btnGridSave_1")).click();
		  //EDIT BUTTON
		  driver.findElement(By.id("listingtable_btnGridEdit_1")).click();
		  //cancel button
		  driver.findElement(By.id("listingtable_btnGridCancel_1")).click();
}



	}


