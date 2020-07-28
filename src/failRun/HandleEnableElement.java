package failRun;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import lib.EnableElementLib;

public class HandleEnableElement {

	WebDriver driver;
	@Test
	public void elementToClick()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/");
		//driver.findElement(By.xpath("//input[@id='persistent']")).click();// getting ElementNotInteractable exception
		//driver.findElement(By.xpath("//label[contains(text(),'Stay signed in')]")).click();// Working fine
		
		EnableElementLib.clickById(driver, "persistent");
		/*Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//input[@id='persistent']"))).click().build().perform();
		*/
		
		System.out.println("element unchecked");
	    Assert.assertEquals("123","456");
	}
	
	@AfterMethod
	public void failSC(ITestResult itr) throws IOException
	{
		int status = itr.getStatus();
		String failedMethodName =itr.getName();
		if(status==1){
			System.out.println("Method is pass So dont take screenshot");
		}
		else if(status==2){
			System.out.println("Method is failed so take the screenshot");
			TakeScreenShotWhenFailed.take_SC(driver, failedMethodName);
			System.out.println("ScreenShot taken for failed test case");
		}
		driver.quit();	
	}
	
}
