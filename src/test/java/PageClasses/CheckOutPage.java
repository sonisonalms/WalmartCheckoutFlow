package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Constants;

public class CheckOutPage {
	
	private static WebElement element = null;
	
	public static WebElement addToCart(WebDriver driver){
		element = driver.findElement(By.xpath(Constants.ADD_TO_CART));
		return element;
	}
	
	public static WebElement viewCart(WebDriver driver){
		element = driver.findElement(By.xpath(Constants.VIEW_CART));
		return element;
	}
	public static WebElement checkoutCart(WebDriver driver){
		element = driver.findElement(By.xpath(Constants.CHECKOUT_BUTTON));
		return element;
	}
	
	public static WebElement topCart(WebDriver driver){
		element = driver.findElement(By.xpath(Constants.TOP_CART));
		return element;
	}
	
	public static WebElement removeCart(WebDriver driver){
		element = driver.findElement(By.xpath(Constants.REMOVE_CART));
		return element;
	}
}
