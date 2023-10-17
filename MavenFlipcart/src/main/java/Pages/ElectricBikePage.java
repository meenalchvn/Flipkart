package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectricBikePage { 
	
	
	@FindBy (xpath = "(//span[text()='VIEW ALL'])[1]")
	private WebElement viewOption ; 
	
	@FindBy (xpath = "(//span[text()='Add to Compare'])[2]")
	private WebElement addToCompare1 ; 
	
	@FindBy (xpath = "(//span[text()='Add to Compare'])[4]")
	private WebElement addToCompare2 ; 
	
	@FindBy (xpath = "//span[text()='COMPARE']")
	private WebElement CompareOption ; 
	
	@FindBy (xpath = "(//button[@class='_2KpZ6l _2U9uOA _3v1-ww vsi37q'])[2]") 
	private WebElement addToCartOption ; 
	
    private WebDriver driver; 
    
    
	
	public ElectricBikePage(WebDriver driver) 
	{ 
		PageFactory.initElements(driver, this); 
		this.driver= driver;
	} 
	
	public void ClickOnViewAll() 
	{ 
		viewOption.click();
	}
	
	public void addToCompare1Method()
	{ 
		addToCompare1.click(); 
	}  
	
	public void scrollDownMethod() 
	{ 
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
		javascriptExecutor.executeScript("window.scrollBy(0,500)"); 
	}
	
	public void addToCompare2Method()
	{ 
		addToCompare2.click();  
	}  
	
	public void CompareMethod()
	{ 
		CompareOption.click(); 
	} 
	
	
	public void ScrollDown() 
	{ 
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
		javascriptExecutor.executeScript("window.scrollBy(0,800)"); 
	} 
	
	public void ClickOnAddToCartOption() 
	{ 
		addToCartOption.click();
	}
	

}
