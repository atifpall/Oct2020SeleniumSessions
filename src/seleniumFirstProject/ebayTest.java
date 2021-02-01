package seleniumFirstProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebayTest

{

public static void main(String[] args) throws InterruptedException

{

/* In this example we are going to check different links for specially footer

* Also after navigating to any of the footer element, we will also verfy

* if that page is successfully getting opened or not

*/

	System.setProperty("webdriver.chrome.driver", "/Users/atifpall/Desktop/Softwares/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();

//System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.20.1-win64\\geckodriver.exe");

//WebDriver driver = new FirefoxDriver();

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);       

// Now we will open site. www.ebay.com

driver.get("https://www.ebay.com/");

// We need to navigate to "Site map" option in the footer

// We will print title and then navigate to "Site map"

// But before that we will create one WebElement from the footer

Thread.sleep(4000);

// Title prior to clicking,

String Title1 = driver.getTitle();

System.out.println(Title1);

// Now click Site map & get the title
WebElement Footer1 = driver.findElement(By.xpath("//div[@id='gf-BIG']//table//tbody//tr//td[2]/ul"));
Footer1.findElement(By.xpath("//a[@href='https://pages.ebay.com/sitemap.html']")).click();

Thread.sleep(4000);

String Title2 = driver.getTitle();

System.out.println(Title2);

Thread.sleep(4000);

// Now we will validate title

if (Title1.equals(Title2))

{

  // Print for correct feedback

    System.out.println("PASS");

}

else {

    System.out.println("FAIL");

} 

driver.close();

}

}

