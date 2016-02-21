package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.Constants;

public class MyAccountPage {

	@FindBy(className = "dropdown-link")
	private static WebElement dropDown;
	
	@FindBy(className = "js-sign-out")
	private static WebElement signOut;
	
	private static WebElement element = null;
	
	public static WebElement myaccountDropdown(WebDriver driver){
		element = driver.findElement(By.xpath(Constants.MYACCOUNT_DROPDOWN));
		return element;
	}
	public static WebElement myaccountAccount(WebDriver driver){
		element = driver.findElement(By.xpath(Constants.MYACCOUNT_ACCOUNT));
		return element;
	}
	public static WebElement myaccountSignout(WebDriver driver){
		element = driver.findElement(By.xpath(Constants.MYACCOUNT_SIGNOUT));
		return element;
	}
	
	public static void signOut(WebDriver driver) {
		WebElement element = myaccountDropdown(driver);
		Actions builder = new Actions(driver); 
		Actions hover = builder.moveToElement(element);
        hover.build().perform();
        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element1 =  myaccountSignout(driver);
		wait.until(ExpectedConditions.visibilityOf(element1));
		element1.click();
	}
}
