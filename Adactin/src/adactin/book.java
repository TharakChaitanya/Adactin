package adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

//public class book extends loginpage {
class book {
	
	

public static void main(String args[]) throws InterruptedException {
 loginpage loginn= new loginpage();
searching search = new searching();
loginn.beforeMethod();
 loginn.login();
 loginn.Searchhotel();
 loginn.bookkk();
 //search.Searchhotel();

	}}
