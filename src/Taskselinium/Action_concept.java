package Taskselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_concept {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\gnive\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		   
		  driver.get("https://demoqa.com/buttons");
		  Thread.sleep(3000);
		  
		WebElement button1 = driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		WebElement button2 = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
		
		WebElement button3 = driver.findElement(By.xpath("//button[text()= 'Double Click Me']"));
		Actions act= new Actions(driver);
		act.click(button1).build().perform();
		act.doubleClick(button3).build().perform();
		act.contextClick(button2).build().perform();
		
		
		
		
		  
	}

}
