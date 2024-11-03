package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//��� �� ����� ����� ��� ������ ����� ���� �����
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage { // ����� ������ ������ ���� �����������
	WebDriver driver;// ��"�
	// JavascriptExecutor js;

	public BasePage(WebDriver driver) { // ��

		this.driver = driver; //
		// js=(JavascriptExecutor)driver;
	}

	// text �� ����� �� �����
	public void fillText(WebElement el, String text) { // ������ ������ ����� ���� �� ���� ���� ������� ������ �� ���
													// ���� ���� ��� ���� ��� �� ���� ��� ���� ��
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].setAttribute('style','background-color:blue ;border: 1px solid blue;');", el);
		el.clear();
		el.sendKeys(text);
	}

	public void click(WebElement el) {// ������ ������ ��� ����� ������ �� ����� /����� ��� ���� ���� ����
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].setAttribute('style','background-color:blue ;border: 1px solid blue;');", el);
		 el.click();
	}
	public void list(WebElement er, String text ) {
		
	}
}