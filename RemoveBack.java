package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveBack extends BasePage {

	@FindBy(css = "Name (A to Z)")
	private WebElement cLicK;
	@FindBy(css = ".btn_secondary.btn_inventory")
	private WebElement cLick;
	@FindBy(css = ".inventory_details_back_button")
	private WebElement CLIck;
	@FindBy(css = ".product_sort_container")
	private WebElement listclck;
	@FindBy(css = "2")
	private WebElement list;
	@FindBy(css = "inventory_item_name")
	private WebElement sdd;
	@FindBy(css = "#inventory_container > div > div:nth-child(6) > div.pricebar > button")
	private WebElement Aa;
	@FindBy(css = "#menu_button_container > div > div:nth-child(3) > div > button")
	private WebElement RR;
	@FindBy(css = ".bm-item menu-item")
	private WebElement List;
	@FindBy(css = "#logout_sidebar_link")
	private WebElement logoutLink;

	public RemoveBack(WebDriver driver) {

		super(driver);
		PageFactory.initElements(driver, this);

	}

	public void remove() {
		click(cLick);
		click(CLIck);

	}

	public void list() {
		click(listclck);

	}

	public void openCarttoo() {
		click(Aa);
		click(RR);
	}

	// click(About);
	public void closeMenu() throws InterruptedException {
		Thread.sleep(1500);
		click(logoutLink);
		// click(driver.findElement(By.cssSelector(".product_sort_container")));
		// click(driver.findElement(By.cssSelector(" ")));

		// Select selectproduct new = select
		// (driver.findElement(By.cssSelector(".btn_action.checkout_button")));
		// public int nlist() {
		// String s =
		// getText(driver.findElement(By.cssSelector("product_sort_container")));
		// click(cLicK);
		// click(cLick);
	}
}
