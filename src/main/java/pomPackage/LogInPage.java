package pomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage 
{
	static WebDriver driver;
	WebDriverWait wait;
	@FindBy (xpath="//input[contains(@name,'username')]")
	private WebElement username;
	
	@FindBy (xpath="//input[contains(@name,'password')]")
	private WebElement password;
	
	@FindBy (xpath="//button[contains(@type,'submit')]")
	private WebElement login;
	
		
	public LogInPage(WebDriver driver) 
	{
		this.driver=driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
	}
	
	public void SendUserName() 
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@name,'username')]")));
		username.sendKeys("Admin");
	}
	
	public void SendPassword() 
	{
		password.sendKeys("admin123");
	}
	
	public void ClickOnLogin() 
	{
		login.click();
	}
	
}
