package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productPage extends basePage { 
		

	public productPage(WebDriver driver) {
		super(driver);
		
		PageFactory.initElements(driver, this);
	}

	 @FindBy(css =".btn_primary.btn_inventory" )		
	private WebElement aarBtn  ;

	 @FindBy(css =".inventory_details_back_button" )		
	  private WebElement backBtn ;
	 
	 @FindBy(css =".btn_primary.btn_inventory" )		
	  private WebElement addToCart ;

	public void  ddToCart () { 
		click(aarBtn);
		
		
}
	 
	
	public void  back () { 
		
		click(backBtn);
	}
	public void  AddToCart () {
	     click(addToCart);
		
}	
	}
