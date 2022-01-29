package Taskselinium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiniProject {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\gnive\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		   
		  driver.get("http://automationpractice.com/index.php");
		  
		Thread.sleep(3000);
		
		WebElement tshirt = driver.findElement(By.xpath("//a[@title='T-shirts'])[2]"));
		tshirt.click();
		

	}

}
