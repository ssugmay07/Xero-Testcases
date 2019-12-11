package Xero_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_ID02_D_Validate_Fulloffer {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssuga\\Documents\\tek Arch\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.xero.com/us/");
		Thread.sleep(2000);
		WebElement FreeTrailButton=driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
		FreeTrailButton.click();
		Thread.sleep(2000);
		
		WebElement OfferDetails=driver.findElement(By.xpath("//a[contains(text(),'offer details')]"));
		OfferDetails.click();

	}

}
