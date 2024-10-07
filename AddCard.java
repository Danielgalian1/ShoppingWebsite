package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCard extends BasePage {

	@FindBy(css = "#shopping_cart_container > a > svg > path")
	private WebElement AddCard;

	public AddCard(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void Addcrd() {
		click(AddCard);

	}

	{

	}
}