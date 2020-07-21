package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.Homepage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testCase1 
{
	public WebDriver driver;
	
	Homepage hm;
	 
	
	@BeforeTest
	public void SetURL() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();   
		hm = new Homepage(driver);
		hm.Login();
	}
	
	@Test
	public void Navigate()
	{
		String actualTitle=hm.getLoginTitle().toLowerCase().replace(" ","");;
		String expectedTitle="ndtv:latestnews,indianews,breakingnews,business,bollywood,cricket,videos&photos";
		 Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	
	@AfterTest
	public void endSession()
	{
	driver.quit();
	}



}
