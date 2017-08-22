import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//This is a program to test the ui of build.com//
		//in this test we are going to purchase certain items from the website and check for the correct total//
		//This test is entirely automated by using Selenium jars and we will also try to automate it using//
		//Appium for mobile browers and also try to run it on different browser by starting with the firefox browser first.//
		
public class Ui {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:/New folder/geckodriver.exe");
		//First Iam going to initialize the webdriver by using Firefox driver//
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.build.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    Actions enter = new Actions(driver);
	    enter.sendKeys(Keys.ESCAPE).perform();
		driver.findElement(By.id("search_txt")).sendKeys("Suede Kohler K-6626-");
		enter.moveToElement(driver.findElement(By.xpath(".//*[@id='site-search']/div/button"))).click().build().perform();
        driver.findElement(By.xpath(".//*[@id='product-composite-563763']/div[2]/a/div[2]/span")).click();
         WebDriverWait d = new WebDriverWait (driver,25);
         d.until(ExpectedConditions.visibilityOfElementLocated((By.id("newsletter-modal"))));
         enter.sendKeys(Keys.ESCAPE).perform();
         driver.findElement(By.xpath(".//*[@id='configure-product-wrap']/button")).click();
         driver.findElement(By.id("search_txt")).sendKeys("Suede Kohler K-6626-4K");
         enter.moveToElement(driver.findElement(By.xpath(".//*[@id='site-search']/div/button"))).click().build().perform();
         driver.findElement(By.xpath(".//*[@id='product-composite-563763']/div[2]/a/div[2]/span")).click();
         driver.findElement(By.xpath(".//*[@id='configure-product-wrap']/button")).click();
         driver.findElement(By.id("search_txt")).sendKeys("Kohler K-5180-ST ");
         enter.moveToElement(driver.findElement(By.xpath(".//*[@id='site-search']/div/button"))).click().build().perform();
         driver.findElement(By.xpath(".//*[@id='product-composite-563763']/div[2]/a/div[2]/span")).click();
         driver.findElement(By.xpath(".//*[@id='configure-product-wrap']/button")).click();
         driver.findElement(By.id("search_txt")).sendKeys("Kohler K-5180-ST ");
         enter.moveToElement(driver.findElement(By.xpath(".//*[@id='site-search']/div/button"))).click().build().perform();
         driver.findElement(By.xpath(".//*[@id='product-composite-563763']/div[2]/a/div[2]/span")).click();
         driver.findElement(By.xpath(".//*[@id='configure-product-wrap']/button")).click();
         driver.findElement(By.xpath(".//*[@id='header']/section[2]/div/div/div/a[2]/button")).click();
         driver.findElement(By.xpath(".//*[@id='page-content']/div[1]/div[1]/div/section[1]/div/div[3]/div[2]/div/a")).click();
         driver.findElement(By.xpath(".//*[@id='guest-login']/button")).click();
         driver.findElement(By.xpath(".//*[@id='shippingfirstname']")).sendKeys("Hozefa");
         driver.findElement(By.xpath(".//*[@id='shippinglastname']")).sendKeys("Rangwala");
         driver.findElement(By.xpath(".//*[@id='shippingaddress1']")).sendKeys("127,10th St");
         driver.findElement(By.xpath(".//*[@id='shippingpostalcode']")).sendKeys("11801");
         driver.findElement(By.xpath(".//*[@id='shippingcity']")).sendKeys("Hicksville");
         Select s = new Select(driver.findElement(By.id("shippingstate_1")));
         s.selectByValue("NY");
         driver.findElement(By.xpath(".//*[@id='shippingphonenumber']")).sendKeys("6166661234");
         driver.findElement(By.xpath(".//*[@id='emailAddress']")).sendKeys("hozefa123@gmail.com");
         driver.findElement(By.xpath(".//*[@id='creditCardNumber']")).sendKeys("4111111111111111");
         Select m = new Select(driver.findElement(By.id("creditCardMonth")));
         m.selectByValue("2");
         Select y = new Select(driver.findElement(By.id("creditCardYear")));
         y.selectByValue("2019");
         driver.findElement(By.id("creditCardYear")).sendKeys("Hozefa Rangwala");
         driver.findElement(By.id("creditCardCVV2")).sendKeys("1223");
         driver.findElement(By.xpath(".//*[@id='creditcard']/div[3]/input")).click();
         
         
         

         
        
        
	}

}
