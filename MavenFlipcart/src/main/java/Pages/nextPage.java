package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class nextPage { 
	
	@FindBy (xpath = "//a[text()='Handbags & Clutches']")
	private WebElement HandbagsClutches ;
	
	
	@FindBy (xpath = "(//a[text()='Backpack Handbags'])[1]")
	private WebElement BackpackHandbags ; 
	
	@FindBy (xpath = "(//img[@class='_2r_T1I'])[1]")
	private WebElement LaptopBackpack ; 
	
	private WebDriver driver; 
	
	public nextPage (WebDriver driver) 
	{ 
		PageFactory.initElements(driver, this); 
		this.driver= driver;
	}  
	
	public void clickOnHandbagsClutches() 
	{ 
		HandbagsClutches.click(); 
	} 
	
	public void clickOnBackpackHandbags() 
	{ 
		BackpackHandbags.click(); 
	} 
	
	public void scrollDown() 
	{ 
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver; 
		javascriptExecutor.executeScript("window.scrollBy(0,300 )" ); 
	} 
	
	
	public void clickOnLaptopBackpack() 
	{ 
		
		LaptopBackpack.click();
	}

}
