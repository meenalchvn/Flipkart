package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage { 
	@FindBy (xpath = "//div[@class='fbDBuK _3CYmv5']")
	private WebElement toAvoidCrossButton ; 
	
	
	@FindBy (xpath = "//span[@role='button']")
	private WebElement crossButton ; 
	
	@FindBy (xpath = "//span[text()='Fashion']")
	private WebElement fashionOption ; 
	
	@FindBy (xpath = "//a[text()='Bags, Suitcases & Luggage']")
	private WebElement bagsSuitcaseluggageOption ; 
	
	@FindBy (xpath = "(//span[text()='Become a Seller'])[1]")
	private WebElement becomeASellerOption ; 
	
	@FindBy (xpath = "//img[@alt='Cart']")
	private WebElement cartOption ; 
	
	@FindBy (xpath = "//span[text()='Two Wheelers']")
	private WebElement twoWheelers ; 
	
	@FindBy (xpath = "//a[text()='Electric Vehicles']")
	private WebElement electricVehicles ; 
	
	@FindBy (xpath = "//img[@title='Flipkart']")
	private WebElement flipkartLogo ; 
	
	private WebDriver driver;
	
	private Actions action ;
	
	
	
	
	public MainPage(WebDriver driver) 
	{ 
		PageFactory.initElements(driver, this);
		this.driver= driver; 
		this.action = new Actions(driver);
	} 
	
	public void clickOnBackGround() 
	{ 
		toAvoidCrossButton.click();
	}
	
	
	public void ClickCrossButton () 
	{ 
		crossButton.click(); 
		
	} 
	
	public void clickOnFashionOption() 
	{ 
		
		action.moveToElement(fashionOption).perform(); 
		action.moveToElement(bagsSuitcaseluggageOption).click().build().perform();
	}
	

	public void clickOnbecomeASeller () 
	{ 
		becomeASellerOption.click(); 
		
	} 
	
	public void clickOnCartOption () 
	{ 
		action.moveToElement(cartOption).click().build().perform();
		
	} 
	
	public void quitMethod() 
	{ 
		driver.quit();
	} 
	
	public void clickOntwoWheelers () 
	{ 
		action.moveToElement(twoWheelers).perform(); 
		action.moveToElement(electricVehicles).click().build().perform();
		
	} 
	
	public void returningToMainPage() 
	{ 
		flipkartLogo.click();
	} 

}
