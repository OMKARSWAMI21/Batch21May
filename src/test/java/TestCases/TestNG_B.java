package TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_B
{
	private static final String enabled = null;

	@BeforeClass
	public void beforeclass() 
	{
		System.out.println("beforeclass");
	} 
	
	@BeforeMethod
	public void beforemethod() 
	{
		System.out.println("beforemethod");
	} 
		
	@Test(timeOut=2)
	public void testA() throws InterruptedException 
	{
		Thread.sleep(5000);
		System.out.println("testA");
	} 
	
	@Test 
	public void testB() 
	{
		System.out.println("testB");
	} 
	
	@Test()
	public void testC() 
	{
		System.out.println("testC");
		//Assert.fail();
	} 
	
	@AfterClass
	public void Afterclass() 
	{
		System.out.println("beforeclass");
	} 
	
	@AfterMethod
	public void Aftermethod() 

	{
		System.out.println("beforemethod");
	} 
}
