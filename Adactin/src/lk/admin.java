package lk;

import org.testng.annotations.Test;

import lk.login;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class admin extends login {
	
	
	  @Test
	  public void admin() throws InterruptedException {
		  
		 // driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b")).click();
		  Thread.sleep(6000);
		  driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")).click();
			 
	  }
	  @Test
	  public void log() {
		  driver.findElement(By.linkText("Booked Itinerary")).click();
	  }
	}
  