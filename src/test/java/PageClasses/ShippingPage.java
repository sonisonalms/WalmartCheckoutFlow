package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Constants;

public class ShippingPage {
	
private static WebElement element = null;
	
	public static WebElement shippingOptionOne(WebDriver driver){
		element = driver.findElement(By.xpath(Constants.SHIPPING_OPTION1));
		return element;
	}

}
