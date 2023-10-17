package Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.MainPage2;

public class TestURLClass { 
	
	
	public static void main(String[] args) throws InterruptedException {
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\OneDrive\\Desktop\\Meenal ST\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
	 WebDriver driver = new ChromeDriver(); 
	 driver.get("https://www.flipkart.com/");
	 driver.manage().window().maximize(); 
//	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
	 Thread.sleep(8000);
	 MainPage2 mainPage2 = new MainPage2(driver); 
	 mainPage2.ClickOnCross(); 
	 //mainPage2.ClickOnFashionOption();
	 
	 
	 
	 
	}

}
