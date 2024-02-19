package testNG.library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.AppUtils;

public class Branch extends AppUtils
{
public void branchCreation(String BranchName,String Address,String Zipcode,String Country,String State,String City) throws Throwable
{
	driver.findElement(By.xpath("//a[@href='admin_banker_master.aspx']")).click();
	driver.findElement(By.id("BtnNewBR")).click();
	
	driver.findElement(By.id("txtbName")).sendKeys(BranchName);
	driver.findElement(By.id("txtAdd1")).sendKeys(Address);
	driver.findElement(By.id("txtZip")).sendKeys(Zipcode);
	
	Select G = new Select(driver.findElement(By.id("lst_counrtyU")));
	G.selectByVisibleText(Country);
	
	Select I = new Select(driver.findElement(By.id("lst_stateI")));
	I.selectByVisibleText(State);

	Select C =new Select(driver.findElement(By.id("lst_cityI")));
	C.selectByVisibleText(City);
		
	driver.findElement(By.id("btn_insert")).click();
	
	Thread.sleep(1000);
	
	String alert = driver.switchTo().alert().getText();
	if (alert.contains("created Sucessfully")) 
	{
	   driver.switchTo().alert().accept();
	}
	else
	{
		driver.switchTo().alert().dismiss();
	}		
}
public void branchDeletion() throws Throwable
{
	driver.findElement(By.xpath("//a[@href='admin_banker_master.aspx']")).click();
	WebElement delete = driver.findElement(By.xpath("//table[@id='DG_bankdetails']/tbody/tr[3]/td[8]//img[@src='images/i_delete.gif']"));
	delete.click();
	Thread.sleep(5000);
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


