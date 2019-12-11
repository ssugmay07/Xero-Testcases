package Xero_Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_ID08_C {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssuga\\Documents\\tek Arch\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver;
		WebDriverWait wait;
		driver=new ChromeDriver();
		driver.get("https://login.xero.com/");
		System.out.println("ok");
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 5);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement UserName=driver.findElement(By.xpath("//input[@id='email']"));
		UserName.sendKeys("ssuganya.nirmal@gmail.com");
		WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("xerojune19");
		WebElement LoginButton=driver.findElement(By.xpath("//button[@id='submitButton']"));
		LoginButton.click();
		
		
		WebElement mainmenu1 = driver.findElement(By.xpath("//button[@class='xrh-button xrh-appbutton']"));
		mainmenu1.click();
		Thread.sleep(2000);

		WebElement MyZero = driver.findElement(By.xpath("//a[contains(text(),'My Xero')]"));
        MyZero.click();
        
        
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
		Thread.sleep(5000);
		
		 try
	     {
	       
	        WebElement AddOrg = driver.findElement(By.xpath("//a[@href='/!xkcD/Organisation/Setup'][@class='x-btn green']"));
	        System.out.println("ok");
	       

			//Actions AddOrgactions=new Actions(driver);
			//AddOrgactions.moveToElement(AddOrg).build().perform();
			AddOrg .click();
		       System.out.println("ok2");
	        Thread.sleep(5000); 
	        
	       System.out.println("ok");
	       Thread.sleep(2000);
	         
	          WebElement OrgName=driver.findElement(By.xpath("//input[@data-automationid='organisation-name--input'][@class='xui-textinput--input xui-textinput--input-medium']"));
	          //WebElement OrgCountry=driver.findElement(By.xpath("//div[@class='xui-autocompleter--trigger-focus']//div//div//button[@class='xui-button xui-button-xsmall']"));
	          //OrgCountry.click();
	          OrgName.sendKeys("self");
	          Thread.sleep(2000);
	          
	          WebElement OrgCountry=driver.findElement(By.xpath("//div[@class='xui-iconwrapper xui-iconwrapper-medium']"));
	          OrgCountry.click();
	          
	         // WebElement OrgCountryDropdown=driver.findElement(By.xpath("//li[@id='CNTRY/US']//button[@class='xui-pickitem--body']//span[@class='xui-pickitem--text']//span//strong[contains(text(),'United States')]"));
	         // OrgCountryDropdown.click();
	          Thread.sleep(2000);
	          
	          WebElement OrgTimeZone=driver.findElement(By.xpath("//div[3]//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//button[1]//div[1]"));
	          OrgTimeZone.click();   
	          Thread.sleep(2000);
	          
	          WebElement OrgTimeZoneDropdown=driver.findElement(By.xpath("//span[contains(text(),'(UTC-05:00) Eastern Time (US & Canada)')]"));
	          OrgTimeZoneDropdown.click();   
	          Thread.sleep(2000);
	          
	         WebElement OrgType=driver.findElement(By.xpath("//input[@data-automationid='industry-autocompleter--input'][@class='xui-autocompleter--textinput xui-textinput--input xui-textinput--input-medium']"));
	         OrgType.sendKeys("Accounting");
	        
	          Thread.sleep(2000);
	          driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	          List<WebElement> Suggestion =driver.findElements(By.className("xui-pickitem--text"));
	          for(WebElement suggest:Suggestion)
	          {
	        	  //System.out.println(suggest.getText());
	          
	        	  
	        	  if(suggest.getText().equals("Accounting Services"))
	        	  {
	        		  suggest.click();
	        		  break;
	        	  }
	          }
	       
	          Thread.sleep(3000);
	          WebElement BuyNowButton=driver.findElement(By.xpath("//button[@class='xui-button xui-actions--secondary xui-button-standard xui-button-medium']"));
	          BuyNowButton.click();
	           }
	        catch(Exception a)
			{
				a.printStackTrace();
				
			}
		 
		 Thread.sleep(3000);
	     
		 WebElement EarlyPlan=driver.findElement(By.xpath("//section[@id='Early']//div[@class='xui-styledcheckboxradio--radio']"));
		 EarlyPlan.click();
		 Thread.sleep(3000);
		 
		 
		 WebElement ContinueButton =driver.findElement(By.xpath("//span[contains(text(),'Continue to Select Billing Account')]"));
		 ContinueButton.click();
		 Thread.sleep(3000);
		 
		 
		 WebElement POBox=driver.findElement(By.xpath("//input[@id='contactAddress']"));
		 POBox.sendKeys("sssss");
		 Thread.sleep(2000);
		 
		 
		 
		 WebElement Town=driver.findElement(By.xpath("//input[@id='contactCity']"));
		 Town.sendKeys("ccccc");
		 Thread.sleep(2000);
		 
		 WebElement State=driver.findElement(By.xpath("//div[@id='postalAddress']//div[@class='xui-field-layout dropdown-wrapper']"));
		 State.click();
		 
		 WebElement StateDropdown=driver.findElement(By.xpath("//span[contains(text(),'California')]"));
		 StateDropdown.click();
		 
		 WebElement zipcode=driver.findElement(By.xpath("//input[@id='contactPostalCode']"));
		 zipcode.sendKeys("12345");
		 Thread.sleep(2000);
		 
		 WebElement ContinueToButton=driver.findElement(By.xpath("//button[@class='xui-button xui-actions--primary xui-button-main']"));
		 ContinueToButton.click();
		 Thread.sleep(2000);
		 
		 WebElement creditcardButton=driver.findElement(By.xpath("//span[contains(text(),'Credit Card')]"));
		 creditcardButton.click();
		 Thread.sleep(2000);
		 
		 driver.switchTo().frame("__privateStripeFrame7");
		 
		 //WebElement
	}

}
