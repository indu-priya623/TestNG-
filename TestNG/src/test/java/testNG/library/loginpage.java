package testNG.library;

import org.openqa.selenium.By;
import utils.AppUtils;

public class loginpage extends AppUtils 
{
	public void login(String username, String password)
	{   driver.findElement(By.id("txtuId")).clear();
		driver.findElement(By.id("txtuId")).sendKeys(username);
		driver.findElement(By.id("txtPword")).clear();
		driver.findElement(By.id("txtPword")).sendKeys(password);
		driver.findElement(By.id("login")).click();
	}

	public boolean isAdminModuleDisplayed() {
		if (driver.findElement(By.xpath("//a[@href='http://primusbank.qedgetech.com']")).isDisplayed())
		{
			return true;
		} else
		{
			return false;
		}
	}

	public boolean isErrormesageDisplayed() {
		String errmsg = driver.switchTo().alert().getText();
		if (errmsg.contains("InCorrect")) 
		{
			driver.switchTo().alert().accept();
			return true;
		}
		else
		{
			System.out.println("Fail");
			return false;
		}
	}

	public void logout() {
		driver.findElement(By.xpath("//a[@href='http://primusbank.qedgetech.com']")).click();
	}
}
