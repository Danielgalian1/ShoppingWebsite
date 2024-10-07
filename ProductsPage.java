package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends BasePage {

	@FindBy(css = "#shopping_cart_container path")
	private WebElement crtBtn;

	@FindBy(css = ".inventory_item_name")
	private List<WebElement> list;

	public ProductsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void chooseProduct(String name) {
		List<WebElement> list = driver.findElements(By.cssSelector(".inventory_item_name"));
		for (WebElement el : list) {
			if (el.getText().equalsIgnoreCase(name)) {
				click(el);

				break;
			}
		}
	}

	public void openCart() {

		click(crtBtn);

	}

}
