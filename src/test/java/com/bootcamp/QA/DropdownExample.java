	
		package com.bootcamp.QA;
		
		import java.util.List;

import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;

		public class DropdownExample {
		    public static void main(String[] args) {
		        // Set the path to the ChromeDriver executable
		        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		        // Initialize the ChromeDriver
		        WebDriver driver = new ChromeDriver();

		        // Navigate to a webpage with a dropdown
		        driver.get("https://example.com");

		        // Locate the dropdown element by its ID
		        WebElement dropdownElement = driver.findElement(By.id("myDropdown"));

		        // Create a Select object using the dropdown element
		        Select dropdown = new Select(dropdownElement);

		        // Get all options from the dropdown
		        List<WebElement> options = dropdown.getOptions();

		        // Iterate through the options and print their text
		        for (WebElement option : options) {
		            System.out.println("Option: " + option.getText());
		        }

		        // Close the browser
		        driver.quit();
		    }
		}

	