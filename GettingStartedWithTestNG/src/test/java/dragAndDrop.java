import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public void drag() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hisah\\Desktop\\Tejaswini\\Maven\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		
		
		WebElement element = driver.findElement(By.xpath("//*[@id='draggable']"));
		(driver).executeScript("arguments[0].scrollIntoView(true);", element);
		
	  	Actions action=new Actions(driver);
			
		action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
		.moveToElement(driver.findElement(By.xpath("//*[@id='droppable']")))
		.release().build().perform();
		Thread.sleep(3000);
		
		
		//d..river.findElement(By.xpath())).mo
		
		
		driver.quit();
	}

}
