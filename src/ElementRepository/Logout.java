package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout 
{
	@FindBy(xpath = "//div[text()='D']")
	private WebElement profile_btn;
	
	@FindBy(xpath= "//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])[6]")
	private WebElement logoutbtn;

public Logout(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement Option_btn()
{
	return profile_btn;
}
public WebElement Logout_btn()
{
	return logoutbtn;
}
}
