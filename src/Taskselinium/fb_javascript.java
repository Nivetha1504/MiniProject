package Taskselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb_javascript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\gnive\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		   
		  driver.get("https://www.facebook.com/");

		  JavascriptExecutor js = (JavascriptExecutor) driver; 
		  
		  WebElement mail = driver.findElement(By.xpath("//input[@id='email']"));
		  js.executeScript("document.getElementByID('email').value='gnive123@gmail.com';");
		  js.executeScript("document.getElementByID('pass').value='12345678';");
		  
		  
	}

}
