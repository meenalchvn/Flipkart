package Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.BecomeASeller;
import Pages.MainPage;

public class TestNg2 { 
	
	private WebDriver driver; 
	
	@BeforeClass
	public void launchBrowser() 
	{ 
       // System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\OneDrive\\Desktop\\Meenal ST\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		 driver = new ChromeDriver();
	}
	
	@BeforeMethod 
	public void getURL() 
	{
		driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize(); 
	} 
	
	@Test
	public void TestBecomeASeller() 
	{ 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		MainPage mainPage = new MainPage(driver); 
	    mainPage.ClickCrossButton();
	    mainPage.clickOnbecomeASeller();
	    
	    BecomeASeller becomeASeller = new BecomeASeller(driver);
	    becomeASeller.scrollDownMethod();
	    becomeASeller.BecomeASellerMethod();
	}
	
//	@AfterMethod
//	public void returnToMainPage() 
//	{ 
//		MainPage mainPage = new MainPage(driver); 
//		mainPage.returningToMainPage();
//	} 
	
	@AfterClass
	public void logOutApplication() 
	{
		MainPage mainPage = new MainPage(driver); 
		mainPage.quitMethod();
	}

	
	
	
	
	
	
	
	

}
