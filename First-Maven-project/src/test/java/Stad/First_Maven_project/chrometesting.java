package Stad.First_Maven_project;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chrometesting 
{
	public static void main(String args[]) throws InterruptedException
	{
	 WebDriverManager.chromedriver();setup();
     WebDriver driver= new ChromeDriver();
     driver.get("https://www.google.com/");
     driver.manage().window().maximize();// to maximize the screen
     driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
     driver.navigate().back();
     driver.navigate().forward();
   //  driver.quit(); // to close the application automatically
   /*  
     // to check title of the page 
     String actualTitle = driver.getTitle();
     String expectedTitle ="Rahul Shetty Academy - Login page";
     if(actualTitle.equalsIgnoreCase(expectedTitle))
     {
    	 System.out.println("as expected");
     }
     else
     {
    	 System.out.println(" title not match ");

     }
     // to check url
     String actualURL= driver.getCurrentUrl();
     String expectedURL ="www.login.com";
     
     if(actualURL.equalsIgnoreCase(expectedURL))
     {
    	 System.out.println("as expected");
     }
     else
     {
    	 System.out.println("  url not match ");

     }
     
}
*/
     WebElement forgotpwd= driver.findElement(By.linkText("Forgot your password?"));
	forgotpwd.click();
/*	
    WebElement name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
    //name.click();
   name.sendKeys("stad");
   System.out.println("Entered 'stad' in the name field.");


	
	//Thread.sleep(2000);
	// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   // WebElement name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Name']")));
   // WebElement name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
*/
    try {
        WebElement name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
        name.click();
    	Thread.sleep(2000);
        name.sendKeys("stad");
       System.out.println("Entered 'stad' in the name field.");
    } catch (Exception e) {
        System.out.println("Failed to find the input field with placeholder 'Name'.");
        e.printStackTrace();
    }
   
   

	}
	//input[@placeholder='Name']
	// input[@placeholder='Name']
     private static void setup() {
		// TODO Auto-generated method stub
		
	}
}