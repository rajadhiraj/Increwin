package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class EnableElementLib {

	public static void clickById(WebDriver ldriver, String lid)
	{
		Actions act = new Actions(ldriver);
		act.moveToElement(ldriver.findElement(By.id(lid))).click().build().perform();	
	}
	public static void clickByName(WebDriver ldriver, String lname)
	{
		Actions act = new Actions(ldriver);
		act.moveToElement(ldriver.findElement(By.name(lname))).click().build().perform();	
	}
	
}

