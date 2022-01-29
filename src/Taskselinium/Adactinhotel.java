package Taskselinium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactinhotel {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\gnive\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		
		   WebDriver driver =  new ChromeDriver();
		   
		  driver.get("https://adactinhotelapp.com/");
		  
		  WebElement newuserregister = driver.findElement(By.xpath("//a[text()='New User Register Here']"));
		  newuserregister.click();
				  
		  WebElement un = driver.findElement(By.id("username"));
		  un.sendKeys("gnivetha");
          
		  WebElement pw = driver.findElement(By.id("password"));
		  pw.sendKeys("789456123");
		  
		  WebElement re_pw = driver.findElement(By.id("re_password"));
		  re_pw.sendKeys("789456123");
		  
		  WebElement fullname = driver.findElement(By.id("full_name"));
		  fullname.sendKeys("Nivethaganesan");
		  
		  WebElement email_add = driver.findElement(By.id("email_add"));
		  email_add.sendKeys("gnive123@gmail.com");
		  
		  Thread.sleep(3000); 
		  
		  WebElement captcha = driver.findElement(By.id("captcha-form"));
		  captcha.click();
		  
		  Thread.sleep(3000);
		 
		  Scanner sca = new Scanner (System.in);
		  System.out.println("Enter The Captcha Value: ");
		  String captchavalue = sca.nextLine();
		  captcha.sendKeys(captchavalue);

		  WebElement checkbok = driver.findElement(By.id("tnc_box"));
		  checkbok.click(); 
		  
		  WebElement Submit = driver.findElement(By.id("Submit"));
		  Submit.click();
		  
		  WebElement linktoclicklogin = driver.findElement(By.xpath("//a[text()='Click here to login']"));
		  linktoclicklogin.click();
		  
		  Thread.sleep(3000);
		  
		  WebElement username = driver.findElement(By.id("username"));
		  username.sendKeys("Nivetha");
		  
		  WebElement password = driver.findElement(By.id("password"));
		  password.sendKeys("789456123");
		  
		  WebElement login = driver.findElement(By.id("login"));
		  login.click();		  
		  
		
		  
		  
		  

				
	}

}
