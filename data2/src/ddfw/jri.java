package ddfw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class jri {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException {

		WebDriver driver;
		String path = "C:\\Users\\Rajitha\\Desktop\\Selenium\\Library\\testdata\\jri.xls";

		FileInputStream fi = new FileInputStream(path);
		Workbook w = Workbook.getWorkbook(fi);
		Sheet s1 = w.getSheet("retestingdata");
		Sheet s2 = w.getSheet("inputdata");
		Sheet s3 = w.getSheet("locatersdata");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajitha\\Desktop\\Selenium\\Library\\chromedriver.exe");
		driver = new ChromeDriver();
		// URL
		driver.get(s2.getCell(0, 1).getContents());
		// USERNAME
		driver.findElement(By.id(s3.getCell(0, 2).getContents())).sendKeys(s2.getCell(1, 1).getContents());
		// PASSWORD
		driver.findElement(By.id(s3.getCell(1, 2).getContents())).sendKeys(s2.getCell(2, 1).getContents());
		// LOGIN BUTTON
		driver.findElement(By.id(s3.getCell(2, 2).getContents())).click();

		/*
		 * //Explicit Wait WebDriverWait wait = new WebDriverWait
		 * wait(driver,10); wait until(expectedconditions.elementto be
		 * clickable(By.xpath(s3.getCell(3, 2).getContents()));
		 */

		// size=0 means element is not yet present on webpage
		// size=1 means element is  present on webpage
		while (driver.findElements(By.xpath(s3.getCell(3, 2).getContents())).size() < 1)
			;
		{
			Thread.sleep(1000);
		}
		// ADD BUTTON CLIck

		
		driver.findElement(By.xpath(s3.getCell(3, 2).getContents())).click();

		Thread.sleep(500);
		// ENTER MOBILE NO
		driver.findElement(By.xpath(s3.getCell(4, 2).getContents())).sendKeys(s1.getCell(0, 1).getContents());
		// SERVICE PROVIDER TEXT
		String sptext = driver.findElement(By.id(s3.getCell(5, 2).getContents())).getText();
		// VODAPHONE
		System.out.println("spText >>> " + path);
		// VALIDATE IT WHETHER IT IS EQULES TO SELECT OR NOT?
		if (sptext.equals("vodaphone")) {
			// IF BOTH TESTSVARE MATCHING(SELECT)NO SP...USER SHOULD SELECT ANY
			// SP FROM DROPDOWN
			// new
			// (driver.findElements(By.xpath(s3.getCell(5,
			// 2).getContents()))).select by visible texts1.getCell(0, 1));
			new Select(driver.findElement(By.id(s3.getCell(5, 2).getContents()))).selectByVisibleText("vodaphone");

		}
	}
}
