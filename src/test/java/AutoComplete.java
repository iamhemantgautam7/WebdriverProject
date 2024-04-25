import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {


		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("115");
//		options.addArguments("--headless"); 
//		options.addArguments("--blink-settings=imagesEnabled=false"); // this will disable the images from page

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/autocomplete");
		
		WebElement frame1=driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(frame1);
				
		WebElement inp=driver.findElement(By.id("tags"));
		inp.sendKeys("as");
		Thread.sleep(2000);
		List<WebElement> items =driver.findElements(By.cssSelector("ul#ui-id-1>li"));
		System.out.println("number of matching items are..."+items.size());
		
		for(WebElement item:items) {
			
		System.out.println(item.getText());
		
		if(item.getText().equalsIgnoreCase("Haskell")) {
			item.click();
			break;
			}
			
		}
		

	}

}
