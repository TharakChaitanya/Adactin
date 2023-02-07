package adactin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class adactinautomation {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
	
		  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vcred\\\\Downloads\\\\chromedriver_win32 (6)\\\\chromedriver.exe");
		  driver = new ChromeDriver();

		 driver.navigate().to("https://adactinhotelapp.com/index.php");
//New User Registration
		 
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
		 Thread.sleep(2000);

		 
//Forgotpassword link
		 
		 driver.findElement(By.partialLinkText("Forgot Password?")).click();
		 driver.findElement(By.name("emailadd_recovery")).sendKeys("tharakchaitanya112");
		 //driver.findElement(By.name("submit")).click();
		 System.out.println("Forgot password successful");
		 Thread.sleep(2000);
		 driver.navigate().back();
		 Thread.sleep(2000);

//Login		 
		 
		 driver.findElement(By.id("username")).sendKeys("Tharakreddy");
		  driver.findElement(By.name("password")).sendKeys("121212");
	  driver.findElement(By.name("login")).click();
		 Thread.sleep(1000);
	      System.out.println("Login Successful");
		 
		 new Select(driver.findElement(By.id("location"))).selectByVisibleText("London");
		 Thread.sleep(1000);
		 new Select(driver.findElement(By.name("hotels"))).selectByVisibleText("Hotel Sunshine");
		 Thread.sleep(1000);
		 new Select(driver.findElement(By.name("room_type"))).selectByVisibleText("Double");
		 Thread.sleep(1000);
			driver.findElement(By.id("datepick_out")).clear();
			driver.findElement(By.id("datepick_out")).sendKeys("31/01/2022");
		 Thread.sleep(1000);
		 new Select(driver.findElement(By.name("adult_room"))).selectByVisibleText("2 - Two");
		 Thread.sleep(1000);
		 driver.findElement(By.name("Submit")).click();
		 System.out.println("Search hotel successful");
		 
//Select hotel		 
		 driver.findElement(By.name("radiobutton_0")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("continue")).click();
		 System.out.println("Select hotel successful");

//Book a hotel
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
		
		 
		 driver.findElement(By.partialLinkText("Logout")).click();
		 System.out.println("Logout successful");
 
		  Thread.sleep(3000);
		  driver.close();
	
	
	}

}
