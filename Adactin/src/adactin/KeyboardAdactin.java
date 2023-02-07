package adactin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class KeyboardAdactin {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		FileInputStream f= new FileInputStream("D:\\Adactin.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet sh= wb.getSheet("Sheet3");
				int rc=sh.getRows();
		int cc=sh.getColumns();
		System.out.println("The no of rows are " +rc);
		System.out.println("The no of coloums are " +cc);
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vcred\\\\Downloads\\\\chromedriver_win32 (4)\\\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	for (int i=1 ; i<=rc; i++)
	{
	String OPE = sh.getCell(0,i).getContents();
	String WEL = sh.getCell(1,i).getContents();
	String VAL = sh.getCell(2,i).getContents();
	
	switch(OPE)
	{
	case "Open" : driver.get(VAL);
	break;	
	case "Enter" : driver.findElement(By.xpath(WEL)).sendKeys(VAL);
		break;
		
		case "Click": driver.findElement(By.xpath(WEL)).click();
		break;
		case "Select" : new Select(driver.findElement(By.xpath(WEL))).selectByVisibleText(VAL);
		
		break;}}
	
	
	
	
	
	}

}
