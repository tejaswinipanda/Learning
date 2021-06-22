
import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class screenShot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hisah\\Desktop\\Tejaswini\\Maven\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);  
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.get("https://www.google.com");
		
		//File src = ((TakesScreenshot).driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(src, new File("C:\\Users\\hisah\\Desktop\\Tejaswini\\screen shot"));
		 
		 Screenshot scr = new AShot().takeScreenshot(driver);
		 
		 Screenshot scr = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		 ImageIO.write(scr.getImage(), "jpg", new File(".\\screenshot\\fullimage.jpg"));
		
		/*TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(fileWithPath);
		 FileUtils.copyFile(SrcFile, DestFile);*/
		 
		 
		/*File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Object FileUtils;
		((Object) FileUtils).copyFile(src, new File(""));*/
		
		
		
	}

}
