package Generic;

import org.testng.annotations.DataProvider;

public class CustomerData 
{
	@DataProvider(name = "Shopperdetails")
	public Object[][] Shopper()
	{
		Object[][] data = new Object[1][1];
		data[0][0] = ("customer1@gmail.com");
		data[0][1] = ("Yyff@123");
		
		return data;
	}

}
