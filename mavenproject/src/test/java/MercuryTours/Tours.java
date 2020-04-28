package MercuryTours;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Tours {
	
	public static WebDriver driver;
 
	//Login page Objects
	public static WebElement o_user_name_txtbx;
	public static WebElement o_password_txtbx;
	public static WebElement o_login_btn;
	
	//Flight Details page Objects
	/*
	public static WebElement o_flightdetails_type_radio;
	public static WebElement o_num_pass_list;
	public static WebElement o_departing_from_list;
	public static WebElement o_departing_date_month_list;
	public static WebElement o_departing_date_date_list;
	public static WebElement o_arriving_in_list;
	public static WebElement o_returning_list;
	public static WebElement o_service_class_radio;
	public static WebElement o_airline_list;
	public static WebElement o_continue_btn;
	*/
	public static String s_pass_count;
	public static String s_departing_from_list;
	public static String s_returning_date_date_list;
	public static String s_departing_date_date_list;
	public static String s_arriving_in_list;
	public static String s_returning_date_month_list;
	public static String s_service_class_radio;
	public static String s_airline_list;
	
	
	
	public void AutoMercuryTours() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[]) throws InterruptedException{
		//Setting System property. If this is not set Webdriver can not invoke Chrome
		//ChromeDriver exe file location is to be set in Key: webdriver.chrome.driver
		System.setProperty("webdriver.chrome.driver", "E:\\_Educational\\SeleniumStuff\\SeleniumTrainingPrepStuff\\AT\\Selenium\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");		
		
		//Initialize chrome Driver
		driver = new ChromeDriver();
		
		//Navigate to URL. below statment can also be used for the same
		driver.navigate().to("http://newtours.demoaut.com/");
		//driver.get("http://newtours.demoaut.com/"); 'can also be used
		
		//Find Objects of Login Page
		o_user_name_txtbx = driver.findElement(By.name("userName"));
		o_password_txtbx = driver.findElement(By.name("password"));
		o_login_btn = driver.findElement(By.name("login"));
		driver.findElement(By.name("userName"));
		
		//Perform operations on Above Objects
		o_user_name_txtbx.sendKeys("mercury");
		o_password_txtbx.sendKeys("mercury");
		o_login_btn.click();
		
		//Sync
		Thread.sleep(5000);
		
		//**********Checkpoint to verify that page is loaded and user is logged in**********
		
		//Check text
		//boolean b_result = f_verify_text()
		 		
				//or
		
		//Check for any Object
		boolean b_result = f_verify_element_exists(driver.findElement(By.xpath("//img[@src = '/images/masts/mast_flightfinder.gif']")));
		if(b_result==true){
			System.out.println("Login is Successfull.");
		}else{
			System.out.println("Login Failed.");
		}
		
		//***************************Find All Elements of the Page*******************************************
		//find objects of Flight Finder Page after Login
		//o_flightdetails_type = driver.findElement(new ByChained(By.name("tripType"),By.tagName("input")));
		//not the right way to select values in list
		//o_num_pass_list = driver.findElement(By.xpath("//select[@name='passCount']/option[@value='3']"));
		
		//Clicking on Radio button in Flight type. Below is other way of selecting radio group
		WebElement o_flightdetails_type_radio = driver.findElement(By.xpath("//input[@name='tripType' and @value='oneway']"));
		
		//Correct way of Selecting values in Select. Gives you more control
		Select o_num_pass_list =  new Select(driver.findElement(By.name("passCount")));
		Select o_departing_from_list = new Select(driver.findElement(By.name("fromPort")));
		Select o_departing_date_month_list = new Select(driver.findElement(By.name("fromMonth")));
		Select o_departing_date_date_list = new Select(driver.findElement(By.name("fromDay")));
		Select o_arriving_in_list = new Select(driver.findElement(By.name("toPort")));
		Select o_returning_date_month_list = new Select(driver.findElement(By.name("toMonth")));
		Select o_returning_date_date_list = new Select(driver.findElement(By.name("toDay")));
		List <WebElement> o_service_class_radio = driver.findElements(By.name("servClass"));
		Select o_airline_list = new Select(driver.findElement(By.name("airline")));
		WebElement o_continue_btn = driver.findElement(By.name("findFlights"));
		
		//************Set Values to be entered in the webelements************************************************
		s_pass_count = "2";
		s_departing_from_list = "London";
		s_returning_date_date_list = "5";  // representing May as value of May is 5 in html
		s_departing_date_date_list = "7";
		s_arriving_in_list = "Portland";
		s_returning_date_month_list = "10"; // representing October as value of October is 10 in html
		s_returning_date_date_list = "10";
		s_service_class_radio = "First";
		s_airline_list = "Unified Airlines";
		
		//**************Perform operation based on the values mentioned above*************************************
		o_num_pass_list.selectByValue(s_pass_count);
		o_departing_from_list.selectByValue(s_departing_from_list);
		o_departing_date_month_list.selectByValue(s_returning_date_date_list);
		o_departing_date_date_list.selectByValue(s_departing_date_date_list);
		o_arriving_in_list.selectByValue(s_arriving_in_list);
		o_returning_date_month_list.selectByValue(s_returning_date_month_list);
		o_returning_date_date_list.selectByValue(s_returning_date_date_list);
		o_airline_list.selectByVisibleText(s_airline_list);
		
		//Select Business Class in Radio Group
		//Looping through all the element of the Radio Group
		for(int i=0;i<=o_service_class_radio.size();i++){
			if (o_service_class_radio.get(i).getAttribute("value")==s_service_class_radio){
				o_service_class_radio.get(i).click();
			}
		}
		
		//Click on continue Button
		o_continue_btn.click();
		
		//*** For Information purpose. Not part of the test***
		//Methods which can be applied over any WebElement Control. Few are restricted to specific type of control
		//below Example is for Radio Group
		System.out.println("Is Selected ? " + o_service_class_radio.get(1).isEnabled());
		System.out.println("Is Displayed ? " + o_service_class_radio.get(1).isDisplayed());
		System.out.println("Is Selected ? " + o_service_class_radio.get(1).isSelected());
		System.out.println("Get Attribute. Attribute Name : value. Attribute value: " + o_service_class_radio.get(1).getAttribute("value"));
		System.out.println("Get Css Value: " + o_service_class_radio.get(1).getCssValue("font"));
		System.out.println("Get Tag Name: " + o_service_class_radio.get(1).getTagName());
		System.out.println("Get Text value of the control: " + o_service_class_radio.get(1).getText());
		System.out.println("Get Class: " + o_service_class_radio.get(1).getClass());
		System.out.println("Get Location: " + o_service_class_radio.get(1).getLocation());
		System.out.println("Get Size: " + o_service_class_radio.get(1).getSize());
		
		//Wait for Next page to appear
		Thread.sleep(5000);
		
 
		
		System.out.println("Test Complete");
		
		
	}
	
	//Function to verify two text. Will be used as checkpoint function
	public boolean f_verify_text(String s_expected, String s_actual){
		
		if (s_expected.compareToIgnoreCase(s_actual)==0){
			System.out.println("Text Matching Successfull. Expected Text: " + s_expected + " and Actual Text: " + s_actual );
			return true;
		}else{
			System.out.println("Text Matching Failed. Expected Text: " + s_expected + " and Actual Text: " + s_actual );
			return false;
				
		}
		
	}
	
	//Function to check the existense of the Web Element
	public static boolean f_verify_element_exists(WebElement o_obj){
		if(o_obj!= null){
			System.out.println("Element is Present");
			return true;
		}else{
			System.out.println("Element is Absent");
			return false;
		}
		
	}
 
}