package seleniumFirstProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/atifpall/Desktop/Softwares/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("fromCity")).click();
		WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));
		source.sendKeys("MUM");
		source.sendKeys(Keys.ARROW_DOWN);
        source.sendKeys(Keys.ENTER);
        WebElement dest = driver.findElement(By.xpath("//input[@placeholder='To']"));
        dest.sendKeys("DEL");
        Thread.sleep(3000);
        dest.sendKeys(Keys.ARROW_DOWN);
        dest.sendKeys(Keys.ENTER);
       
  
		
		
		driver.quit();

	}

}
