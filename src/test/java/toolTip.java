import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class toolTip {

	public static void main(String[] args) {


		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("115");
//		options.addArguments("--headless"); 
//		options.addArguments("--blink-settings=imagesEnabled=false"); // this will disable the images from page

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");
		
		Actions action=new Actions(driver);
		
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		
		driver.findElement(By.id("age")).sendKeys(Keys.ARROW_DOWN);
		
		action.moveToElement(driver.findElement(By.id("age"))).perform();
		
		String strTxt=driver.findElement(By.className("ui-tooltip-content")).getText();
		System.out.println("Tooltip text is.."+strTxt);
		
		
		WebElement age=driver.findElement(By.id("age"));
		age.sendKeys("20");
		
		
		
		
		
		
	}

}
