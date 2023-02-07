package lk;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class login  {
	public WebDriver driver;
	String url= "https://adactinhotelapp.com/index.php";
	@BeforeTest
	  public void openbrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcred\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  Thread.sleep(2000);
	  }
  @Test
  public void login() throws InterruptedException {
	
	 
	  driver.get(url);
	  driver.findElement(By.id("username")).sendKeys("Tharakreddy");
	  driver.findElement(By.name("password")).sendKeys("121212");
  driver.findElement(By.name("login")).click();
	 Thread.sleep(1000);
      System.out.println("Login Successful");
	 
	 new Select(driver.findElement(By.name("location"))).selectByVisibleText("London");
	 Thread.sleep(1000);
	 new Select(driver.findElement(By.name("hotels"))).selectByVisibleText("Hotel Sunshine");
	 Thread.sleep(1000);
	 new Select(driver.findElement(By.name("room_type"))).selectByVisibleText("Double");
	 Thread.sleep(1000);
		driver.findElement(By.id("datepick_out")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys("31/12/2021");
	 Thread.sleep(1000);
	 new Select(driver.findElement(By.name("adult_room"))).selectByVisibleText("2 - Two");
	 Thread.sleep(1000);
	 driver.findElement(By.name("Submit")).click();
	 System.out.println("Search hotel successful");

	  //driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")).click();
	  
	 // driver.findElement(By.id(""))
	 // Assert.assertEquals(driver.getTitle(), "OrangeHRRM");
  }
  

  @AfterTest
  public void afterTest() {
  }

}

