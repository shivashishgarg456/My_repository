package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login
{
	
	@FindBy(xpath = "//button[text()='Login']")
	private WebElement Loginlink;
	
	@FindBy(xpath = "//button[text()='Shopper Login']")
	private WebElement Shopper_login;
	
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement Email;
	
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement Password;
	
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement LoginBtn;
	
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement LoginBtn2;
	
	public Login(WebDriver driver)			//Constructor
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement Login_link()
	{
		return Loginlink;
	}
	
	public WebElement Shopper_link()
	{
		return Shopper_login;
	}
	
	public WebElement Email_id()
	{
		return Email;
	}
	
	public WebElement Pass()
	{
		return Password;
	}
	
	public WebElement Login_Btn()
	{
		return LoginBtn;
	}
	public WebElement Login_Btn_2()
	{
		return LoginBtn2;
	}
}
