package Testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Test_Base_ixigo;
import Page.HomePage1;

public class HomePage1_Test extends Test_Base_ixigo{
HomePage1 homeixigo;
	@BeforeMethod
	public void setup()
	{
		initialization_ixigo();
	 homeixigo = new HomePage1();
	}
	@Test(enabled=false)
	public void verifylogotest()
	{
		boolean logo = homeixigo.verifylogo();
		Assert.assertEquals(logo, true);
	}
	@Test(enabled=false)
	public void verifyurltest()
	{
		String url= homeixigo.verifyurl();
		Assert.assertEquals(url,"https://www.ixigo.com/");
	}
	@Test
	public void bookingtest() throws Exception
	{
		homeixigo.booking();
		}
	
	@AfterMethod
	public void closeb()
	{
		driver.close();
	}
}
