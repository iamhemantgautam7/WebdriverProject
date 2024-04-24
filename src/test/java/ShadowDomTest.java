import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ShadowDomTest {

	public static void main(String[] args) {


		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("115");
//		options.addArguments("--headless"); 
//		options.addArguments("--blink-settings=imagesEnabled=false"); // this will disable the images from page
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/shadowdom");
		WebElement shadowHost=driver.findElement(By.xpath("//my-paragraph[1]"));

		SearchContext context=shadowHost.getShadowRoot();
		WebElement txt=context.findElement(By.cssSelector("slot[name='my-text']"));
		System.out.println(txt.getText());
		
		String strTxt =driver.findElement(By.xpath("//span[contains(text(), 'different text!')]")).getText();
		System.out.println(strTxt);
		
	}

}
