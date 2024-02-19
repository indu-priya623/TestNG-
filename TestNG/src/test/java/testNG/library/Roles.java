package testNG.library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.AppUtils;

public class Roles extends AppUtils
{
	public void RoleCreation(String RoleName ,String RoleDesk,String RoleType)
	{
		driver.findElement(By.xpath("//a[@href='Admin_Roles_details.aspx']")).click();
		driver.findElement(By.id("btnRoles")).click();
		driver.findElement(By.id("txtRname")).sendKeys(RoleName);
		driver.findElement(By.id("txtRDesc")).sendKeys(RoleDesk);

		Select s= new Select(driver.findElement(By.id("lstRtypeN")));
		s.selectByVisibleText(RoleType);

		driver.findElement(By.id("btninsert")).click();

		String alert = driver.switchTo().alert().getText();
		if (alert.contains("Created Sucessfully"))
		{
			driver.switchTo().alert().accept();
		}
		else
		{
			driver.switchTo().alert().dismiss();
		}
	}
	public void RoleDeletion()
	{
		driver.findElement(By.xpath("//a[@href='Admin_Roles_details.aspx']")).click();
		WebElement delete = driver.findElement(By.xpath("//table[@id='DGRoles']/tbody/tr[3]//img[@src='images/i_delete.gif']"));
	    delete.click();
	    
	    String alert = driver.switchTo().alert().getText();
	    if (alert.contains("delete this record?"))
	    {
			driver.switchTo().alert().accept();
		}
	    else
	    {
			driver.switchTo().alert().dismiss();
		}
	}
}


