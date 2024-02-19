package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class AppUtils 
{
public static String url="http://primusbank.qedgetech.com";
public static WebDriver driver; 
@BeforeSuite
public void launchApp()
{
	driver = new FirefoxDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(url);
}
@AfterSuite
public void closeApp()
{
	driver.quit();
}
}
