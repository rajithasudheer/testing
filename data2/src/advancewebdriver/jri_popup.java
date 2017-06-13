package advancewebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class jri_popup {

	private static String parentwindow;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rajitha\\Desktop\\Selenium\\Library\\FF-64bit\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.justrechargeit.com/");
		Thread.sleep(5000);
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
				//amount no.42
				driver.findElement(By.xpath(".//*[@id='listingtable']/tbody/tr[3]/td[1]")).click();
																					
				// close popu
				driver.close();
				//move cursur point to parent window
				
				driver.switchTo().window(parentwindow);
						

		
		

	}

}
