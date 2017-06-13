package Justrechargeit.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class make_payment {

	public static void main(String[] args) throws InterruptedException {
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
		//reharge
			driver.findElement(By.id("listingtable_ImgRecharge_0")).click();
			Thread.sleep(3000);
			
			//view popular recharge
			String parentwindowname=driver.getWindowHandle();
			driver.findElement(By.id("lnkPopularRecharge")).click();
			Thread.sleep(3000);
			String childwindow = "PopularRecharges";
				driver.switchTo().window(childwindow );
				Thread.sleep(3000);
			//select the amount
			driver.findElement(By.partialLinkText("75")).click();
			Thread.sleep(3000);
			//move cursur point to parent window
			
			
			
			driver.switchTo().window(parentwindowname);
			Thread.sleep(3000);
			//procced to pay
			driver.findElement(By.id("tdMsg")).click();
			Thread.sleep(3000);
			//debitcard
			driver.findElement(By.id("lblUserDebitCard")).click();
			//statebank
			driver.findElement(By.id("lstvDebit_ctrl0_imgPaymentG_0")).click();
			//procced to pay
			driver.findElement(By.id("btnProceedtoPay")).click();
			Thread.sleep(3000);
			//if user enters invalid payment details
			  new Select(driver.findElement(By.id("debitcard"))).selectByValue("stste bank of india");
			  
			  Thread.sleep(3000);
			 driver.findElement(By.id("debitCardNumber")).sendKeys("1234"); 
			 
			 new Select (driver.findElement(By.id("expiryMonthDebitCard"))).selectByValue("89");
			 new Select( driver.findElement(By.id("expiryYearDebitCard"))).selectByValue("2020");
			 
			  driver.findElement(By.id("CVVNumberDebitCard")).sendKeys("433");
			  driver.findElement(By.id("SubmitBillShip")).click();
			  driver.findElement(By.id("jriTop_signOut")).click();
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
	}

}
