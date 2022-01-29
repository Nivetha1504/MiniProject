package Taskselinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		 
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\gnive\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
			
			WebDriver driver =  new ChromeDriver();
			   
			  driver.get("http://www.leafground.com/pages/Dropdown.html");
			  Thread.sleep(3000);
			  
			  driver.get("http://www.leafground.com/pages/Dropdown.html");
				 WebElement index = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		        
				  Select s=new Select(index);
				  s.selectByIndex(1);
				  
				  WebElement text= driver.findElement(By.xpath("//select[@name='dropdown2']"));
		         
				  Select s1=new Select(text);
				  s1.selectByVisibleText("Appium");
				  
				  WebElement value= driver.findElement(By.xpath("//select[@id='dropdown3']"));
			         
				  Select s2=new Select(value);
				  s2.selectByValue("1");
				  
				  WebElement number = driver.findElement(By.xpath("//select[@class='dropdown']"));
				  Select s3=new Select(number);
				  List<WebElement> Get=s3.getOptions();
				  for(WebElement drop:Get) {
					  System.out.println(drop.getText());
				  }
				  
				  WebElement s4 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/select"));
				  s4.sendKeys("Appium");
				 
				  WebElement send = driver.findElement(By.xpath("//select[@multiple='']"));
				  Select s5=new Select(send);
				  s5.selectByValue("1");
				  s5.selectByValue("2");
				  boolean mul = s5.isMultiple();
				  System.out.println(mul);
				  
				  WebElement op4 = s.getFirstSelectedOption();
				  System.out.println(op4.getText());
				  }
				  
				  
	}


