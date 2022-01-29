package Taskselinium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toolsqa {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\gnive\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		   
		  driver.get("http://greenstechnologys.com/");
		 JavascriptExecutor js = (JavascriptExecutor) driver; 
		  //scroll down
		  js.executeScript("window.scrollBy(0,9000);");
		  Thread.sleep(3000);
		  js.executeScript("window.scrollBy(0,-3000);");
		  
	}

}
