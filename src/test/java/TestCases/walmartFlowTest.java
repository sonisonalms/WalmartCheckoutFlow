package TestCases;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageClasses.CheckOutPage;
import PageClasses.HomePage;
import PageClasses.MyAccountPage;
import PageClasses.ProductListPage;
import PageClasses.SignInPage;
import Utility.Constants;

public class walmartFlowTest {
	
	public String baseURL;
	public WebDriver driver;
	
	@Before
	public void setup(){
		baseURL= Constants.WALMART_COM;
		//System.setProperty("webdriver.chrome.driver", "chromedriver");
		//driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void testWalmartcheckout(){
		driver.get(baseURL);
		HomePage.search(driver).sendKeys(Constants.SEARCH_INPUT_VALUE);
		HomePage.searchButton(driver).click();
		timeout(5);
		ProductListPage.shopNow(driver).click();
		
		WebElement colorSelection = ProductListPage.colorSelection(driver);
		timeoutExpediteElement(colorSelection, driver, 5);
		colorSelection.click();
		
		WebElement flyOutCloseElement = ProductListPage.flyOutClose(driver);
		flyOutCloseElement.click();

		CheckOutPage.addToCart(driver).click();
		timeout(5);
		CheckOutPage.viewCart(driver).click();	
		timeout(5);
		MyAccountPage.myaccountDropdown(driver).click();

		WebElement signInElement = SignInPage.emailText(driver);
		signInElement.sendKeys(Constants.EMAIL);
		timeout(5);
		SignInPage.passwordText(driver).sendKeys(Constants.PASSWORD);
		timeout(5);
		SignInPage.signinButton(driver).click();
		timeout(5);
		//ShippingPage.shippingOptionOne(driver).click();
		CheckOutPage.topCart(driver).click();
		timeout(5);
		//CheckOutPage.removeCart(driver).click();
		//timeout(5);
		MyAccountPage.myaccountDropdown(driver).click();
		timeout(2);
		//MyAccountPage.myaccountDropdown(driver).click();
		//timeout(2);
		//MyAccountPage.myaccountAccount(driver).click();
		//timeout(5);
		//MyAccountPage.myaccountSignout(driver).click();
		driver.get(Constants.MYACCOUNT_LOGOUT);
		//MyAccountPage.signOut(driver);
	}
	
	public void timeout(int seconds){
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	
	public void timeoutExpediteElement(WebElement element, WebDriver driver, int seconds){
		WebElement colorSelection = ProductListPage.colorSelection(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
}
