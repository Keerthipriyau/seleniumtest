package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

public class Gmail_Login {
/**
* @param args
*/
       public static void main(String[] args) {
              
// objects and variables instantiation
    	   System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\Keerthi\\chromedriver_win32\\chromedriver.exe");

           WebDriver driver = new ChromeDriver();

              String appUrl = "https://accounts.google.com";
              
// launch the firefox browser and open the application url
              driver.get(appUrl);
              
// maximize the browser window
              driver.manage().window().maximize();
              
// declare and initialize the variable to store the expected title of the webpage.
              String expectedTitle = "Sign in – Google accounts";
              
// fetch the title of the web page and save it into a string variable
              String actualTitle = driver.getTitle();
              
// compare the expected title of the page with the actual title of the page and print the result
              if (expectedTitle.equals(actualTitle))
              {
                     System.out.println("Verification Successful - The correct title is displayed on the web page.");
              }
             else
              {
                     System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
              }
 
// enter a valid username in the email textbox
              WebElement username = driver.findElement(By.xpath("//input[contains(@type,'email')]"));
              username.clear();
              username.sendKeys("TestSelenium");
              System.out.println("entered test");
              
              
              
              WebElement nextbtn1 = driver.findElement(By.xpath("//span[contains(@class,'RveJvd snByac')]"));
              nextbtn1.click();
            
// enter a valid password in the password textbox
              WebElement password = driver.findElement(By.xpath("//input[contains(@type,'password')]"));
              password.clear();
              password.sendKeys("password123");
              
              WebElement nextbtn2 = driver.findElement(By.xpath("//span[contains(@class,'RveJvd snByac')]"));
              nextbtn2.click();
              System.out.println("entered pwd");
// click on the Sign in button
              WebElement SignInButton = driver.findElement(By.id("signIn"));
              SignInButton.click();
              
// close the web browser
              driver.close();
              System.out.println("Test script executed successfully.");
              
// terminate the program
              System.exit(0);
       }
}