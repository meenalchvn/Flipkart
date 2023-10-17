package Tests;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.CartPage;
import Pages.ElectricBikePage;
import Pages.MainPage;
import Pages.OppoMobilePage;
import Pages.lastPage;
import Pages.nextPage;

public class TestNgClass { 
	
	private WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() 
	{ 
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\OneDrive\\Desktop\\Meenal ST\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		 driver = new ChromeDriver();
	}
	
	@BeforeMethod 
	public void getURL() 
	{
		driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize(); 
	}
	
//	@Test (priority=1)
//	public void TestShoppingFunctionality() throws InterruptedException 
//	{
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
//		Thread.sleep(20000);
//		MainPage mainPage = new MainPage(driver);
//		mainPage.ClickCrossButton();
//		mainPage.clickOnFashionOption();
//	    
//	    nextPage _nextPage = new nextPage(driver); 
//	    _nextPage.clickOnHandbagsClutches();
//	    _nextPage.clickOnBackpackHandbags();
//	    _nextPage.scrollDown(); 
//	    Thread.sleep(2000);
//	    _nextPage.clickOnLaptopBackpack(); 
//	    
//	    ArrayList<String> childBrowser = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(childBrowser.get(1)); 
//	    lastPage _lastPage = new lastPage(driver); 
//	    Thread.sleep(2000);
//	    _lastPage.scrollDown();   
//	    _lastPage.nextPageMethod(); 
//	    
//	}
	 
//	@Test (priority=2)
//	public void TestCartFunctionality() throws InterruptedException 
//	{ 
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
//		//Thread.sleep(20000);
//		MainPage mainPage = new MainPage(driver); 
//	    //mainPage.ClickCrossButton(); 
//	    mainPage.clickOnCartOption(); 
//	    
//	    CartPage cartPage = new CartPage(driver);
//	    Thread.sleep(3000);
//	    cartPage.ClickOnSearchButton(); 
//	    cartPage.ClickOnOppoMobile();
//	    
//	    ArrayList<String> childBrowser = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(childBrowser.get(1));
//	    
//		OppoMobilePage oppoMobilePage = new OppoMobilePage(driver); 
//		oppoMobilePage.ClickOnAddToCart(); 
//		
//	} 
	
	@Test (priority=3)
	public void TestElectricBikeBuy() throws InterruptedException 
	{  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		Thread.sleep(20000);
		MainPage mainPage = new MainPage(driver); 
	    mainPage.ClickCrossButton(); 
	    mainPage.clickOntwoWheelers(); 
	    
	    ElectricBikePage electricBikePage =new ElectricBikePage(driver); 
	    electricBikePage.ClickOnViewAll(); 
	    electricBikePage.addToCompare1Method(); 
	    electricBikePage.scrollDownMethod(); 
	    electricBikePage.addToCompare2Method(); 
	    electricBikePage.CompareMethod();
	    electricBikePage.ScrollDown(); 
	    electricBikePage.ClickOnAddToCartOption();
	} 
	
	@AfterMethod
	public void returnToMainPage() 
	{ 
		MainPage mainPage = new MainPage(driver); 
		mainPage.returningToMainPage();
	} 
	
	@AfterClass
	public void logOutApplication() 
	{
		MainPage mainPage = new MainPage(driver); 
		mainPage.quitMethod();
	}

}
