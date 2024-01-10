	
	package com.bootcamp.QA;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class DeleteCookiesExample {
	    public static void main(String[] args) {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Initialize the ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Navigate to a webpage (optional)
	        driver.get("https://www.example.com");

	        // Delete all cookies
	        driver.manage().deleteAllCookies();

	        // Close the browser
	        driver.quit();
	    }
	}

