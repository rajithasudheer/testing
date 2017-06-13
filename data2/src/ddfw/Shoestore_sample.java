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
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Shoestore_sample {

	public static void main(String[] args) throws JXLException, WriteException, IOException, InterruptedException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajitha\\Desktop\\Selenium\\Library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://shoestore-manheim.rhcloud.com/");
		// *[@id="header_nav"]/nav/ul/li[1]/a
		// Blurb//*[@id="jimmy_choo_jimmy_choo'kendall'crystal_pump"]/div/table/tbody/tr[1]/td[1]
		// Price//*[@id="jimmy_choo_jimmy_choo'kendall'crystal_pump"]/div/table/tbody/tr[3]/td[2]
		// Image//*[@id="jimmy_choo_jimmy_choo'kendall'crystal_pump"]/div/table/tbody/tr[6]/td/img
		// input steam

		String path = "C:\\Users\\Rajitha\\Desktop\\Selenium\\Library\\testdata\\tdshoestore.xls";

		FileInputStream fi = new FileInputStream(path);
		Workbook w = Workbook.getWorkbook(fi);
		Sheet s = w.getSheet("Sheet2");

		// output steam
		String path1 = "C:\\Users\\Rajitha\\Desktop\\Selenium\\Library\\testdata\\shoeresults.xls";
		FileOutputStream fo = new FileOutputStream(path1);
		WritableWorkbook ww = Workbook.createWorkbook(fo);
		WritableSheet ws = ww.createSheet("shoeresults", 0);
		String Res;
		for (int i = 1; i < s.getRows(); i++) {
			driver.findElement(By.linkText(s.getCell(0, i).getContents())).click();
			Thread.sleep(4000);
			// Blurb is displayed

			if (driver.findElements(By.xpath("html/body/ul/li[1]/div")).size() > 0) {

				System.out.println("Blurb has displayed");

				Res = "Yes";
			} else {

				System.out.println("Blurb has not displayed");
			}
			Res = " No";
			Label a = new Label(1, i, Res);
			ws.addCell(a);
			// Image
			if (driver.findElements(By.xpath("html/body/ul/li[1]/div/table/tbody/tr[6]/td/img")).size() > 0) {

				System.out.println("Image has displayed");
				Res = "Yes";
			}

			else {
				System.out.println("Image has not displayed");
				Res = " No";

				Label a1 = new Label(2, i, Res);
				ws.addCell(a1);
			}
			// PRICE

			if (driver.findElements(By.xpath("html/body/ul/li[1]/div")).size() > 0) {

				System.out.println("price has displayed");
				Res = "Yes";

			} else {

				System.out.println("price has not displayed");

				Res = " No";
			}

			Label c = new Label(3, i, Res);

			ws.addCell(c);
			// Nested for loop
			for (int j = 0; j < s.getColumns(); j++) {
				Label d = new Label(j, i, s.getCell(j, i).getContents());
				ws.addCell(d);
			} // j for loop end
				// I for loop End
			
		}
		ww.write();
		ww.close();

	}

}
