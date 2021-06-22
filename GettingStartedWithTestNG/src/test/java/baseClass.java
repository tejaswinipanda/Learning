import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DataProvider.ConfigFileReader;

public class baseClass extends ConfigFileReader{
	
	static WebDriver driver;

	static ConfigFileReader configFileReader= new ConfigFileReader();	
		protected static WebDriver launchBrowser() {
			
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hisah\\Desktop\\Tejaswini\\Maven\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",configFileReader.getDriverPath());
		driver=new ChromeDriver();	
		return driver;
			
	}
		
		protected static void navigateToPage() {		
			
			driver.get(configFileReader.getApplicationUrl()); 						
		}
		
		protected static void closeBrowser() {
			driver.quit();
			
		}


	}


