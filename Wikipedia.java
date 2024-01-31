package task16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Wikipedia {

				public static void main(String[] args) {
					
				//Using Edge Browser Instead of Chrome 
				WebDriver driver = new EdgeDriver();
					
				//Maximizing the window 
				driver.manage().window().maximize(); 
			
				//Navigating the URL
				driver.navigate().to("https://www.wikipedia.org/");
				
				//Searching for the text using sendKeys and Enter
				driver.findElement(By.id("searchInput")).sendKeys("Artificial intelligence" ,Keys.ENTER);   
				
				//Searching for the history
				driver.findElement(By.id("toc-History")).click();
				 
				// For Printing the title 
				String title = driver.findElement(By.id("toc-History")).getText();
				
				//Printing the title
				System.out.println("Title of the section: " +title);  
				
				//Closing the driver
				driver.close(); 
				 
	}

}
