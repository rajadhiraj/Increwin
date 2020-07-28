package failRun;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TakeScreenShotWhenFailed {

	public static void takeSC(WebDriver driver, String tcName)
	{
		TakesScreenshot sc = (TakesScreenshot)driver;
		File src = sc.getScreenshotAs(OutputType.FILE);
		File des = new File("./Screenshots/"+ tcName +".png");
		
		try {
			FileUtils.copyFile(src, des);
			System.out.println("Screenshot taken");
		} 
		catch (IOException e) {
			System.out.println("Taking screenshot while failing of test case");
			e.printStackTrace();
		}
		
	}
	

	public static void take_SC(WebDriver driver, String methodName) throws IOException
	{
		
		TakesScreenshot tsc =(TakesScreenshot)driver;
		File source= tsc.getScreenshotAs(OutputType.FILE);
		File target = new File("./photoSC/" + methodName +".png");
		FileUtils.copyFile(source, target);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
