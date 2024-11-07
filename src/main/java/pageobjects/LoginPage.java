package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  extends BasePage{
	@FindBy(css="#user-name")
	private WebElement userFiled ;
	@FindBy(css="#password")
	private WebElement passwordFiled  ;
	@FindBy(css="#login-button")
	private WebElement loginBtn;
	WebElement login ;

	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void login(String user ,String Password) {//דף כניסה לאתר פעולות ראשונות 
		fillText(userFiled, user);
		fillText(passwordFiled,Password);
		//fillText( driver.findElement(By.cssSelector("#user-name")),user); // מחיקה טקסט והכנסנ שם חדש פכולה filltext
		//fillText(driver.findElement(By.cssSelector("#password")) ,Password);
		//driver.findElement(By.cssSelector("#user-name")).sendKeys(user); //  ובפעול יכניס יוזא וסיסמא  
		//driver.findElement(By.cssSelector("#password")).sendKeys(Password);
		//driver.findElement(By.cssSelector("#login-button")).click();
		click(loginBtn);
	//click(driver.findElement(By.cssSelector("#login-button")));
	}
	 

}
