import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chkRadioButtn {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("115");
//		options.addArguments("--headless"); 
//		options.addArguments("--blink-settings=imagesEnabled=false"); // this will disable the images from page
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		WebElement age=driver.findElement(By.id("isAgeSelected"));
		
		System.out.println(age.isSelected());
		
		if(!age.isSelected()) {
			
			age.click();
			
		}
		
		//radio button
		driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		driver.findElement(By.xpath("//input[@value='5 - 15']")).click();
		

	}

}
