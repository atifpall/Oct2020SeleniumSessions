package seleniumFirstProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/atifpall/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		WebElement element = driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult"));
		Select select = new Select(element);
		select.selectByValue("5");
		select.selectByIndex(4);
		String text= driver.findElement(By.cssSelector("#divpaxinfo")).getText();
		System.out.println(text);
		driver.close();
		
		
	}

}
