package webdrivermaven;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGmail {

	WebDriver driver;
	
	@Before
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
				
		
	}
	
	@Test
	public void TestGMail()
	{
		driver.findElement(By.id("Email")).sendKeys("Test@test.com");
		driver.findElement(By.id("Passwd")).sendKeys("Password");
		
		
	}
	
	@Test
	public void TestAssert()
	{
		Assert.assertEquals(100, 100);
		
		
	}
	
	
	
	
	
	@After
	public void TearDown()
	{
		driver.quit();		
	}
}
