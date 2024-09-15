package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutLogin  extends basePage{ // סימון 2 

	 @FindBy(css ="#first-name")		
	 private WebElement namefrist ;
	 @FindBy(css ="#last-name")		
	 private WebElement Lastname ;
	 @FindBy(css ="#postal-code")		
	 private WebElement mobile ;
	 @FindBy(css ="#checkout_info_container > div > form > div.checkout_buttons > input")		
	 private WebElement Click ;


	public CheckoutLogin(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}           // סימון 3
	public void logintoo(String user, String phone , String name ) {//דף כניסה לאתר פעולות ראשונות
		fillText( namefrist,user); // מחיקה טקסט והכנסנ שם חדש פכולה filltext
		fillText(Lastname ,name );
		fillText(mobile ,phone);
		click(Click);//כפתור המשך
		
	
	}
	
		
			}

		

