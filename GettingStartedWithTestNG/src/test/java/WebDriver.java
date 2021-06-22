

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//import org.openqa.selenium.WebDriver;
public class WebDriver extends baseClass {
	
	
	public static void main(String[] args) {
		
		WebDriver driver =(WebDriver) launchBrowser();
		navigateToPage();
		closeBrowser();
	}

	

	

}
