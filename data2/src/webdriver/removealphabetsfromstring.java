package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class removealphabetsfromstring {

	public static void main(String[] args) {
		
		  WebDriver driver;
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajitha\\Desktop\\Selenium\\Library\\chromedriver.exe");
			driver =  new ChromeDriver();
			//remove alphabet
			String test1 = "ASGHFtyrry34gh786";
			System.out.println(test1.replaceAll("[^0-9]", ""));
			System.out.println(test1.replaceAll("[^a-zA-Z]", ""));
			
			
	}

}
