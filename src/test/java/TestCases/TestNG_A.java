package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomPackage.HomePage;
import pomPackage.LogInPage;
import utility.Browser;

public class TestNG_A extends Browser
{
	WebDriver driver;
	@BeforeClass
	public void BeforeClass() 
	{
		WebDriver driver= ChromeBrowser();
		this.driver=driver;
	} 

	@Test(priority=0)
	public void testA() 
	{
	    LogInPage login = new LogInPage(driver);
	    login.SendUserName();    
	    login.SendPassword();
	    login.ClickOnLogin();
	    
	    String actualUrl= driver.getCurrentUrl();
	    String expectedUrl= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	    SoftAssert s = new SoftAssert();
	    s.assertEquals(actualUrl,expectedUrl);
	    s.assertAll();
	} 
	
	@Test (priority=1)
	public void testB()
	{
	   //(verify Home page )
		HomePage home = new HomePage(driver);
    	home.verifyAdminTab();
    	home.verifyPIMTab();
    	home.verifyLeaveTab();
    }
}
