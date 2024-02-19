package testNG.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testNG.library.loginpage;
import utils.AppUtils;

public class AdminLoginWithInvalidData extends AppUtils
{
	@Parameters({"user","pass"})
	@Test
	public void InvalidLogin(String user,String pass) throws Throwable
	{
		loginpage lp= new loginpage();
		lp.login(user,pass);
		Thread.sleep(3000);
		boolean res = lp.isErrormesageDisplayed();
		Assert.assertTrue(res);
	}
}
