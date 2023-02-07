package adactin;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class loginpage {
	WebDriver driver;
	
  @Test
  
	  public void login() throws InterruptedException {
		  	driver.findElement(By.id("username")).sendKeys("Tharakreddy");
			  driver.findElement(By.name("password")).sendKeys("121212");
		driver.findElement(By.name("login")).click();
			 Thread.sleep(1000);
		    System.out.println("Login Successful");}
  @Test
  public void Searchhotel()  throws InterruptedException {
	  new Select(driver.findElement(By.name("location"))).selectByVisibleText("London");
		 Thread.sleep(1000);
		 new Select(driver.findElement(By.name("hotels"))).selectByVisibleText("Hotel Sunshine");
		 Thread.sleep(1000);
		 new Select(driver.findElement(By.name("room_type"))).selectByVisibleText("Double");
		 Thread.sleep(1000);
			driver.findElement(By.id("datepick_out")).clear();
			driver.findElement(By.id("datepick_out")).sendKeys("31/11/2022");
		 Thread.sleep(1000);
		 new Select(driver.findElement(By.name("adult_room"))).selectByVisibleText("2 - Two");
		 Thread.sleep(1000);
		 driver.findElement(By.name("Submit")).click();
		 
		 System.out.println("Search hotel successful"); 
driver.findElement(By.id("radiobutton_0")).click();
driver.findElement(By.id("continue")).click();


}
  @Test
  public void bookkk() throws InterruptedException {
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
	  driver.close();}
  @BeforeMethod
  public void beforeMethod() {

		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcred\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		  driver = new ChromeDriver();

		 driver.navigate().to("https://adactinhotelapp.com/index.php");
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
