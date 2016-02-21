package TestCases;

import org.testng.annotations.Test;

import PageClasses.CheckOutPage;
import PageClasses.HomePage;
import PageClasses.ProductListPage;
import Utility.Constants;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class walmartFlowTestng {
	public String baseURL;
	public WebDriver driver;
	
  @Test
  public void testWalmartcheckout() {
	  	driver.get(baseURL);
		HomePage.search(driver).sendKeys(Constants.SEARCH_INPUT_VALUE);
		HomePage.searchButton(driver).click();
		timeout(5);
		ProductListPage.shopNow(driver).click();
		timeout(5);
		ProductListPage.colorSelection(driver).click();
		timeout(5);
		ProductListPage.flyOutClose(driver).click();
		timeout(5);
		CheckOutPage.addToCart(driver).click();
		timeout(5);
		CheckOutPage.viewCart(driver).click();	
		timeout(5);
		CheckOutPage.checkoutCart(driver).click();
//		timeout(10);
//		SignInPage.emailText(driver).sendKeys(Constants.EMAIL);
//		SignInPage.passwordText(driver).sendKeys(Constants.PASSWORD);
//		SignInPage.signinButton(driver).click();
//		timeout(5);
//		//ShippingPage.shippingOptionOne(driver).click();
//		CheckOutPage.topCart(driver).click();
//		timeout(5);
//		CheckOutPage.removeCart(driver).click();
//		timeout(5);
//		MyAccountPage.myaccountDropdown(driver).click();
//		timeout(5);
//		MyAccountPage.myaccountAccount(driver).click();
//		timeout(5);
//		MyAccountPage.myaccountSignout(driver).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  baseURL= Constants.WALMART_COM;
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
  }
  
  public void timeout(int seconds){
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
  }

}
