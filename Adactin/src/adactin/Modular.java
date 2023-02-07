package adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Modular {
	WebDriver driver;
	
	@BeforeMethod
	public void start() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcred\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	}
	@Test(priority=1,description= "searchhotel")
	public void tosearchotel() throws InterruptedException {
		url();
		login();
		searchhotel();
		logout();}
	@Test(priority=2,description="userregistration")
		public void newreg() throws InterruptedException {
		url();
	userregis();}
	@Test(priority=3, description="bookanhotel")
	public void bookanhotel() throws InterruptedException {
		url();
		login();
		searchhotel();
		selecthotel();
		bookahotel();
		logout();
		
	}
	
	@AfterMethod
	public void off() {
		driver.close();
	}
	//methods
	public void url() {
		driver.navigate().to("https://adactinhotelapp.com/");
	}
	public void login() {
		driver.findElement(By.name("username")).sendKeys("Tharakreddy");
		driver.findElement(By.name("password")).sendKeys("121212");
		driver.findElement(By.name("login")).click();}
	public void userregis() throws InterruptedException {
		driver.findElement(By.partialLinkText("New User Register")).click();
		 driver.findElement(By.name("username")).sendKeys("Tharakreddy");
		 driver.findElement(By.name("password")).sendKeys("121212");
		 driver.findElement(By.name("re_password")).sendKeys("121212");
		 driver.findElement(By.name("full_name")).sendKeys("Tharakreddy");
		 driver.findElement(By.name("email_add")).sendKeys("tharakchaitanya112@gmail.com");
		 driver.findElement(By.id("tnc_box")).click();
		 System.out.println("New User Registration successful");
		 //driver.findElement(By.name("submit")).click();
		 Thread.sleep(2000);
		 driver.navigate().back();
		 Thread.sleep(2000);}
	public void forgetpassword() throws InterruptedException {
		driver.findElement(By.partialLinkText("Forgot Password?")).click();
		 driver.findElement(By.name("emailadd_recovery")).sendKeys("tharakchaitanya112");
		 //driver.findElement(By.name("submit")).click();
		 System.out.println("Forgot password successful");
		 Thread.sleep(2000);
		 driver.navigate().back();
		 Thread.sleep(2000);}
	
	public void searchhotel() throws InterruptedException {
		new Select(driver.findElement(By.name("location"))).selectByVisibleText("London");
		 Thread.sleep(1000);
		 new Select(driver.findElement(By.name("hotels"))).selectByVisibleText("Hotel Sunshine");
		 Thread.sleep(1000);
		 new Select(driver.findElement(By.name("room_type"))).selectByVisibleText("Double");
		 Thread.sleep(1000);
			driver.findElement(By.id("datepick_out")).clear();
			driver.findElement(By.id("datepick_out")).sendKeys("31/11/2021");
		 Thread.sleep(1000);
		 new Select(driver.findElement(By.name("adult_room"))).selectByVisibleText("2 - Two");
		 Thread.sleep(1000);
		 driver.findElement(By.name("Submit")).click();
		 System.out.println("Search hotel successful");}

	public void selecthotel() throws InterruptedException {
		 driver.findElement(By.name("radiobutton_0")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("continue")).click();
		 System.out.println("Select hotel successful");}
	
	public void bookahotel() throws InterruptedException {
		driver.findElement(By.name("first_name")).sendKeys("Chaitanya");
		 driver.findElement(By.name("last_name")).sendKeys("reddy");
		 driver.findElement(By.name("address")).sendKeys("h.no 100/100");
		 driver.findElement(By.name("cc_num")).sendKeys("1234567887654321");
		 new Select(driver.findElement(By.name("cc_type"))).selectByVisibleText("American Express");
		 new Select(driver.findElement(By.name("cc_exp_month"))).selectByVisibleText("May");
		 new Select(driver.findElement(By.name("cc_exp_year"))).selectByVisibleText("2022");
		 driver.findElement(By.name("cc_cvv")).sendKeys("1100");
		 Thread.sleep(2000);
		 System.out.println("Book a hotel successful");
		 driver.findElement(By.name("book_now")).click();
		 Thread.sleep(3000);
 //driver.findElement(By.partialLinkText("Logout")).click();
		// System.out.println("Logout successful");
		  Thread.sleep(3000);}
		  
	public void logout() throws InterruptedException {
		driver.findElement(By.partialLinkText("Logout")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Click here to login again")).click();
		Thread.sleep(1000);}

}
