package adactin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Practice {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		FileInputStream f= new FileInputStream("D:\\Hydres.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet sh =  wb.getSheet("Sheet3");
		int rc= sh.getRows();
		int cc= sh.getColumns();
		
		System.out.println(rc+"  "+cc);
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vcred\\\\Downloads\\\\chromedriver_win32 (4)\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		for(int i=0; i <=rc; i++) {
			String OPE = sh.getCell(0,i).getContents();
			String WB = sh.getCell(1,i).getContents();
			String VAL= sh.getCell(2,i).getContents();
			
	

		switch(OPE)
		{
		case "Enter" : driver.findElement(By.xpath(WB)).sendKeys(VAL);
		break;
		case "Open" : driver.get(VAL);
		break;
		case "Click" : driver.findElement(By.xpath(WB)).click();
		
		}
		
		
		
		
		
}}}
