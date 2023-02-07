package adactin;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Adactintestng {
	WebDriver driver;
	
  @Test(priority=1)
  public void newregistration() throws InterruptedException {
	  driver.findElement(By.partialLinkText("New User Register")).click();
		 driver.findElement(By.name("username")).sendKeys("Tharakreddy");
		 driver.findElement(By.name("password")).sendKeys("121212");
		 driver.findElement(By.name("re_password")).sendKeys("121212");
		 driver.findElement(By.name("full_name")).sendKeys("Tharakreddy");
		 driver.findElement(By.name("email_add")).sendKeys("tharakchaitanya112@gmail.com");
		 driver.findElement(By.id("tnc_box")).click();
		 System.out.println("New User Registration successful");
		 driver.findElement(By.xpath("//*[@id=\"register_form\"]/table/tbody/tr[1]/td/table/tbody/tr/td[2]/a")).click();
		 //driver.findElement(By.name("submit")).click();
		 Thread.sleep(2000);}
    
  @Test(priority=2, dependsOnMethods="newregistration")
  	public void login() throws InterruptedException {
  	driver.findElement(By.id("username")).sendKeys("Tharakreddy");
	  driver.findElement(By.name("password")).sendKeys("121212");
driver.findElement(By.name("login")).click();
	 Thread.sleep(1000);
    System.out.println("Login Successful");}
  
  @Test(priority=3, dependsOnMethods="login")
  public void Searchhotel() throws InterruptedException {
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
		 
		 System.out.println("Search hotel successful");  
  }
  @Test(dependsOnMethods="Searchhotel")
  public void selecthotel() throws InterruptedException {
  driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/input[1]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.name("continue")).click();
	 System.out.println("Select hotel successful");}
  
  @Test(dependsOnMethods="selecthotel")
  void bookhotel() throws InterruptedException {
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
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcred\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	  driver = new ChromeDriver();

	 driver.navigate().to("https://adactinhotelapp.com/index.php");
  }

  @AfterClass
  public void afterClass() {
	  //driver.close();
  }

}
