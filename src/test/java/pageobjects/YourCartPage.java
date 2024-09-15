package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPage extends basePage {
	@FindBy(css =".btn_action.checkout_button" )		
	private WebElement CLIck ;
	
		
	public YourCartPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
    public void chevkout() {
    	
    	click(CLIck);
    	//driver.findElement(By.cssSelector(".btn_action.checkout_button")).click();
    	//click(driver.findElement(By.cssSelector(".btn_action.checkout_button")));
    }
}
