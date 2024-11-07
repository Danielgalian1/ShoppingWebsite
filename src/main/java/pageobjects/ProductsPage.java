package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//public class productsPage  {
	public class ProductsPage  extends BasePage{
     //WebDriver driver;
    @FindBy(css ="#shopping_cart_container path" )
	private WebElement crtBtn ;
//	public productsPage(WebDriver driver) {
    @FindBy(css =".inventory_item_name")
    private List<WebElement> list ;
	//	this.driver = driver;
	public ProductsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
    public void chooseProduct(String name) {//name .�� ��� ���� ����� �� ����� �����/name 
    	 List<WebElement> list = driver.findElements(By.cssSelector(".inventory_item_name"));//���"�� ����� ����� �� ������ cless //����� ������ �� �������
    	 for (WebElement el : list) {
			if (el.getText().equalsIgnoreCase(name)) {// �� ���� ��� ����� ����� ���� ���� 
				click(el);
				//el.click(); // ���� ���� ���� ���� 
				break;
			}
		}	
}
    public void openCart	() {
    	
    	click(crtBtn);
    	//click(driver.findElement(By.cssSelector("#shopping_cart_container path")));
    	//driver.findElement(By.cssSelector("#shopping_cart_container path")).click();//����� �� ����� ����
    }
	
    }
