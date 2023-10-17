package Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.BecomeASeller;
import Pages.MainPage;

public class TestBecomeASeller { 
	
	public static void main(String[] args) {
		
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\OneDrive\\Desktop\\Meenal ST\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver(); 

	    driver.get("https://www.flipkart.com/"); 
	    driver.manage().window().maximize(); 
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    MainPage mainPage = new MainPage(driver); 
	    mainPage.ClickCrossButton();
	    mainPage.clickOnbecomeASeller();
	    
	    BecomeASeller becomeASeller = new BecomeASeller(driver);
	    becomeASeller.scrollDownMethod();
	    becomeASeller.BecomeASellerMethod();
	    
	    mainPage.quitMethod();
	    
	    
	}

}
