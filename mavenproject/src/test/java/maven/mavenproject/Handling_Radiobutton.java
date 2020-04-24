package maven.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handling_Radiobutton {
	    
	WebDriver driver;


	    @Test
	    public void selectradiobutton() throws InterruptedException {
	        
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\Keerthi\\chromedriver_win32\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("http://www.echoecho.com/htmlforms10.htm");
	        
	        Thread.sleep(5000);
	        
	        driver.manage().window().maximize();
	        
	        
	        WebElement radiobutton1 = driver.findElement(By.xpath("//input[@name='radio1'][1]"));
	        Thread.sleep(2000);
             System.out.println("1 selected");

	        radiobutton1.click();
	        
	    
	    }
	}
	 




