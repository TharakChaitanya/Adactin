package adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class spice {

	
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcred\\Downloads\\chromedriver_win32 (10)\\chromedriver.exe");
		  driver = new ChromeDriver();

		 driver.navigate().to("https://www.spicejet.com/");
		 driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div/div[1]/div[2]/div[1]")).click();
		 //
		 
}}
