package com.bootcamp.QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTextBoxExample {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a webpage with a text box
        driver.get("https://example.com");

        // Locate the text box element by its ID (replace "yourTextBoxId" with the actual ID)
        WebElement textBox = driver.findElement(By.id("yourTextBoxId"));

        // Type some text into the text box
        textBox.sendKeys("Text to be cleared");

        // Clear the text inside the text box
        textBox.clear();

        // Close the browser
        driver.quit();
    }
}

