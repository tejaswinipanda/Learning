import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseMovement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hisah\\Desktop\\Tejaswini\\Maven\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com/");
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_HyperLinkLogin']"))).build().perform();
		action.moveToElement(driver.findElement((By.xpath("//a[contains(text(),'SpiceClub Members')]")))).build().perform();
		driver.findElement(By.xpath("//*[@id=\"smoothmenu1\"]/ul/li[18]/ul/li[2]/ul/li[1]/a")).click();
		
		
		
		
		
		//action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		
		//driver.findElement(By.xpath("//a[contains(text(),'SpiceMAX')]")).click();
		Thread.sleep(3000);
		driver.quit();
		
	

	}

}
