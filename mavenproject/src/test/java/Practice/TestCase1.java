package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1  {
	
    public String baseUrl= "http://www.google.com/";


@Test
public void verifyHomePageTitle() {
	WebDriver driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\Keerthi\\chromedriver_win32\\chromedriver.exe");
   

driver.get(baseUrl);

    

        WebElement element = driver.findElement(By.name("q"));


        element.sendKeys("watch!");


        element.submit();

        // Check the title of the page

        System.out.println("Page title is: " + driver.getTitle());

        driver.quit();

    }

}

 