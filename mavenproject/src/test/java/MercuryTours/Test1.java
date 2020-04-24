package MercuryTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
	  
	  WebElement radio = driver.findElement(By.xpath("//input[@value='oneway']"));
	  
			radio.click();  
			  WebElement conti = driver.findElement(By.xpath("//input[@name='findFlights']")); 
			  conti.click();
			  Thread.sleep(2000);
			  System.out.println("clicked on continue");
  }
	  
  
}
