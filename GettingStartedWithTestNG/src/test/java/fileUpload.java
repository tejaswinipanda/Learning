import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hisah\\Desktop\\Tejaswini\\Maven\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\hisah\\Pictures\\Avni creativity.png");
		
		
	}

}
