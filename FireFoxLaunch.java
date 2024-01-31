package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FireFoxLaunch {

	public static void main(String[] args) {
		
		//Using Edge Browser Instead of Firefox 		
		WebDriver driver = new EdgeDriver();
		
		//Maximizing the window 
		driver.manage().window().maximize(); 
		
		//Navigating the URL
		driver.navigate().to("https://www.google.com/"); 
		
		//Using getCurrentUrl() method to get the URL
		String url= driver.getCurrentUrl();            
		
		//Printing the URL
		System.out.println("The Webpage Loaded from:");   
		System.out.println(url);
		
		//Reloading the page
		driver.navigate().refresh();                               
		
		//Closing the driver
		driver.close();                                      
		
	}

}
