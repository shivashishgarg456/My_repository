package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ElementRepository.Homepage;
import ElementRepository.Login;
import ElementRepository.Logout;
import Utilities.Mouse1;

public class Base implements ApplicationConstant
{
	
	public WebDriver driver;
	public Homepage h;
	public Mouse1 m;
	@BeforeClass
	public void OpenBrowser()
	{
		System.setProperty(Chrome_key, Chrome_Value);
		driver = new ChromeDriver();
		driver.get(Shopperstack);
		h = new Homepage(driver);
		m = new Mouse1();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Time, TimeUnit.SECONDS);
		
		
	}
	@BeforeMethod
	public void Enter_App()
	{
		Login l = new Login(driver);
		l.Login_link().click();
		l.Shopper_link().click();
		l.Email_id().sendKeys("customer1@gmail.com");
		l.Pass().sendKeys("Yyff@123");
		l.Login_Btn().click();
		
	}
//	@Test
//	public void Title()
//	{
//		String Title = driver.getTitle();
//		System.out.println(Title);
//	}
	
//	@AfterMethod
//	public void Logout_App()
//	{
//		Logout lo = new Logout(driver);
//		lo.Option_btn().click();
//		lo.Logout_btn().click();
//		
//	}
	
	
	@AfterClass
	public void quit()
	{
		WebDriverWait w = new WebDriverWait(driver, Time);
		//w.until(ExpectedConditions.)
		driver.quit();
	}

}
