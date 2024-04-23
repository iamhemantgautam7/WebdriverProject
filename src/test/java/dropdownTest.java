import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropdownTest {

	public static void main(String[] args) {


		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("115");
//		options.addArguments("--headless"); 
//		options.addArguments("--blink-settings=imagesEnabled=false"); // this will disable the images from page
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		
		Select singSel=new Select(driver.findElement(By.id("select-demo")));
		singSel.selectByValue("Tuesday");
		
		Select mulSel =new Select(driver.findElement(By.id("multi-select")));
		if(mulSel.isMultiple()) {
			mulSel.selectByIndex(0);
			mulSel.selectByValue("Florida");
			mulSel.selectByVisibleText("Washington");
			
			}
		
		List <WebElement> items=mulSel.getAllSelectedOptions();
		System.out.println("Items Seleccted ="+items.size());
		mulSel.deselectByValue("Florida");
		
		for(WebElement cells:items) {
			System.out.println(cells.getText());
			
		}

	}

}
