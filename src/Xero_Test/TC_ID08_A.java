package Xero_Test;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_ID08_A {


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
		// Thread.sleep(5000);


		//WebElement AddOrg = driver.findElement(By.xpath("//a[@href='/!xkcD/Organisation/Setup'][@id='ext-gen1042']"));
		// WebElement AddOrg = driver.findElement(By.partialLinkText("Add an organizati")	);

		try
		{

			//WebElement AddOrg = driver.findElement(By.cssSelector("#ext-gen1042"));
			WebElement AddOrg = driver.findElement(By.xpath("//a[@href='/!xkcD/Organisation/Setup'][@class='x-btn green']"));
			System.out.println("ok");


			//Actions AddOrgactions=new Actions(driver);
			//AddOrgactions.moveToElement(AddOrg).build().perform();
			AddOrg .click();
			System.out.println("ok2");
			Thread.sleep(5000);  


			//WebDriverWait wait = new WebDriverWait(driver, 100);
			//AddOrg= wait.until(ExpectedConditions.elementToBeClickable(By.id("usrUtils")));

			//WebElement myDynamicElement = 
			//	(new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("usrUTils")));

			//WebElement ON=driver.findElement(By.cssSelector("body.xui-body.xui-background-white:nth-child(2) div.xui-page-width-standard.xui-u-flex.xui-u-flex-justify-center.padding-top-large__2ARN9 div.margin-bottom-large__3eVb7.xui-panel div.panel-width-max__3nkEZ.xui-panel--section form.xui-form-layout div.xui-field-layout:nth-child(2) div.xui-textinputwrapper > div.xui-textinput.xui-textinput-medium"));
			//ON.click();

			System.out.println("ok");
			Thread.sleep(2000);

			//WebElement OrgName=driver.findElement(By.xpath("//input[@class='xui-textinput--input xui-textinput--input-medium'][@id='6b16e8f2-a229-4895-945a-d30bc63079a7-control']"));
			// WebElement OrgName=driver.findElement(By.id("6b16e8f2-a229-4895-945a-d30bc63079a7-control"));
			// WebElement OrgName=driver.findElement(By.cssSelector("#6b16e8f2-a229-4895-945a-d30bc63079a7-control"));
			//WebElement OrgName=driver.findElement(By.className("xui-textinput--input xui-textinput--input-medium"));
			// WebElement OrgName=driver.findElement(By.xpath("//input[@id='7e11ba89-0049-4136-ae9b-934cd69a60c4-control']"));

			//Actions OrgNameactions=new Actions(driver);
			//OrgNameactions.moveToElement(OrgName).build().perform();

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
			//Actions OrgTypeaction=new Actions(driver);
			//OrgTypeaction.moveToElement(OrgType).build().perform();
			OrgType.sendKeys("Accounting");
			// OrgType.click();*/
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

			/* try {



            //WebElement OrgType = driver.findElement(By.xpath("//input[@data-automationid='industry-autocompleter--input'][@class='xui-autocompleter--textinput xui-textinput--input xui-textinput--input-medium']"));
        	  WebElement OrgType = driver.findElement(By.xpath("//input[@id='90813d9c-5f27-4d2b-b992-a1ba48c119a3-control']"));
            System.out.println("ok");
  			wait.until(ExpectedConditions.visibilityOf(OrgType));

  			List<WebElement> optionsToSelect = OrgType.findElements(By.tagName("li"));
  			for(WebElement option : optionsToSelect){
  		        if(option.getText().equals("Accounting Practice")) {
  		        	System.out.println("Trying to select: "+"Accounting Practice");
  		            option.click();
  		            break;
  		        }
  		    }
          }
  			catch (NoSuchElementException e) {
  				System.out.println(e.getStackTrace());
  			}
  			catch (Exception e) {
  				System.out.println(e.getStackTrace());
  			}*/


			// WebElement OrgTypeVal=driver
			//Thread.sleep(2000);

			WebElement StartTrailButton=driver.findElement(By.xpath("//button[@class='xui-button xui-actions--primary xui-actions--button-spacing xui-button-main xui-button-medium']"));
			StartTrailButton.click();





		}
		catch(Exception a)
		{
			a.printStackTrace();

		}

		/*Thread.sleep(2000);
        WebElement OrgName=driver.findElement(By.xpath("//div[@class='xui-textinput xui-textinput-medium'][@data-automationid='organisation-name']"));
        Actions OrgNameactions=new Actions(driver);
        OrgNameactions.moveToElement(OrgName).build().perform();
        OrgName.sendKeys("Self");*/



	}

}
