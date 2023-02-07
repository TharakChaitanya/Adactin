package adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modularadctin {

	
		public static WebDriver driver;
		
		public void url() {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcred\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
			  driver = new ChromeDriver();

			 driver.navigate().to("https://adactinhotelapp.com/index.php");}
	//New User Registration
			public void registration() throws InterruptedException { 
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
			}
	

public static void main(String[] args) throws InterruptedException {
	Modularadctin obj= new Modularadctin();
	obj.url();
	obj.registration();
	
}
}