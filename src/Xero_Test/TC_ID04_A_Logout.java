package Xero_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_ID04_A_Logout {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssuga\\Documents\\tek Arch\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://login.xero.com/");
		Thread.sleep(2000);
		WebElement UserName=driver.findElement(By.xpath("//input[@id='email']"));
		UserName.sendKeys("ssuganya.nirmal@gmail.com");
		WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("xerojune19");
		WebElement LoginButton=driver.findElement(By.xpath("//button[@id='submitButton']"));
		LoginButton.click();
		
		//Logout//
		
		WebElement UserNamelink=driver.findElement(By.xpath("//abbr[@class='xrh-avatar xrh-avatar-color-9']"));
		UserNamelink.click();
		
		WebElement Logout=driver.findElement(By.xpath("//div[@class='xrh-dropdown-layout xrh-addon--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionright']//a[@class='xrh-verticalmenuitem--body'][contains(text(),'Log out')]"));
		Logout.click();
		
		
		
	}
}