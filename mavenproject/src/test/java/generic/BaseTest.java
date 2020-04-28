package generic;



import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;




public abstract class BaseTest implements AUTOCONST {

	public static WebDriver driver;



	@BeforeMethod
	public void preCondition() {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
}
	
	// this is the place of adding method for screenshot 

	 @AfterMethod //AfterMethod annotation - This method executes after every test execution
	 public void screenShot(ITestResult result){
	 //using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
	 if(ITestResult.FAILURE==result.getStatus()){
	 try{
	 // To create reference of TakesScreenshot
	 TakesScreenshot screenshot=(TakesScreenshot)driver;
	 // Call method to capture screenshot
	 File src=screenshot.getScreenshotAs(OutputType.FILE);
	 // Copy files to specific location 
	 // result.getName() will return name of test case so that screenshot name will be same as test case name
	 FileUtils.copyFile(src, new File("C:\\Users\\admin\\Downloads\\Keerthi\\"+result.getName()+".png"));
	 System.out.println("Successfully captured a screenshot");
	 }catch (Exception e){
	 System.out.println("Exception while taking screenshot "+e.getMessage());
	 } 
	 }
	 driver.quit();
	 }
		 
		
		}
		
	
