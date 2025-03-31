package Stad.First_Maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//browser setup
    WebDriverManager.chromedriver().setup();
    //open browser
    WebDriver driver= new ChromeDriver();
    // open google
    //driver.get("https://www.google.com/");
    // find element
   //WebElement textbox= driver.findElement(By.id("APjFqb"));
   // WebElement textbox=driver.findElement(By.className("gLFyf"));
    //WebElement textbox=driver.findElement(By.tagName("textarea"));
    //By linktext
  // driver.findElement( By.linkText("Business")).click();
   //partial link text
   //driver.findElement(By.partialLinkText("How Search")).click();
   //textbox.sendKeys("Selenium");

   // CSS Selector by tag name
   driver.get("https://www.amazon.com.au/");
  //WebElement searchBox= driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
   //tag.class
  // WebElement searchBox= driver.findElement(By.cssSelector("input.nav-input"));
   //WebElement searchBox= driver.findElement(By.cssSelector("input[placeholder=\"Search Amazon.com.au\"]"));
 // xpath
 //  WebElement searchBox= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/input[1]"));

// Relative x patch 
  // WebElement searchBox= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
   
   //Relative xpath with attribute
   WebElement searchBox= driver.findElement(By.xpath("//input[@name=\"field-keywords\"]"));


  searchBox.sendKeys("mobile");
  
  // WebElement button=driver.findElement(By.name("btnK"));
  // button.click();
   driver.findElement(By.name("btnK")).submit();
   driver.close();
   
	}

}
