package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Constants;

public class SignInPage {
	
	private static WebElement element = null;
	
	public static WebElement signInHeader(WebDriver driver){
		element = driver.findElement(By.xpath(Constants.SIGNIN_PAGE));
		return element;
	}
	
	public static WebElement emailText(WebDriver driver){
		element = driver.findElement(By.xpath(Constants.EMAIL_INPUT_FIELD));
		return element;
	}
	
	public static WebElement passwordText(WebDriver driver){
		element = driver.findElement(By.xpath(Constants.PASSWORD_INPUT_FIELD));
		return element;
	}
	
	public static WebElement signinButton(WebDriver driver){
		element = driver.findElement(By.xpath(Constants.SIGNIN_BUTTON));
		return element;
	}
}
