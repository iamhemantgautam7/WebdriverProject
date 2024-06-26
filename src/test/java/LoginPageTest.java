

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPageTest {

	public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("115");
//		options.addArguments("--headless"); 
//		options.addArguments("--blink-settings=imagesEnabled=false"); // this will disable the images from page
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		
		//driver.findElement(By.name("username")).sendKeys("tomsmith");
		//driver.findElement(By.xpath("//input[@type='text' and @id='username']")).sendKeys("tomsmith");
		driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");   //this is for CSSselector
		//driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys("SuperSecretPassword!");
		
		
		//driver.findElement(By.className("radius")).click();  //this will also work
		driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
		//fa fa-2x fa-sign-in
		//driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();  //Relative xpath
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/form/button/i")).click();  //absolute xpath
		
		//driver.findElement(By.linkText("Elemental Selenium")).click();
		driver.findElement(By.partialLinkText("Elemental")).click();
		
		
		

	}

}
