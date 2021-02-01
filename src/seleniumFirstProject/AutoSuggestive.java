package seleniumFirstProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/atifpall/Desktop/Softwares/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement from=driver.findElement(By.cssSelector("#fromPlaceName"));
		from.click();
		from.sendKeys("BENG");
		Thread.sleep(3000);
		from.sendKeys(Keys.DOWN);
		
		
	    JavascriptExecutor js= (JavascriptExecutor) driver;
	    String script= "return document.getElementById(\"fromPlaceName\").value;";
	    String text= (String) js.executeScript(script);
	    System.out.println(text);
	    int i=0;
	    
	    while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")) 
	    {
	    	i++;
	    	from.sendKeys(Keys.DOWN);
	    	text= (String) js.executeScript(script);
	 	    System.out.println(text);
	 	    
	 	    if(i>10) {
	 	    	break;
	 	    	}
	    }
	 	    if(i>10) 
	 	    {
	 	    	System.out.println("element not found");
	 	    }
	 	    else 
	 	    {
	 	    	System.out.println("element found");
	 	    }
	 	    Thread.sleep(2000);
	    	driver.close();
	    }
	}


