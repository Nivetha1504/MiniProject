package Taskselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\gnive\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		   
		  driver.get("https://www.facebook.com/");
		  Thread.sleep(3000);
		 
		  WebElement firstname = driver.findElement(By.xpath("input[name='firstname']"));
		  firstname.sendKeys("Nivetha");
		  WebElement lastname = driver.findElement(By.xpath("input[name='lastname']']"));
		  lastname.sendKeys("ganesan");
		  WebElement reg_email__= driver.findElement(By.xpath("input[name='reg_email__']"));
		  reg_email__.sendKeys("gnivetha15@gmail.com");
		  WebElement password = driver.findElement(By.xpath("input[data-type='password']"));
		  password.sendKeys("password");
		  

	}

}
