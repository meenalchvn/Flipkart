package Tests;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.CartPage;
import Pages.MainPage;
import Pages.OppoMobilePage;

public class TestCartFunctionality { 
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\OneDrive\\Desktop\\Meenal ST\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 

	    driver.get("https://www.flipkart.com/"); 
	    driver.manage().window().maximize(); 
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    MainPage mainPage = new MainPage(driver); 
	    mainPage.ClickCrossButton(); 
	    mainPage.clickOnCartOption(); 
	    
	    CartPage cartPage = new CartPage(driver);
	    cartPage.ClickOnSearchButton(); 
	    cartPage.ClickOnOppoMobile();
	    
	    ArrayList<String> childBrowser = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(childBrowser.get(1));
	    
		OppoMobilePage oppoMobilePage = new OppoMobilePage(driver); 
		oppoMobilePage.ClickOnAddToCart();
		
		mainPage.quitMethod();
		
	}
	
	

}
