import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;

public class JSExecuterTest {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
//		options.setBrowserVersion("115");
//		options.addArguments("--headless"); 
//		options.addArguments("--blink-settings=imagesEnabled=false"); // this will disable the images from page
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://ecommerce-playground.lambdatest.io/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		String strTitle =(String) js.executeScript("return document.title");
		System.out.println(strTitle);
		WebElement  searchBox=(WebElement)js.executeScript("return document.getElementsByName('search')[0]");
		
		searchBox.sendKeys("Phone");
		driver.findElement(By.cssSelector("button.type-text")).click();
		js.executeScript("history.go(-1)");
		js.executeScript("window.scrollBy(10,700)");
		js.executeScript("window.scrollBy(10, document.body.scrollHeight)");
		
		//https://ecommerce-playground.lambdatest.io/
		
		
		
		
		

		
	}

}
