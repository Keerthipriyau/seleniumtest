package maven.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandlingDropdown {
    
 
 
    @Test
    public void selectOption() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\Keerthi\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        
        // select by visible text
        
        //select.selectByVisibleText("Option 1");
        
        // select by visible value 
        
        //select.selectByValue("2");
        
        // select by Index 
        
        select.selectByIndex(2);
        
        Thread.sleep(5000);
        
        // Need to use when their are multiple select in a dropdown
        
        //select.deselectByIndex(2);
        
        
        
        
    }
}
