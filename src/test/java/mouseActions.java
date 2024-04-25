import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class mouseActions {

	public static void main(String[] args) throws InterruptedException {


		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("115");
	//	options.addArguments("--headless");  
	//	options.addArguments("--blink-settings=imagesEnabled=false"); // this will disable the images from page
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https:demo.opencart.com");
		
		
		/*
		Actions actions=new Actions(driver);
		
		
		WebElement srcBox=driver.findElement(By.name("search"));
		WebElement menu=driver.findElement(By.cssSelector("ul.nav.navbar-nav > li:nth-child(3)"));
		actions.moveToElement(menu).perform();
		
		WebElement menuitem=driver.findElement(By.xpath("//ul[@class='list-unstyled']//a[contains(text(), 'Monitors (2)')]"));
		actions.moveToElement(menu).click(menuitem).build().perform();
		
*/
		driver.get("https://www.stqatools.com/demo/DoubleClick.php");
		
	//	Thread.sleep(5000);
		Actions actions=new Actions(driver);
		
		WebElement btn =driver.findElement(By.xpath("//button[normalize-space()='Click Me / Double Click Me!']"));
		actions.doubleClick(btn).perform();
		
	}

}
