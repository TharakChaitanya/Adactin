package adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class jenkindemo {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcred\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
	  driver = new ChromeDriver();

	 driver.navigate().to("https://adactinhotelapp.com/index.php");
	 driver.findElement(By.id("username")).sendKeys("Tharakreddy");
	  driver.findElement(By.name("password")).sendKeys("121212");
driver.findElement(By.name("login")).click();
	 Thread.sleep(1000);
   System.out.println("Login Successful");
   }
  }

