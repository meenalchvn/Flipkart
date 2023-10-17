package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage { 
	
	
	@FindBy (xpath = "//input[@class='_3704LK']")
	private WebElement searchButton ; 
	
	@FindBy (xpath = "//button[@class='L0Z3Pu']")
	private WebElement searchOption ; 
	
	@FindBy (xpath = "(//img[@loading='eager'])[1]")
	private WebElement oppoMobile ; 
	
	private WebDriver driver;
	
	public CartPage(WebDriver driver) 
	{ 
		PageFactory.initElements(driver, this); 
		this.driver= driver;
	} 
	
	public void ClickOnSearchButton() 
	{ 
		searchButton.sendKeys("oppo mobile 5g"); 
		searchOption.click();
	} 
	
	public void ClickOnOppoMobile() 
	{ 
		Actions action = new Actions(driver);
		action.moveToElement(oppoMobile).click().build().perform();
	}

}
