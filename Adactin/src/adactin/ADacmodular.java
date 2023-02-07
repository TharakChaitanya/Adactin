package adactin;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ADacmodular {
	
	WebDriver driver;
	
	@BeforeMethod
	public void driversetup()
	{	
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcred\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	
	//-------------------------Tests---------------------------------//
	
	@Test(priority=1,description="Booking an Hotel", groups = "Bookings")
	public void bookingAnhotel() throws InterruptedException {
		openbrowser();
		login();
		bookinghotel();
		logout();
	}
	
	@Test(priority=2, description = "cancelling a hotel booking", groups = "cancellations")
	public void cancelHotelBooking() throws InterruptedException {
		openbrowser();
		login();
		cancelbookingofaHotel();
		logout();
	}
	
	@Test(priority=3, description = "New User Registration", groups = "Registrations")
	public void NewsUserRegistration() throws InterruptedException {
		openbrowser();
		NewRegistration();
		login();
		logout();
	}
	
	@Test(priority=4, description = "Forgot password Form", groups = "ResetPassword")
	public void  ForgotPasswordForm() throws InterruptedException {
		openbrowser();
		ForgotPassword();
	}
	
	@Test(priority=5,description="Reset Search Hotel data", groups = "TestData")
	public void ResetHotelSearch() throws InterruptedException {
		openbrowser();
		login();
		ResetHotel();
		logout();
	}
	
	//-------------------------------Tests---------------------------------------------//
	
	@AfterMethod
	public void Teardown() {
		driver.close();
		
	}
	
	//-------------------------------Methods----------------------------------------//
	
	public void openbrowser()
	{
		driver.get("https://adactinhotelapp.com/");
	}
	
	public void login() throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys("suryaaaa");
		driver.findElement(By.name("password")).sendKeys("abcd4321");
		Thread.sleep(2000);
		driver.findElement(By.className("login_button")).click();
	}
	
	public void NewRegistration() throws InterruptedException {
		driver.findElement(By.className("login_register")).click();
		driver.findElement(By.id("username")).sendKeys("surya");
		driver.findElement(By.id("password")).sendKeys("abcdef123");
		driver.findElement(By.id("re_password")).sendKeys("abcdef123");
		driver.findElement(By.id("full_name")).sendKeys("Suryaa");
		driver.findElement(By.id("email_add")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("captcha-form")).sendKeys("");
		WebElement radio1=driver.findElement(By.id("tnc_box"));
				radio1.click();
		Thread.sleep(4000);
		driver.findElement(By.id("Submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Go back to Login page")).click();
	}
	
	public void bookinghotel() throws InterruptedException {
		Select DrpLocation = new Select (driver.findElement(By.className("search_combobox")));
		DrpLocation.selectByVisibleText("Sydney");
		Select DrpHotel = new Select (driver.findElement(By.name("hotels")));
		DrpHotel.selectByVisibleText("Hotel Sunshine");
		Select DrpRoomType = new Select (driver.findElement(By.id("room_type")));
		DrpRoomType.selectByVisibleText("Double");
		driver.findElement(By.xpath("//input[@id='datepick_in']")).clear();
		driver.findElement(By.xpath("//input[@id='datepick_in']")).sendKeys("01/01/2022");
		driver.findElement(By.xpath("//input[@id='datepick_out']")).clear();
		driver.findElement(By.xpath("//input[@id='datepick_out']")).sendKeys("02/01/2022");
		Select DrpAdults = new Select (driver.findElement(By.id("adult_room")));
		DrpAdults.selectByVisibleText("2 - Two");
		driver.findElement(By.className("reg_button")).click();
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
		driver.findElement(By.cssSelector("#continue")).click();
		driver.findElement(By.name("first_name")).sendKeys("Surya");
		driver.findElement(By.id("last_name")).sendKeys("P");
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Hyderabad");
		driver.findElement(By.cssSelector("#cc_num")).sendKeys("1234567890123456");
		Select DrpCCType = new Select (driver.findElement(By.xpath("//select[@id='cc_type']")));
		DrpCCType.selectByVisibleText("American Express");
		Select DrpCCExp = new Select (driver.findElement(By.id("cc_exp_month")));
		DrpCCExp.selectByVisibleText("January");
		Select DrpCCYear = new Select (driver.findElement(By.id("cc_exp_year")));
		DrpCCYear.selectByVisibleText("2022");
		driver.findElement(By.id("cc_cvv")).sendKeys("1234");
		Thread.sleep(2000);
		driver.findElement(By.name("book_now")).click();
		Thread.sleep(5000);
	}
	
	public void ResetHotel() throws InterruptedException {
		Select DrpLocation = new Select (driver.findElement(By.className("search_combobox")));
		DrpLocation.selectByVisibleText("Sydney");
		Select DrpHotel = new Select (driver.findElement(By.name("hotels")));
		DrpHotel.selectByVisibleText("Hotel Sunshine");
		Select DrpRoomType = new Select (driver.findElement(By.id("room_type")));
		DrpRoomType.selectByVisibleText("Double");
		driver.findElement(By.xpath("//input[@id='datepick_in']")).sendKeys("01/01/2022");
		driver.findElement(By.xpath("//input[@id='datepick_out']")).sendKeys("02/01/2022");
		Select DrpAdults = new Select (driver.findElement(By.id("adult_room")));
		DrpAdults.selectByVisibleText("2 - Two");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Reset']")).click();
		Thread.sleep(1000);
	}
	
	public void cancelbookingofaHotel() throws InterruptedException {
		driver.findElement(By.linkText("Booked Itinerary")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("btn_id_452278")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
	}
	
	
	public void ForgotPassword() throws InterruptedException {
		driver.findElement(By.partialLinkText("Forgot Password?")).click();
		driver.findElement(By.id("emailadd_recovery")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		Thread.sleep(6000);
		driver.findElement(By.linkText("Click here to login")).click();
	}
	
	public void logout() throws InterruptedException {
		driver.findElement(By.partialLinkText("Logout")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Click here to login again")).click();
		Thread.sleep(2000);
	}
	
	//-------------------------------------Methods----------------------------------------------------//
}