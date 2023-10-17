package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OppoMobilePage { 
	
	@FindBy (xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement addToCart ; 
	
    private WebDriver driver; 
	
	public OppoMobilePage (WebDriver driver) 
	{ 
		PageFactory.initElements(driver, this); 
		this.driver= driver;
	} 
	
	public void ClickOnAddToCart() 
	{ 
		addToCart.click();
	}

}
