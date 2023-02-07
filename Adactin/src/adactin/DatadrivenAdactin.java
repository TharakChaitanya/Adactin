package adactin;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DatadrivenAdactin {

	public static void main(String[] args)  throws BiffException, IOException, InterruptedException{
		

		FileInputStream f= new FileInputStream("D:\\Adactin.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet sh= wb.getSheet("Sheet1");
				int rc=sh.getRows();
		int cc=sh.getColumns();
		System.out.println("The no of rows are " +rc);
		System.out.println("The no of coloums are " +cc);
		
		for( int i=0; i<rc; i++)
		{
			String uname=sh.getCell(0,i).getContents();
			String upwd= sh.getCell(1,i).getContents();
			System.out.println(uname+" "+upwd);
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcred\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://adactinhotelapp.com/");
			driver.findElement(By.name("username")).sendKeys(uname);
			driver.findElement(By.name("password")).sendKeys(upwd);
			Thread.sleep(3000);
			driver.findElement(By.name("login")).click();
			Thread.sleep(3000);
			driver.close();			
		}
		
//Search hotel

		FileInputStream f1 = new FileInputStream("D:\\Adactin.xls");
				Workbook wb1 = Workbook.getWorkbook(f1);
				Sheet sh1 = wb1.getSheet("Sheet1");
				int rc1 = sh1.getRows();
				int cc1 = sh1.getColumns();
				System.out.println("No. of rows : " +rc1);
				System.out.println("No. of columns : " +cc1);
				for (int j = 0; j < 3 ; j++) {
					String uname = sh1.getCell(0,j).getContents();
					System.out.println(uname);
					String pwd = sh1.getCell(1, j).getContents();
					System.out.println(pwd);
					String Location = sh1.getCell(2, j).getContents();
					System.out.println(Location);
					String Hotel = sh1.getCell(3, j).getContents();
					System.out.println(Hotel);
					String Roomtype = sh1.getCell(4, j).getContents();
					System.out.println(Roomtype);
					String rooms = sh1.getCell(5, j).getContents();
					System.out.println(rooms);
					String checkin = sh1.getCell(6, j).getContents();
					System.out.println(checkin);
					String checkout = sh1.getCell(7, j).getContents();
					System.out.println(checkout);
					String Firstname = sh1.getCell(8, j).getContents();
					System.out.println(Firstname);
					String Lastname = sh1.getCell(9, j).getContents();
					System.out.println(Lastname);
					String address = sh1.getCell(10, j).getContents();
					System.out.println(address);
					String ccno = sh1.getCell(11, j).getContents();
					System.out.println(ccno);
					String cctype = sh1.getCell(12, j).getContents();
					System.out.println(cctype);
					String expirymonth = sh1.getCell(13, j).getContents();
					System.out.println(expirymonth);
					String expiryyear = sh1.getCell(14, j).getContents();
					System.out.println(expiryyear);
					String cvv = sh1.getCell(15, j).getContents();
					System.out.println(cvv);
					
					WebDriver driver = new ChromeDriver();
					driver.get("https://adactinhotelapp.com/");
					driver.findElement(By.id("username")).sendKeys(uname);
					driver.findElement(By.name("password")).sendKeys(pwd);
					Thread.sleep(2000);
					driver.findElement(By.className("login_button")).click();
					Thread.sleep(3000);
					new Select (driver.findElement(By.id("location"))).selectByVisibleText("Sydney");
					new Select (driver.findElement(By.name("hotels"))).selectByVisibleText("Hotel Sunshine");
					new Select (driver.findElement(By.id("room_type"))).selectByVisibleText(Roomtype);
					driver.findElement(By.xpath("//input[@id='datepick_in']")).clear();
					driver.findElement(By.xpath("//input[@id='datepick_in']")).sendKeys(checkin);
					driver.findElement(By.xpath("//input[@id='datepick_out']")).clear();
					driver.findElement(By.xpath("//input[@id='datepick_out']")).sendKeys(checkout);
					new Select (driver.findElement(By.id("adult_room"))).selectByVisibleText("2 - Two");
	
					Thread.sleep(2000);
					driver.findElement(By.className("reg_button")).click();
					driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
					driver.findElement(By.cssSelector("#continue")).click();
					driver.findElement(By.name("first_name")).sendKeys(Firstname);
					driver.findElement(By.id("last_name")).sendKeys(Lastname);
					driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys(address);
					driver.findElement(By.cssSelector("#cc_num")).sendKeys(ccno);
					new Select (driver.findElement(By.xpath("//select[@id='cc_type']"))).selectByVisibleText(cctype);
					new Select (driver.findElement(By.id("cc_exp_month"))).selectByVisibleText(expirymonth);
					new Select (driver.findElement(By.id("cc_exp_year"))).selectByVisibleText(expiryyear);
					driver.findElement(By.id("cc_cvv")).sendKeys(cvv);
					Thread.sleep(3000);
					driver.findElement(By.name("book_now")).click();
					Thread.sleep(2000);
					driver.findElement(By.partialLinkText("Logout")).click();
					Thread.sleep(2000);
					driver.findElement(By.linkText("Click here to login again")).click();
					driver.close();	
		
				}	}

}
