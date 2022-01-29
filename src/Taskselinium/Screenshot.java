package Taskselinium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gnive\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	       
		  WebDriver driver =  new ChromeDriver();
			   
		  driver.get("https://www.instagram.com/");
		  
			
		  WebElement Username = driver.findElement(By.name("username"));
		  Username.sendKeys("gnivetha15@gmail.com");

		  WebElement Password = driver.findElement(By.name("password"));
		  Password.sendKeys("123456789");
		  
		  WebElement Log= driver.findElement(By.xpath("//div[text()='Log In']"));
		  Log.click();
		  Thread.sleep(3000);
		  TakesScreenshot scr = (TakesScreenshot) driver;
		 
		  
		  File src = scr.getScreenshotAs(OutputType.FILE);
		  
		  File dest = new File("C:\\Users\\gnive\\eclipse-workspace\\class selenium task\\snap.png");
		  
		  FileUtils.copyFile(src, dest);
		  
		}

	           

	}
