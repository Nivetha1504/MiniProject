package Taskselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Automationpractice {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\gnive\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		   
		  driver.get("http://automationpractice.com/index.php");
		  
		  WebElement log = driver.findElement(By.xpath("//a[@class='login']"));
		  log.click();
		  
		  WebElement email = driver.findElement(By.xpath("//input[@id='email_create']"));
		  email.sendKeys("gnive123@gmail.com");
		  
		 
		  
		  WebElement create = driver.findElement(By.xpath("//i[@class='icon-user left']"));
		  create.click();
		  
        WebElement gender2 = driver.findElement(By.id("id_gender2"));
		gender2.click();
		System.out.println(gender2.isSelected());
		  
		  WebElement firstname = driver.findElement(By.xpath("//input[@id='firstname']"));
		  firstname.sendKeys("firstname");
		  
		  WebElement lastname = driver.findElement(By.xpath("//input[@id='lastname']"));
		  lastname.sendKeys("lastname");
		  
		  
		  
		  
		  
		  

	}

}
