package Justrechargeit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class updateprofile {

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
		 
		//myprofile
		driver.findElement(By.xpath("//*[@id='myaccountmenu']/div/a")).click();
		//MY ACCOUNT
		driver.findElement(By.xpath("//*[@id='myaccountdd']/div/table/tbody/tr[2]/td/a")).click();
		//EDIT INFORMATION
		driver.findElement(By.xpath("//*[@id='first_div']/table/tbody/tr[18]/td[2]/a/img")).click();
		//FILL INVALID DETAILS
		//PERSONAL DETRALS
		driver.findElement(By.xpath("//*[@id='subtitle']/strong/span")).click();
		//NAME
		driver.findElement(By.xpath("//*[@id='myprofileform']/tbody/tr[4]/td[1]/strong")).sendKeys("rajitha");
		//ADDRESS
		driver.findElement(By.xpath("//*[@id='myprofileform']/tbody/tr[5]/td[1]/strong")).sendKeys("gtyug");
		//CITY
		driver.findElement(By.xpath("//*[@id='myprofileform']tbody/tr[6]/td[1]/strong")).sendKeys("uyr");
		//STATE
		driver.findElement(By.xpath("//*[@id='myprofileform']tbody/tr[7]/td[1]/strong")).sendKeys("uyt");
		//PINCODE
		driver.findElement(By.xpath("/*[@id='myprofileform']/tbody/tr[8]/td[1]")).sendKeys("4546");
		//COUNTRY
		driver.findElement(By.xpath("/*[@id='myprofileform']/tbody/tr[9]/td[1]")).sendKeys("gfdt");
		//DATEOF BIRTH
		driver.findElement(By.xpath("/*[@id='myprofileform']/tbody/tr[10]/td[1]/strong")).sendKeys("08_09_88");
		//PHONE NO
		driver.findElement(By.xpath("/*[@id='myprofileform']/tbody/tr[11]/td[1]/strong")).sendKeys("546789321");
		//LOGINN DETAILS
		driver.findElement(By.xpath("//*[@id='subtitle']/strong/span")).click();
		//EMAIL ID
		driver.findElement(By.xpath("//*[@id='myprofileform']/tbody/tr[15]/td[1]/strong")).sendKeys("jh");
		//OLD PASSWORD
		driver.findElement(By.xpath("//*[@id='myprofileform']/tbody/tr[16]/td[1]")).sendKeys("675");
		//PASSWORD
		driver.findElement(By.xpath("//*[@id='myprofileform']/tbody/tr[17]/td[1]")).sendKeys("675");
		//CONFIRM PASSWORD
		driver.findElement(By.xpath("//*[@id='myprofileform']/tbody/tr[18]/td[1]")).sendKeys("876");
		
		

	}
	
}


