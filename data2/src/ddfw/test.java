package ddfw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class test {

	public static void main(String[] args) throws JXLException, IOException {

		WebDriver driver;
		// path of the file
		String path = "C:\\Users\\Rajitha\\Desktop\\Selenium\\Library\\testdata\\TDoutput.xls";
		String path1 = "C:\\Users\\Rajitha\\Desktop\\Selenium\\Library\\testdata\\td.xls";

		FileInputStream fi = new FileInputStream(path1);
		Workbook w = Workbook.getWorkbook(fi);
		Sheet s = w.getSheet("Sheet1");
		//through eclipse we are going to create Excel file and send some data to excel
		//Fileoutput steam
	
		FileOutputStream fo = new FileOutputStream(path);
		WritableWorkbook ww = Workbook.createWorkbook(fo);
		WritableSheet ws = ww.createSheet("Testing", 0);
		//to send data to excel
		Label a = new Label(1, 3, "rajitha");
		ws.addCell(a);
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajitha\\Desktop\\Selenium\\Library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id(s.getCell(4, 1).getContents())).sendKeys(s.getCell(5, 1).getContents());
		driver.findElement(By.id(s.getCell(4, 2).getContents())).sendKeys(s.getCell(5, 2).getContents());
		driver.findElement(By.id(s.getCell(4, 3).getContents())).sendKeys(s.getCell(5, 3).getContents());
		

	}

}
