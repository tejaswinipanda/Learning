import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;

public class implicitWait {

	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hisah\\Desktop\\Tejaswini\\Maven\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://half.ebay.com");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);  
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);   
		 								
		 	
		 
		 driver.quit();
		
	}

}
