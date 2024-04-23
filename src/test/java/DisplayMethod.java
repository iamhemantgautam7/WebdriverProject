import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisplayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("115");
//		options.addArguments("--headless");  
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://automationbookstore.dev/");
		
		driver.findElement(By.id("searchBar")).sendKeys("Test");
		String strplaceholder =driver.findElement(By.id("searchBar")).getAttribute("placeholder");
		System.out.println(strplaceholder);
		
		WebElement closeIcon=driver.findElement(By.cssSelector("a[title='Clear text']"));
				System.out.println(closeIcon.isDisplayed());
				
				if(closeIcon.isDisplayed()) {
					closeIcon.click();
					
				}

	}

}
