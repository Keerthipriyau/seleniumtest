package maven.mavenproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

public class DemoAler {
	public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {                                                                                                                                     

        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\Keerthi\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();





// Alert Message handling

                     

driver.get("http://demo.guru99.com/test/delete_customer.php");                                 

                    

     

driver.findElement(By.name("cusid")).sendKeys("53920");                                                                  

driver.findElement(By.name("submit")).submit();                                   

      

// Switching to Alert       

Alert alert = driver.switchTo().alert();                            

      

// Capturing alert message.   

String alertMessage= driver.switchTo().alert().getText();                      

      

// Displaying alert message               

System.out.println(alertMessage); 

Thread.sleep(5000);

      

// Accepting alert                   
alert.accept();

//alert.dismiss();
System.out.println("Alert Completed");
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


	
