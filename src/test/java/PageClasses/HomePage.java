package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Constants;

public class HomePage {

	private static WebElement element = null;
	
	public static WebElement search(WebDriver driver){
		element = driver.findElement(By.xpath(Constants.SEARCHTEXT));
		return element;	
	}
	
	public static WebElement searchButton(WebDriver driver){
		element =driver.findElement(By.xpath(Constants.SEARCH_BUTTON));
		return element;
	}
	
}
