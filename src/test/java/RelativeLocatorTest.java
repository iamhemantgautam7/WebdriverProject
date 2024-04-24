import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorTest {

	public static void main(String[] args) {


		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("115");
//		options.addArguments("--headless"); 
//		options.addArguments("--blink-settings=imagesEnabled=false"); // this will disable the images from page
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://automationbookstore.dev/");
		
		String strid= driver.findElement(with(By.tagName("li"))
				.toLeftOf(By.id("pid6"))
				.below(By.id("pid1"))).getAttribute("id");
		
		System.out.println(strid);
		
		
			///html/body/main/div[2]/div/div/div[3]/div[2]/form/div/div[2]/div[1]/div/span[1]
		///div/my-paragraph[1]/span

	}

}
