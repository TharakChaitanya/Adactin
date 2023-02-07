package adactin;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {
public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcred\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
		JavascriptExecutor js= (JavascriptExecutor)driver;
		driver.get("https://www.flipkart.com/");
		js.executeScript("window.scrollBy(0,1000");
	}

}
