package testNG.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testNG.library.loginpage;
import utils.AppUtils;

public class AdminLoginWithValidData extends AppUtils 
{
	@Parameters({ "user", "pass" })
	@Test
	public void ValidLogin(String user, String pass) {
		loginpage lp = new loginpage();
		lp.login(user, pass);
		boolean res = lp.isAdminModuleDisplayed();
		Assert.assertTrue(res);
		lp.logout();
	}
}
