package maven.mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterTest {
	@Test
    @Parameters({ "browser" })
    public void launch_Browser(String browser) throws Exception
{
   
        WebDriver driver;
       
        if (browser.equalsIgnoreCase("chrome"))
        {
   
        	 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\Keerthi\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(" https://www.spicejet.com/");
        System.out.println("Browser name"+ browser );
        }
       
        else if(browser.equalsIgnoreCase("ie"))
           
        {
           
       
            System.setProperty("webdriver.ie.driver", "C:\\Users\\admin\\Downloads\\Keerthi\\IEDriverServer_x64_3.150.1//IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            driver.get(" https://www.spicejet.com/");
            System.out.println("Browser name"+ browser );
            }   
       
       
        else{
       
            throw new Exception("Browser is not correct");
            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }
}