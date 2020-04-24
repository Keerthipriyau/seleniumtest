package maven.mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class AssetExample {
@Test
    
 
    
    
    public void mmt_Login_Page( ) throws InterruptedException
    
    {
        
        
        
        
	System.setProperty("webdriver.chrome.driver", "C://Users/admin/Downloads/Keerthi/chromedriver_win32/chromedriver.exe");
    
	WebDriver driver = new ChromeDriver();
        
        
        
 

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        Thread.sleep(2000);
 

        // get command
 

        //driver.get("https://www.makemytrip.com/");
 
        // navigate command 
 
        driver.navigate().to("https://www.makemytrip.com/");
 
        // refresh method of navigate
 
        driver.navigate().refresh();
        
    
 
        driver.manage().window().maximize();
 
        // getTitle command 
        
        String title_Expected="akeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";
 
        String title = driver.getTitle();
        
        // Soft Asset
        
         SoftAssert softassert=new SoftAssert();
         
         // Hard Assert
         
       // Assert.assertEquals(title, title_Expected);
         
         softassert.assertEquals(title, title_Expected);
         
         
        
        System.out.println("Assertions is passing");
 
        System.out.println("Title" + title);
 
        // getCurrent URL
 
        String Current_url=driver.getCurrentUrl();
 
        System.out.println("Current URL "+ Current_url);    
        
        
        softassert.assertAll();
        
        
        
        
    }
 
}