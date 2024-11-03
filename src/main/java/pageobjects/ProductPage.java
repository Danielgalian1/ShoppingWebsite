package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasePage { // נעשה קונסטרקטור על proudctpage // ומה שמסומן בשתי סלשים נמחק
//public class ProductPage {
	//WebDriver driver ;
	
	//public ProductPage(WebDriver driver) {
		
//		this.driver = driver;
	public ProductPage(WebDriver driver) {
		super(driver);
		// על מנת שהקליק יעבוד אני חייב לצבע הורשה
		PageFactory.initElements(driver, this);
	}

	 @FindBy(css =".btn_primary.btn_inventory" )		
	private WebElement aarBtn  ;

	 @FindBy(css =".inventory_details_back_button" )		
	  private WebElement backBtn ;
	 
	 @FindBy(css =".btn_primary.btn_inventory" )		
	  private WebElement addToCart ;

	public void  ddToCart () {//אוספה לעגלה קניות 
		click(aarBtn);
		//click(driver.findElement(By.cssSelector(".btn_primary.btn_inventory")));
		//driver.findElement(By.cssSelector(".btn_primary.btn_inventory")).click();
		
}
	 
	
	public void  back () { //חזרה לדף הקודם 
		//driver.findElement(By.cssSelector(".inventory_details_back_button")).click();
		//click(driver.findElement(By.cssSelector(".inventory_details_back_button")));
		click(backBtn);
	}
	public void  AddToCart () {
	     click(addToCart);
		//click(driver.findElement(By.cssSelector(".btn_primary.btn_inventory")));
}
	//public void remove() {
	//	click(driver.findElement(By.cssSelector(".btn_secondary.btn_inventory")));	
	}
