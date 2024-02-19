package testNG.library;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utils.AppUtils;

public class AdminLoginUtil extends AppUtils
{
	public String user ="Admin";
	public String pass ="Admin";
	public loginpage lp;
	@BeforeTest
	public void adminlogin()
	{
		lp = new loginpage();
		lp.login(user, pass);
		boolean res = lp.isAdminModuleDisplayed();
		Assert.assertTrue(res);
	}
	@AfterTest
	public void adminlogout()
	{
		lp.logout();
	}

}
