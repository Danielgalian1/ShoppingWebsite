package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addacrd  extends BasePage{
     
		@FindBy(css ="#shopping_cart_container > a > svg > path")		
		private WebElement AddCard ;
		public Addacrd(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
  public void Addcrd (){
		click(AddCard);
	  //click(driver.findElement(By.cssSelector("#shopping_cart_container > a > svg > path")));  
  }


{

}
}