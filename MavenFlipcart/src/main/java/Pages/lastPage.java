package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class lastPage { 
	
	@FindBy (xpath = "//button[text()='Add to cart']")
	private WebElement addToCartButton ; 
	
	private WebDriver driver;
	public lastPage(WebDriver driver) 
	{ 
		PageFactory.initElements(driver, this); 
		this.driver=driver;
	} 
	public void scrollDown() 
	{ 
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver; 
		javascriptExecutor.executeScript("window.scrollBy(0,2000 )" );
	}
	
	public void nextPageMethod() 
	{ 
		addToCartButton.click(); 
		
	}
}
