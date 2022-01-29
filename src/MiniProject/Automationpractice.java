package MiniProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automationpractice {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\gnive\\\\eclipse-workspace\\\\Selenium\\\\Driver\\\\chromedriver.exe");
		
		   WebDriver driver =  new ChromeDriver();
		   
		  driver.get("http://automationpractice.com/index.php");
		  
		  WebElement title = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
		  title.click();
		  
		  WebElement dress = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		  dress.click();
		  WebElement size = driver.findElement(By.id("group_1"));
		  Select controlt = new Select (size);
		  controlt.selectByValue("3");
		  
		  WebElement submit = driver.findElement(By.name("Submit"));
		  submit.click();
		  
		  Thread.sleep(3000);
		  
		  WebElement Ptc = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		  Ptc.click();
		  
		  WebElement PtC1 = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
		  PtC1.click();
		  
		  Thread.sleep(3000);
			  
			  WebElement email = driver.findElement(By.xpath("//input[@id='email_create']"));
			  email.sendKeys("1nive123@gmail.com");
			  
			 
			  WebElement create = driver.findElement(By.xpath("//i[@class='icon-user left']"));
			  create.click();
			  
			  
			  Thread.sleep(3000);
			  WebElement firstname = driver.findElement(By.id("customer_firstname"));
			  firstname.sendKeys("Nivetha");
			  
			  WebElement lastname = driver.findElement(By.id("customer_lastname"));
			  lastname.sendKeys("Ganesan");
	
			  WebElement pwd = driver.findElement(By.id("passwd"));
			  pwd.sendKeys("789456123");
			  
			  WebElement radio = driver.findElement(By.id("uniform-id_gender2"));
			  radio.click();
			
			  WebElement day= driver.findElement(By.id("days"));
			  Select select = new Select (day);
			  select.selectByValue("15");
			  
			  WebElement month = driver.findElement(By.id("months"));
			  Select sel = new Select (month);
			  sel.selectByValue("4");
			  
			  WebElement year = driver.findElement(By.id("years"));
			  Select sel1 = new Select (year);
			  sel1.selectByValue("1998");
			  
			  WebElement nil = driver.findElement(By.id("newsletter"));
			  nil.click();
			  
			  WebElement opt = driver.findElement(By.id("optin"));
			  opt.click();
			  
			  WebElement com = driver.findElement(By.name("company"));
			  com.sendKeys("vgk");
			  
			  WebElement add1 = driver.findElement(By.name("address1"));
			  add1.sendKeys("L-331");
			  
			  WebElement add2 = driver.findElement(By.name("address2"));
			  add2.sendKeys("EVN");
			  
			  WebElement city = driver.findElement(By.name("city"));
			  city.sendKeys("Erode");
			  
			  WebElement state = driver.findElement(By.id("id_state"));
			  Select sta = new Select (state);
			  sta.selectByValue("10");
			  
			  WebElement post = driver.findElement(By.name("postcode"));
			  post.sendKeys("63800");
			  
			  WebElement country = driver.findElement(By.id("id_country"));
			  Select coun = new Select (country);
			  coun.selectByValue("21");
			  
			  WebElement info = driver.findElement(By.name("other"));
			  info.sendKeys("collection");
			  
			  WebElement phone = driver.findElement(By.name("phone"));
			  phone.sendKeys("987 451 2365");
			  
			  WebElement mp = driver.findElement(By.name("phone_mobile"));
			  mp.sendKeys("7894561234");
			  
			  Thread.sleep(3000);
			  WebElement acc = driver.findElement(By.name("submitAccount"));
			  acc.click();
			  
			  WebElement pc2 = driver.findElement(By.name("processAddress"));
			  pc2.click();
			  
			  WebElement cb = driver.findElement(By.id("cgv"));
			  cb.click();
			  
			  WebElement pc3 = driver.findElement(By.name("processCarrier"));
			  pc3.click();
			  
			  
			 }

}
