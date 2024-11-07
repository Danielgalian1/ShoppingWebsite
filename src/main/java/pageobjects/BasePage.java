package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//בדף זה נגדיר מטודת שלא נצתריך לרשום הרבה קודים
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage { // מופיע אוטמיט הפעולה לאחר קורנסטרקטור
	WebDriver driver;// כנ"ל
	// JavascriptExecutor js;

	public BasePage(WebDriver driver) { // גם

		this.driver = driver; //
		// js=(JavascriptExecutor)driver;
	}

	// text שם משתמש או סיסמא
	public void fillText(WebElement el, String text) { // המטודה פעולתה למחוק טקסת את תיבה יוזר וסיסימא ונכניס את השם
													// החדש ניגד היה רשום דוד אז ימחק דוד וכנס שי
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].setAttribute('style','background-color:blue ;border: 1px solid blue;');", el);
		el.clear();
		el.sendKeys(text);
	}

	public void click(WebElement el) {// פהקליק יופיכע בכל מטודה שנכניס לה אלמנט /פעולה שכל קליק יסמן בצבע
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].setAttribute('style','background-color:blue ;border: 1px solid blue;');", el);
		 el.click();
	}
	public void list(WebElement er, String text ) {
		
	}
}