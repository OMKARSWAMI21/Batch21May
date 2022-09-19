package pomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage
{
	static WebDriver driver;
	WebDriverWait wait;
	
	@FindBy (xpath="//span[text()='Admin']")
	private WebElement admin;
	
	@FindBy (xpath="//*[text()='PIM']")
	private WebElement PIM;
	
	@FindBy (xpath="//*[text()='Leave']")
	private WebElement leave;
	
	public HomePage(WebDriver driver) 
	{
		this.driver=driver;
		wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
	}
	
	public void verifyAdminTab() 
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Admin']")));
		admin.isDisplayed();	
	}
	
	public void verifyPIMTab() 
	{
		PIM.isDisplayed();
	}
	
	public void verifyLeaveTab() 
	{
		 leave.isDisplayed();
	}

}
