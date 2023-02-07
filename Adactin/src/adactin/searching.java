package adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class searching {
	WebDriver driver;
	
	 public void Searchhotel()  throws InterruptedException {
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
}
