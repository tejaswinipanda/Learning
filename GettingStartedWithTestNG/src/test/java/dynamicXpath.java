import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicXpath {

	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hisah\\Desktop\\Tejaswini\\Maven\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://half.ebay.com");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);  
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);   
		
		//get the total  count of links
		//get the text of each link on the page
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count = links.size();
		System.out.println("total number of links are "+ count);
		
		for (int i=0; i<count; i++){
			System.out.println(links.get(i).getText());
			
		}
			
		
		driver.quit();

	}

}
