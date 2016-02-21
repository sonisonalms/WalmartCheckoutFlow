package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.Constants;

public class ProductListPage {
	private static WebElement element = null;
	
	public static WebElement shopNow(WebDriver driver){
		element = driver.findElement(By.xpath(Constants.SHOPNOW));
		return element;
	}
	
	public static WebElement colorSelection(WebDriver driver){
		element = driver.findElement(By.xpath(Constants.IPHONE_COLOR));
		return element;
	}
	
	public static WebElement flyOutClose(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver, 40);
		element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Constants.FLYOUT_CLOSE))));
		return element;
	}
	

}
