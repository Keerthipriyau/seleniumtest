package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ElementLoad {
  @Test
  public void est() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\Keerthi\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://www.google.com/");
	  
	  
	  EventFiringWebDriver eventDriver = new EventFiringWebDriver(browser).register(new AbstractWebDriverEventListener() {

		  @Override
		  public void onException(Throwable throwable, WebDriver browser) {

		    // Take the screenshot using the Webdriver.
		    File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		    // Now you can copy the screenshot somewhere on your system.
		    FileUtils.copyFile(screen, new File("c:\Selenium Testing Questions\screen.png"));
		  }
		});

		try {

		  eventDriver.findElement(By.id("test"));
		  fail("Caught the Expected exception."); // Intentionally causing the exception for demo.

		} catch (NoSuchElementException e) {

		  // Triggering point for the <onException> event.
		}
	  
	  
	  WebDriverWait wait = new WebDriverWait(driver, 100);
	  //check.until(ExpectedConditions.presenceOfElementLocated((By.name("userName"))));
	 // System.out.println("Page loaded");
	  WebElement box = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
	  box.click();
	  System.out.println("Page loaded");
	  
	  
	  //guru99seleniumlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
	 // guru99seleniumlink.click();
  }
}
