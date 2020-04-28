package MercuryTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test1 {
	
	public WebDriver driver;
  @Test
  public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\Keerthi\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.newtours.demoaut.com/");
        
        Thread.sleep(5000);
        
        driver.manage().window().maximize();
//Login
        WebElement username = driver.findElement(By.xpath("//input[@name='userName']"));
        username.sendKeys("testing");
        WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
        pwd.sendKeys("testing");
        WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
        login.click();
        Thread.sleep(2000);
         System.out.println("Logged in");

      }
  
  @AfterTest
  public void radiobutton() throws InterruptedException {
//page 2, Flightfinder
	  
	          WebElement radio = driver.findElement(By.xpath("//input[@value='oneway']"));
	          radio.click();  
					  
			  WebElement passengers = driver.findElement(By.xpath("//select[@name='passCount']"));
			  Select select_passengers = new Select(passengers);
			  select_passengers.selectByValue("3");
			  						  
			  WebElement fromport = driver.findElement(By.xpath("//select[@name='fromPort']"));
			  Select select_fromport = new Select(fromport);
			  select_fromport.selectByValue("New York");
			  
			  WebElement fromMonth = driver.findElement(By.xpath("//select[@name='fromMonth']"));
			  Select select_fromMonth = new Select(fromMonth);
			  select_fromMonth.selectByValue("5");
			  
			  WebElement fromDay = driver.findElement(By.xpath("//select[@name='fromDay']"));
			  Select select_fromDay = new Select(fromDay);
			  select_fromDay.selectByValue("15");
			  
			  WebElement servclass = driver.findElement(By.xpath("//input[(@name='servClass') and (@value='Business')]"));
			  servclass.click();
			 
			  WebElement airline = driver.findElement(By.xpath("//select[@name='airline']"));
			  Select select_airline = new Select(airline);
			  select_airline.selectByIndex(2);
		
			  WebElement conti = driver.findElement(By.xpath("//input[@name='findFlights']")); 
			  conti.click();
			  Thread.sleep(2000);
			  System.out.println("clicked on continue in page 2");
			  
 //page 3, SelectFlight
			  WebElement flight = driver.findElement(By.xpath("//input[(@name='outFlight') and (@value='Blue Skies Airlines$361$271$7:10')]"));
			  flight.click();
			  
			  WebElement conti1 = driver.findElement(By.xpath("//input[@name='reserveFlights']")); 
			  conti1.click();
			  Thread.sleep(2000);
			  System.out.println("clicked on continue in page 3");
			  
 //page 4, BookaFlight
			  WebElement pass1_first = driver.findElement(By.xpath("//input[@name='passFirst0']"));
			  pass1_first.sendKeys("Keerthi");
			  
			  WebElement pass1_last = driver.findElement(By.xpath("//input[@name='passLast0']"));
			  pass1_last.sendKeys("Priya");
			  
			  WebElement pass2_first = driver.findElement(By.xpath("//input[@name='passFirst1']"));
			  pass2_first.sendKeys("Kiran");
			  
			  WebElement pass2_last = driver.findElement(By.xpath("//input[@name='passLast1']"));
			  pass2_last.sendKeys("Kumar");
			  
			  WebElement pass3_first = driver.findElement(By.xpath("//input[@name='passFirst2']"));
			  pass3_first.sendKeys("iam");
			  
			  WebElement pass3_last = driver.findElement(By.xpath("//input[@name='passLast2']"));
			  pass3_last.sendKeys("third");
			  			  
			  WebElement c_num = driver.findElement(By.xpath("//input[@name='creditnumber']"));
			  c_num.sendKeys("1213456789");
			  
			  WebElement secure_purchase = driver.findElement(By.xpath("//input[@name='buyFlights']"));
			  secure_purchase.click();
			  
  }
  
	  
  
}
