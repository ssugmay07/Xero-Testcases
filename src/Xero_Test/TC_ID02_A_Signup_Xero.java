package Xero_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_ID02_A_Signup_Xero {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssuga\\Documents\\tek Arch\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.xero.com/us/");
		Thread.sleep(2000);
		WebElement FreeTrailButton=driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
		FreeTrailButton.click();
		Thread.sleep(2000);
		WebElement FirstName=driver.findElement(By.xpath("//input[@name='FirstName']"));
		FirstName.sendKeys("sss");
		WebElement LastName=driver.findElement(By.xpath("//input[@name='LastName']"));
		LastName.sendKeys("lll");
		WebElement EmailAddress=driver.findElement(By.xpath("//input[@name='EmailAddress']"));
		EmailAddress.sendKeys("ssuganya.nirmal@gmail.com");
		WebElement PhoneNumber=driver.findElement(By.xpath("//input[@name='PhoneNumber']"));
		PhoneNumber.sendKeys("0123456789");
		WebElement Country=driver.findElement(By.xpath("//select[@name='LocationCode']"));
		Select CountryDropdown=new Select(Country);
		CountryDropdown.selectByVisibleText("United States");
		
		WebElement TermsCheckbox=driver.findElement(By.xpath("//input[@name='TermsAccepted']"));
		TermsCheckbox.click();
		WebElement GetStartedButton=driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
		GetStartedButton.click();
		
	}

}
