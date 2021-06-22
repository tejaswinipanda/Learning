import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicWebTableHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hisah\\Desktop\\Tejaswini\\Maven\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys("test");
		List<WebElement> list =driver.findElements(By.xpath("//*[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
		System.out.println(list.size());
		for(int i=0;1<=list.size();i++) {
		if(list.get(i).getText().equals("testing")) {
			list.get(i).click();
			break;
			
		}
		}
		
		//driver.quit();

	}

}
