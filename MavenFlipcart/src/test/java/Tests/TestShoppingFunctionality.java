package Tests;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Pages.MainPage;
import Pages.lastPage;
import Pages.nextPage;

public class TestShoppingFunctionality { 
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\OneDrive\\Desktop\\Meenal ST\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize(); 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
	    Thread.sleep(20000);
		MainPage mainPage = new MainPage(driver);
		mainPage.ClickCrossButton();
		mainPage.clickOnFashionOption();
	    
	    nextPage _nextPage = new nextPage(driver); 
	    _nextPage.clickOnHandbagsClutches();
	    _nextPage.clickOnBackpackHandbags(); 
	    _nextPage.scrollDown(); 
	    Thread.sleep(2000);
	    _nextPage.clickOnLaptopBackpack(); 
	    
	    ArrayList<String> childBrowser = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(childBrowser.get(1)); 
	    lastPage _lastPage = new lastPage(driver); 
	    Thread.sleep(2000);
	    _lastPage.scrollDown(); 
	    
	    _lastPage.nextPageMethod(); 
	    
	    mainPage.returningToMainPage();
	    //mainPage.quitMethod();
	}

}
