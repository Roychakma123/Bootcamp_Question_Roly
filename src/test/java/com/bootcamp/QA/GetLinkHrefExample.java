	package com.bootcamp.QA;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class GetLinkHrefExample {
	    public static void main(String[] args) {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Initialize the ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Navigate to a webpage
	        driver.get("https://www.example.com");

	        // Locate the link element by its ID, class, or any other suitable selector
	        WebElement linkElement = driver.findElement(By.id("yourLinkId"));

	        // Get the value of the "href" attribute
	        String hrefValue = linkElement.getAttribute("href");

	        // Print the href value
	        System.out.println("Href Value: " + hrefValue);

	        // Close the browser
	        driver.quit();
	    }
	}

