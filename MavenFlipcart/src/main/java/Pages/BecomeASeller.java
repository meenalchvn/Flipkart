package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BecomeASeller {

	@FindBy (xpath = "(//a[text()='Create Account'])[1]")
	private WebElement createAccountOption ; 
	
	@FindBy (xpath = "(//a[text()='List Products'])[1]")
	private WebElement listProductOption ; 
	
	@FindBy (xpath = "(//a[text()='Storage & Shipping'])[1]")
	private WebElement storageShippingOption ; 
	
	@FindBy (xpath = "(//a[text()='Receive Payments'])[1]")
	private WebElement recievePayementOption ; 
	
	@FindBy (xpath = "(//a[text()='Grow Faster'])[1]")
	private WebElement growFasterOption ; 
	
	@FindBy (xpath = "//a[text()='Seller App']")
	private WebElement sellerAppOption ; 
	
	@FindBy (xpath = "(//a[text()='Help & Support'])[1]")
	private WebElement helpSupportOption ; 
	
	@FindBy (xpath = "//span[text()='Go to Top']")
	private WebElement goUpOption ; 
	
	private WebDriver driver;
	
	public BecomeASeller (WebDriver driver) 
	{ 
		PageFactory.initElements(driver, this); 
		this.driver= driver;
	}
	
	public void scrollDownMethod () 
	{ 
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver; 
		javascriptExecutor.executeScript("window.scrollBy(0,100)");  
		
	} 
	
	
	public void BecomeASellerMethod () 
	{ 
		createAccountOption.click(); 
		listProductOption.click();
		storageShippingOption.click();
		recievePayementOption.click();
		growFasterOption.click();
		sellerAppOption.click();
		helpSupportOption.click();
		goUpOption.click();
		
	} 
	
	public void quitMethod() 
	{ 
		driver.quit();
	}
	
	
}
