package Taskselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
   
	
	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\gnive\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	       
	  WebDriver driver =  new ChromeDriver();
		   
	  driver.get("https://www.instagram.com/");
	  Thread.sleep(3000);
		
	  WebElement Username = driver.findElement(By.name("username"));
	  Username.sendKeys("gnivetha15@gmail.com");

	  WebElement Password = driver.findElement(By.name("password"));
	  Password.sendKeys("123456789");
	  
	  WebElement Log= driver.findElement(By.xpath("//div[text()='Log In']"));
	  Log.click();
	}

}
