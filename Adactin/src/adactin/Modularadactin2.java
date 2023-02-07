package adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modularadactin2 {
WebDriver driver;
	
		// TODO Auto-generated method stub
		public void url() {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcred\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
			  driver = new ChromeDriver();

			 driver.navigate().to("https://adactinhotelapp.com/index.php");
	//Login
		driver.findElement(By.id("username")).sendKeys("Tharakreddy");
		driver.findElement(By.name("password")).sendKeys("121212");
		driver.findElement(By.name("login")).click();
}}

