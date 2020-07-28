package failRun;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestFB {

	WebDriver driver;
	@Test
	public void openFB() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		/*driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email'and @data-testid='royal_email']")).sendKeys("Hari-Prasad");
		Thread.sleep(3000);
		System.out.println("openFB we are running");
		Assert.assertTrue(false);
	}	 
	
	@AfterMethod
	public void sc(ITestResult result)
	{
		int status = result.getStatus();
		if(status==2){//satus==2 is for failed test case
			TakeScreenShotWhenFailed.takeSC(driver,result.getName());
		}
		else if(status==3)
		{//satus==3 is for skipped test case
			System.out.println("test is skipped");
		}
		else if(status==1)
		{//satus==1 is for pass test case
			System.out.println("this test is passed so dont take the screenshot");
		}
		driver.quit();
	}
	
}
