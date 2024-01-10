package com.bootcamp.QA;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class ClickDropdownMenuItemExample {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a webpage with a dropdown menu
        driver.get("https://www.example.com");

        // Locate the main menu element
        WebElement mainMenu = driver.findElement(By.id("yourMainMenuId"));

        // Locate the dropdown menu item
        WebElement dropdownMenuItem = driver.findElement(By.id("yourDropdownMenuItemId"));

        // Create Actions object
        Actions actions = new Actions(driver);

        // Hover over the main menu to reveal the dropdown
        actions.moveToElement(mainMenu).perform();

        // Wait for a short period if needed (optional)
        // For example, you can use WebDriverWait to wait for visibility of the dropdown

        // Click on the dropdown menu item
        dropdownMenuItem.click();

        // Close the browser
        driver.quit();
    }
}

