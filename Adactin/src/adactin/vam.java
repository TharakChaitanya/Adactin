package adactin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class vam {

	public static void main(String[] args)  throws InterruptedException{
		
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Crazy Person\\Downloads\\chromedriver_win32\\chromedriver.exe");
		Thread.sleep(1000);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/index.php");
		Thread.sleep(5000);
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("Vamsee20");
		WebElement password=driver.findElement(By.id("password"));
		WebElement login=driver.findElement(By.name("login"));

		password.sendKeys("Vamsee@2020");
		login.click();
		}
		}

	