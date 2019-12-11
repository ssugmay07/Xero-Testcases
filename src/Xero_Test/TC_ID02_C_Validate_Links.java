package Xero_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_ID02_C_Validate_Links {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssuga\\Documents\\tek Arch\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.xero.com/us/");
		Thread.sleep(2000);
		WebElement FreeTrailButton=driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
		FreeTrailButton.click();
		Thread.sleep(2000);
		WebElement TermsLink=driver.findElement(By.xpath("//a[contains(text(),'terms of use')]"));
		TermsLink.click();
		Thread.sleep(2000);
		
		
		String PrimaryWindow=driver.getWindowHandle();
		System.out.println("primary window :"+PrimaryWindow);
		String secondaryWindow="";
		for(String handle:driver.getWindowHandles())
		{
			System.out.println("No of handles :"+handle);
			if(handle!=PrimaryWindow) {
				secondaryWindow = handle;				
			}
		}
		
		driver.switchTo().window(secondaryWindow);
		

		WebElement FreeTrailButton1=driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
		
		System.out.println("ok");
		FreeTrailButton1.click();
		
		WebElement PrivacyLink=driver.findElement(By.xpath("//a[contains(text(),'privacy notice')]"));
		PrivacyLink.click();
		
		
		
		Thread.sleep(2000);
		
		
		
		
	}

}
