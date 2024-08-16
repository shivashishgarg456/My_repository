package Testcases;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Generic.Base;

@Test(invocationCount = 2)
public class Test1 extends Base
{
	public void Electonic()
	{

		m.MouseActions(driver).moveToElement(h.Electronic_tab()).perform();
		
		//		Actions act = new Actions(driver);
//		act.moveToElement(h.Electronic_tab()).perform();
		h.Electronic_link().click();
		h.Iphone_link().click();
		h.Addcart_btn().click();
		h.Addcart_btn().click();
		h.Cart_btn().click();
		h.Cart_Button().click();
		System.out.println("hii");
	}
}