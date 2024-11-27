package Test01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		 // Set the path to your WebDriver executable (e.g., chromedriver)
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to a website
            driver.get("https://www.google.com");

            // Maximize the browser window
//            driver.manage().window().maximize();
//
//            // Find an element on the page (e.g., a text box) and perform an action (e.g., send text)
//            WebElement searchBox = driver.findElement(By.name("q")); // Assuming there's a search box with the name 'q'
//            searchBox.sendKeys("Selenium WebDriver");
//
//            // Find and click a button (e.g., search button)
//            WebElement searchButton = driver.findElement(By.name("btnK")); // Example for Google's search button
//            searchButton.click();

            // Perform additional actions or assertions as needed

        } catch (Exception e) {
            e.printStackTrace();
        } 
//        finally {
//            // Close the browser
//            driver.quit();
//        }

	}

}
