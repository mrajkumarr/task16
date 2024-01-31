package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoBlaze {

	public static void main(String[] args) {

			//Using Edge Browser Instead of Chrome 
			WebDriver driver = new EdgeDriver();
			
			//Maximizing the window 
			driver.manage().window().maximize(); 
			
			//Navigating the URL
			driver.navigate().to("https://www.demoblaze.com/"); 
			///driver.navigate().to("https://www.google.com/"); 
			
			//Using getTitle() method to get the title
			String sitetitle = driver.getTitle();    
			
			//Printing the title of the website
			System.out.println("The website title is: ");
			System.out.println(sitetitle);
			
			//Validating the title
			if(sitetitle.equals("STORE")) 
			{                                  
				System.out.println("Page landed on correct website");     //Printing if it land on correct page
			} 
			else 
			{
				System.out.println("Page not landed on the correct website");  //Printing if its not landed on correct page
			}

			//Closing the driver
			driver.close();                  
			
	}

}
