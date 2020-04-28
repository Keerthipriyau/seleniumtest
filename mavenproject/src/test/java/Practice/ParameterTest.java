package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParameterTest {
	@Test
    @Parameters("myName")
  public void ptest(String myName) throws Exception {
		System.out.println("Parameterized value is : " + myName);
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\Keerthi\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://www.google.com/");
		
	  WebElement searchbox = driver.findElement(By.xpath("//input[@name='q']"));
searchbox.sendKeys(myName);
System.out.println("First parameter entered");
Thread.sleep(2000);
WebElement SButton = driver.findElement(By.xpath("//input[@value='Google Search']"));
SButton.click();
System.out.println("First parameter search");
}
}
