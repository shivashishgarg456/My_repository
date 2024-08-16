package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	
		@FindBy(xpath = "//a[@id='electronics']")
		private WebElement Electronic;
		
		@FindBy(xpath = "//a[text()='Electronics GST Store']")
		private WebElement EGST;
		
		@FindBy(xpath = "(//img[@alt = 'APPLE iPhone 13 Pro max'])[1]")
		private WebElement Iphone;
		
		@FindBy(xpath = "//span[text()='add to cart']")
		private WebElement Addcart;
		
		@FindBy(xpath = "//a[@name='cart']")
		private WebElement Cart;
		
		@FindBy(xpath = "(//span[text()=0])[1]")
		private WebElement CartButton;
		
		public Homepage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		public WebElement Electronic_tab()
		{
			return Electronic;
		}
		public WebElement Electronic_link()
		{
			return EGST;
		}
		public WebElement Iphone_link()
		{
			return Iphone;
		}
		public WebElement Addcart_btn()
		{
			return Addcart;
		}
		public WebElement Cart_btn()
		{
			
			return Cart;
		}
		public WebElement Cart_Button()
		{
			return CartButton;
		}
}