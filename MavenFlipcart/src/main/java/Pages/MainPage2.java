package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage2 { 
	
	@FindBy (xpath = "//button[contains(@class,'_2KpZ6l _2doB4z')]")
	private WebElement crossButton ; 
	
	@FindBy (xpath = "//div[text()='Fashion']")
	private WebElement fashionOption ; 
	
	@FindBy (xpath = "//a[text()='Bags, Suitcases & Luggage']")
	private WebElement bagsSuitcaseluggageOption ; 
	
	@FindBy (xpath = "(//span[text()='Become a Seller'])[1]")
	private WebElement becomeASellerOption ; 
	
	@FindBy (xpath = "//span[text()='Cart']")
	private WebElement cartOption ; 
	
	@FindBy (xpath = "//div[text()='Two Wheelers']")
	private WebElement twoWheelers ; 
	
	@FindBy (xpath = "(//a[@class='_6WOcW9 _3YpNQe'])[2]")
	private WebElement electricVehicles ; 
	
	private WebDriver driver;
	
	
	
	public MainPage2 (WebDriver driver) 
	{ 
		PageFactory.initElements(driver, this); 
		this.driver=driver;
		
	}
	
	public void ClickOnCross() 
	{ 
		Actions action = new Actions(driver); 
		action.moveToElement(crossButton).click().build().perform();
		
	} 
	
	
}
