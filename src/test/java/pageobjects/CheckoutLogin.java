package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutLogin  extends basePage{ // ����� 2 

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
		
	}           // ����� 3
	public void logintoo(String user, String phone , String name ) {//�� ����� ���� ������ �������
		fillText( namefrist,user); // ����� ���� ������ �� ��� ����� filltext
		fillText(Lastname ,name );
		fillText(mobile ,phone);
		click(Click);//����� ����
		
	
	}
	
		
			}

		

