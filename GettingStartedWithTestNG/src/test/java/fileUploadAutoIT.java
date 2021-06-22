import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileUploadAutoIT {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		/*driver.get("https://smallpdf.com/pdf-to-jpg");
		driver.findElement(By.xpath("//*[@class='l3tlg0-0 hrcxSS']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\hisah\\Documents\\AutoIt\\FileUploadPdf.exe");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@name='tool_options']")).click();
		driver.findElement(By.xpath("//*[@class='sc-11drgl3-0 sc-1az4ycp-0 cVkIfg']")).click();
		*/
		driver.get("https://smallpdf.com/result#r=9b0a4374bd25dfd39664b3267a5efae2&t=extract");
		driver.findElement(By.xpath("//*[@class='l3tlg0-6 dapZpN']"));

	}

}
