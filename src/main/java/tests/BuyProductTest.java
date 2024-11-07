package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.Test;

import pageobjects.CheckoutLogin;
import pageobjects.LoginPage;
import pageobjects.YourCartPage;
import pageobjects.Addacrd;
import pageobjects.Continues;
import pageobjects.Finishbuy;
import pageobjects.ProductPage;
import pageobjects.ProductsPage;
import pageobjects.RemoveBack;

public class BuyProductTest {
	WebDriver driver ;
	@Test
	public void  tc01_test() {
	 driver = new ChromeDriver();
     driver.get("https://www.saucedemo.com/v1/index.html");
	}
 	@Test
 	public void  tc02_test() throws InterruptedException {
		// ����� ����� � ���� ����� �� ���� 
		LoginPage lp = new LoginPage(driver);
		//LoginPage lp = new LoginPage(driver);
		
		lp.login("locked_out_user", "secret_sauce");
		Thread.sleep(3000);
		lp.login("standard_user", "secret_sauce"); // ��� �����   ����� ���� ������ 
		//���� ��� ���� ����� ��� 
        
 	}
		@Test
	 	public void  tc03_test() throws InterruptedException {
		ProductsPage psp = new ProductsPage(driver);
		Thread.sleep(3000);
		psp.chooseProduct("Sauce Labs Backpack");//����� ���� ���� ���  
		
		ProductPage pp = new ProductPage(driver);
		pp. ddToCart();//����� ����� 
		pp.back();
		
	    psp = new ProductsPage(driver); //���� ��� �� ������ //����� ����� ����  ��� ����� //productpage
	    Thread.sleep(3000);
	    psp.chooseProduct("Sauce Labs Bike Light");//����� ���� ���� 
			
		pp = new ProductPage(driver);
		pp.AddToCart();//����� �� ������
		pp.back();
	    
		
	    psp = new ProductsPage(driver); //���� ��� �����
	    psp.openCart();
	    YourCartPage ycy = new YourCartPage(driver);
	    ycy.chevkout();
	   
	    CheckoutLogin pap =  new CheckoutLogin(driver);// 2 �����
	    pap.logintoo("daniel", "052-6866178", "galian");
	    Thread.sleep(3000);
	    Finishbuy pip =  new Finishbuy(driver);
	    pip.finish();
		
	    Addacrd pep = new Addacrd(driver);
	    pep.Addcrd();// ���� ����� ����� 
	    Thread.sleep(3000);
	    Continues plp = new Continues(driver);
	    plp.continueShopping();
	    psp.chooseProduct("Sauce Labs Onesie"); 
	    Thread.sleep(3000);
	    pp.AddToCart();
		}
	    @Test
	 	public void  tc04_test() throws InterruptedException {
	    RemoveBack po = new RemoveBack(driver);
	    po.remove();
	    po.openCarttoo();//po.list("3");
	  
	    RemoveBack pu= new RemoveBack(driver);
	    pu.closeMenu();
	    
	    LoginPage lp = new LoginPage(driver);
	    lp.login("performance_glitch_user", "secret_sauce");
		Thread.sleep(3000);
		
	    
	   
	   
	    //pp.remove();
	   
	}

}
