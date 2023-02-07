package adactin;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Dataprovider {
 WebDriver driver;
	@Test(dataProvider = "dp")
 // public void f(Integer n, String s) {
 // }

  @DataProvider(name="newuser")
  public Object[][] Newregistration() {
    return new Object[][] {{"tharak", "123321", "123321", "Tharakchaitanya", "tharakchai112@gmail.com"}};
    }
  

    
  @Test(dataProvider="newuser")
  public void newuser(String name, String pwd, String cpwd, String fullname, String mail) throws Exception
  {
	  driver.findElement(By.partialLinkText("New User Register")).click();
	  driver.findElement(By.name("username")).sendKeys(name);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  //driver.findElement(By.name)
		 driver.findElement(By.name("re_password")).sendKeys(cpwd);
		 driver.findElement(By.name("full_name")).sendKeys(fullname);
		 driver.findElement(By.name("email_add")).sendKeys(mail);
		 driver.navigate().back();}
  @Test(priority=1, dataProvider="login")
  public void login(String user, String pwd) throws Exception
  {
	  driver.findElement(By.name("username")).sendKeys(user);
 driver.findElement(By.name("password")).sendKeys(pwd);
 driver.findElement(By.name("login")).click();
 
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vcred\\\\Downloads\\\\chromedriver_win32 (5)\\\\chromedriver.exe");
	  driver = new ChromeDriver();

	 driver.navigate().to("https://adactinhotelapp.com/index.php");
  }
 
  @AfterClass
  public void afterClass() {
  }

}
