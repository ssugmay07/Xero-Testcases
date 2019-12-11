package Xero_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_ID06_UploadImage {

	private static RemoteWebDriver jse;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssuga\\Documents\\tek Arch\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://login.xero.com/");
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement UserName=driver.findElement(By.xpath("//input[@id='email']"));
		UserName.sendKeys("ssuganya.nirmal@gmail.com");
		WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("xerojune19");
		WebElement LoginButton=driver.findElement(By.xpath("//button[@id='submitButton']"));
		LoginButton.click();
		
		WebElement UserName1=driver.findElement(By.xpath("//abbr[@class='xrh-avatar xrh-avatar-color-9']"));
		UserName1.click();
		
		WebElement EditProfile1=driver.findElement(By.xpath("//span[@class='xrh-verticalmenuitem--subheading']"));
		EditProfile1.click();
		Thread.sleep(2000);
		
		WebElement UploadImage1=driver.findElement(By.xpath("//span[@id='button-1041-btnInnerEl']"));
		UploadImage1.click();
		
		Thread.sleep(2000);
		
		 
		//input[@id='filefield-1174-button-fileInputEl']		
		try {
	//	WebElement BrowseImage=driver.findElement(By.xpath("//input[@id='filefield-1174-button-fileInputEl'][@class='x-form-file-input'][@name='file']"));
			WebElement BrowseImage=driver.findElement(By.xpath("//input[@id='filefield-1174-button-fileInputEl']"));

			System.out.println("ok");
		//
		//Actions BrowseImageaction=new Actions(driver);
		//BrowseImageaction.moveToElement(BrowseImage).click().perform();
					
		WebDriverWait wait = new WebDriverWait(driver, 10);
		BrowseImage= wait.until(ExpectedConditions.elementToBeClickable(By.id("usrUtils")));
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("arguments[0].scrollIntoView()", BrowseImage); 
		//By loadingImage = By.id("loading image ID");

		//WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);

		//wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);", BrowseImage);
		BrowseImage.click();
		System.out.println("ok1");

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}

}
