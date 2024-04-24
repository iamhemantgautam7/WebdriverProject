import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopupWindowTest {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("115");
//		options.addArguments("--headless"); 
//		options.addArguments("--blink-settings=imagesEnabled=false"); // this will disable the images from page

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://stqatools.com/demo/Windows.php");

		String parentWin = driver.getWindowHandle();
		System.out.println("Parent Win : " + parentWin);

		WebElement tabBtn = driver.findElement(By.xpath("//button[contains(text(),'new Tab')]"));
		tabBtn.click();

		System.out.println("Page title: " + driver.getTitle());

		Set<String> tabs = driver.getWindowHandles();
		System.out.println("Number of Windows: " + tabs.size());

		for (String child : tabs) {
			System.out.println("Windows: " + child);
			if (!child.equalsIgnoreCase(parentWin)) {
				driver.switchTo().window(child);
				System.out.println("Child win Title...." + driver.getTitle());
			}
		}
		driver.close();
		driver.switchTo().window(parentWin);

		driver.findElement(By.xpath("//button[contains(text(),'new Window')]")).click();

		Set<String> wins = driver.getWindowHandles();
		System.out.println("Number of wins: " + wins.size());

		for (String win : wins) {
			System.out.println("Windows..." + win);
			if (!win.equalsIgnoreCase(parentWin)) {
				driver.switchTo().window(win);
				System.out.println("Win title..." + driver.getTitle());
			}

		}
		driver.close();
		driver.switchTo().window(parentWin);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.selenium.dev/");
		driver.quit();

	}

}
