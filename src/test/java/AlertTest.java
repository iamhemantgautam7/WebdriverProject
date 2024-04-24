import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertTest {

	public static void main(String[] args) {


		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("115");
//		options.addArguments("--headless"); 
//		options.addArguments("--blink-settings=imagesEnabled=false"); // this will disable the images from page
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		
			
		//driver.findElement(By.xpath("(//button[contains(text(),'Click me!')])[2]")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'Click for Prompt')])[1]")).click();
		
		
		Alert alert=driver.switchTo().alert();
		//alert.accept();
		//alert.dismiss();
		alert.sendKeys("Hemant gautam");
		alert.accept();

	}

}
