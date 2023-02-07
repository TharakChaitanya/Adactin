package adactin;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screen {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcred\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		  driver = new ChromeDriver();

		 driver.navigate().to("https://adactinhotelapp.com/index.php");

		
	File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(f, new File("c\\Users\\vcred\\OneDrive\\Desktop\\SHHH.png"));
	//FileHandler.copy(scrFile, new File("c\\Users\\vcred\\OneDrive\\Desktop\\SHHH.png"));

	}}
