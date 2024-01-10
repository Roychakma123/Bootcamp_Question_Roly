		
	package com.bootcamp.QA;
	import org.openqa.selenium.Dimension;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ResizeBrowserWindowExample {
	    public static void main(String[] args) {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Initialize the ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Navigate to a webpage (optional)
	        driver.get("https://www.example.com");

	        // Set the desired window size (width, height)
	        Dimension newSize = new Dimension(800, 600);

	        // Resize the browser window
	        driver.manage().window().setSize(newSize);

	        // Close the browser
	        driver.quit();
	    }
	}


