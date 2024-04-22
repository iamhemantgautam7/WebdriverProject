


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTableTest {

	public static void main(String[] args) {


		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("115");
	//	options.addArguments("--headless");  
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		
	//	WebElement valueOfWag= driver.findElement(By.xpath("//td[text()='B. Wagner']//following-sibling::td[5]"));
	//	System.out.println("Value is= "+ valueOfWag.getText());
		
		
		/*List <WebElement> items= driver.findElements(By.xpath("//td[text()='San Francisco']//following-sibling::td"));
		System.out.println("Number of items :"+items.size() );
		for(WebElement cell:items) {
		System.out.println(cell.getText());
		}
		
		System.out.println("-------------------------------");*/
		
		
		List <WebElement> items1= driver.findElements(By.xpath("//td[text()='San Francisco']//preceding-sibling::td[2]"));
		System.out.println("Number of items :"+items1.size() );
		
		
		for(WebElement cell:items1) {
			
		System.out.println(cell.getText());
		
		
		}
		
		
	}

}
