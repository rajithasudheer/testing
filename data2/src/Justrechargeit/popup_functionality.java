package Justrechargeit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class popup_functionality {

	public static void main1(String[] args) {
		String parentwindow;
	}
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rajitha\\Desktop\\Selenium\\Library\\FF-64bit\\geckodriver.exe");
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://www.justrechargeit.com/");
			Thread.sleep(5000);
			String parentwindow =driver.getWindowHandle();
			//signin
			driver.findElement(By.id("jriTop_signin9")).click();
			Thread.sleep(4000);
			//username
			driver.findElement(By.id("txtUserName")).sendKeys("rajitha.amraj@gmail.com");
			//password
			driver.findElement(By.id("txtPasswd")).sendKeys("123456");
			Thread.sleep(3000);
			//signin button
			driver.findElement(By.id("imgbtnSignin")).click();
			Thread.sleep(3000);
			//reharge
			driver.findElement(By.id("listingtable_ImgRecharge_0")).click();
			Thread.sleep(3000);
			//view popular recharge
			driver.findElement(By.id("lnkPopularRecharge")).click();
			
			// popup window
					String childwindow = "PopularRecharges";
					driver.switchTo().window(childwindow);
					Thread.sleep(3000);
					// do some action on popup window
					//amount no.109
					//.findElement(By.xpath(".//*[@id='listingtable']/tbody/tr[3]/td[1]")).click();
					driver.findElement(By.linkText("109")).click();
																						
					// close popu
					//driver.close();
					//move cursur point to parent window
					
					
					driver.switchTo().window(parentwindow);
							

	}

}
