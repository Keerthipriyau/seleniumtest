package maven.mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
//Keerthi NOTES: This is Implicit wait
public class FluentWait {
	public static void main(String[] args) throws InterruptedException 
	{    
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\Keerthi\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
			
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    String eTitle = "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";
    String aTitle = "" ;
    // launch Chrome and redirect it to the Base URL
    driver.get("https://www.makemytrip.com/" );
    //Maximizes the browser window
    driver.manage().window().maximize() ;
    //get the actual value of the title
    aTitle = driver.getTitle();
    //compare the actual title with the expected title
    if (aTitle.equals(eTitle))
    {
    System.out.println( "Test Passed") ;
    }
    else {
    System.out.println( "Test Failed" );
    }
    //close browser
    driver.close();
}
}

