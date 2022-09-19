package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPackage.HomePage;
import pomPackage.LogInPage;

public class Loginpage 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().maximize();
	   // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	     //(verify login functionnality)
	    LogInPage login = new LogInPage(driver);
	    login.SendUserName();    
	    login.SendPassword();
	    login.ClickOnLogin();
	    
	     //(verify Home page )
	    HomePage home = new HomePage(driver);
	    home.verifyAdminTab();
	    home.verifyPIMTab();
	    home.verifyLeaveTab();
	    
	   
	}

}
