package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinishBuy extends BasePage {

	@FindBy(css = ".btn_action.cart_button")
	private WebElement clickf;

	public FinishBuy(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void finish() {
		click(clickf);

	}

}
