package Xero_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_ID03_TestAllTabs {

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
		
		WebElement DashboardTab=driver.findElement(By.xpath("//a[@class='xrh-focusable xrh-tab--body xrh-tab--body-is-selected']"));
		Actions DashboardTabaction = new Actions(driver);
		DashboardTabaction.moveToElement(DashboardTab).build().perform();
		DashboardTab.click();
		
		WebElement AccountsTab=driver.findElement(By.xpath("//button[contains(text(),'Accounting')]"));
		//Actions AccountsTabaction = new Actions(driver);
		//AccountsTabaction.moveToElement(AccountsTab).build().perform();
		AccountsTab.click();
		
		WebElement BusinessTab=driver.findElement(By.xpath("//button[contains(text(),'Business')]"));
		BusinessTab.click();
		
		WebElement ContactsTab=driver.findElement(By.xpath("//button[contains(text(),'Contacts')]"));
		ContactsTab.click();
		Thread.sleep(5000);
		WebElement mainmenu = driver.findElement(By.xpath("//button[@class='xrh-button xrh-appbutton']"));
		mainmenu.click();

		WebElement settingsLink = driver.findElement(By.xpath("//a[contains(text(),'Settings')]"));
		settingsLink.click();
		Thread.sleep(3000);
		
		WebElement PlusButton = driver.findElement(By.xpath("//li[1]//button[1]//div[1]"));
		//Actions PlusButtonaction = new Actions(driver);
		//PlusButtonaction.moveToElement(PlusButton).build().perform();
		PlusButton.click();
		Thread.sleep(3000);
		
		WebElement mainmenu1 = driver.findElement(By.xpath("//button[@class='xrh-button xrh-appbutton']"));
		mainmenu1.click();

		WebElement File = driver.findElement(By.xpath("//a[contains(text(),'Files')]"));
		File.click();
		Thread.sleep(3000);
		
		WebElement Notifications= driver.findElement(By.xpath("//li[3]//button[1]//div[1]"));
		Notifications.click();
		Thread.sleep(3000);
		
		WebElement Search=driver.findElement(By.xpath("//button[@title='Search']"));
		Search.click();
		Thread.sleep(3000);
		
		WebElement Help=driver.findElement(By.xpath("//li[4]//button[1]//div[1]"));
		Help.click();
		Thread.sleep(3000);
		
		
		
		
		
		
	}

}
