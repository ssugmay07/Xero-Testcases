package Xero_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_ID01_D_Validate_Forgot_Pwd {

	public static void main(String[] args) throws InterruptedException {
		
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssuga\\Documents\\tek Arch\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://login.xero.com/");
		Thread.sleep(2000);
		WebElement ForgotPwdLink=driver.findElement(By.xpath("//a[@class='forgot-password-advert']"));
		ForgotPwdLink.click();
		Thread.sleep(2000);
		WebElement ForgotPwdUNText=driver.findElement(By.xpath("//input[@id='UserName']"));
		ForgotPwdUNText.sendKeys("ssuganya.nirmal@gmail.com");
		Thread.sleep(2000);
		WebElement SendLink=driver.findElement(By.xpath("//span[@class='text']"));
		SendLink.click();
		
		
		
	}

}
