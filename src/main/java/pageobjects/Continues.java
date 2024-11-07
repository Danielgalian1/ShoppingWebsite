package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Continues extends BasePage{
	@FindBy(css =".btn_secondary" )		
	private WebElement CLICK  ;

	public Continues(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
   public void continueShopping() {
	   click(CLICK);
	   //click(driver.findElement(By.cssSelector(".btn_secondary")));
	
}
}
