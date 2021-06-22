import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowPopupHendle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hisah\\Desktop\\Tejaswini\\Maven\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://half.ebay.com");
		driver.findElement(By.xpath(""));
		
		Set<String> handler= driver.getWindowHandles();
		
		Iterator <String> it = handler.iterator();
		String parentWindowId = it.next();
		System.out.println("Parent Window Id is"+parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("Parent Window Id is"+childWindowId);
		driver.switchTo().window(childWindowId);
		
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		
		
		
			
	}

}
