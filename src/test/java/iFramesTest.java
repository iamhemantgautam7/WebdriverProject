import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class iFramesTest {

	public static void main(String[] args) {


		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("115");
//		options.addArguments("--headless"); 
//		options.addArguments("--blink-settings=imagesEnabled=false"); // this will disable the images from page

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

		driver.switchTo().frame("frame1");
		WebElement inpBox= driver.findElement(By.xpath("//input[@type='text']"));
		inpBox.sendKeys("Hello Welcome");
		
		//from frame1 to frame3
		//driver.switchTo().frame("frame3");
		driver.switchTo().frame(0);
				
		driver.findElement(By.id("a")).click();
		
		//from frame3 to frame1
		driver.switchTo().parentFrame();
		inpBox =driver.findElement(By.xpath("//input[@type='text']"));
		inpBox.clear();
		inpBox.sendKeys("Welcome Back");
		//or can use below
		
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//label//span")).getText());
		
		
		driver.switchTo().frame("frame2");
		WebElement dropDwn=driver.findElement(By.id("animals"));
		
		Select select=new Select(dropDwn);
		select.selectByValue("babycat");
		
		}

}
