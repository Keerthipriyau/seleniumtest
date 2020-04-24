package maven.mavenproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

public class AlertExample_Exercise1 {
	public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {                                                                                                                                     

        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\Keerthi\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();





// Alert Message handling

                     

driver.get("https://the-internet.herokuapp.com/javascript_alerts");                                 

                    
WebElement JSAlert = driver.findElements(By.xpath("//Button[contains(@onclick,'jsAlert()')]")
     
JSAlert.click();


Alert alert1 = driver.switchTo().alert();
String alertMessage1= driver.switchTo().alert1().getText(); 
System.out.println(alertMessage1); 
//Accepting alert                   
alert1.accept();

//alert.dismiss();
System.out.println("Alert1 Completed");

Thread.sleep(5000);
//driver.findElement(By.name("cusid")).sendKeys("53920");                                                                  

//driver.findElement(By.name("submit")).submit();                                   

      

// Switching to Alert       

                            

      

// Capturing alert message.   
                     

      

// Displaying alert message               



      


/* Keerthi Notes:
 * Alert is a pop up we receive from the browser,
 * getText [gets the text of the popup],
 * accept() [Clicks on Ok or continue in the popup], 
 * dismiss() [clicks on cancel, negative button in the popup], 
 * sendKeys() [sends text in the popup])
 * 
 */

}  
}


	
