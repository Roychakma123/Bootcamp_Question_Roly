package com.bootcamp.QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormSubmitExample {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a webpage with a form
        driver.get("https://example.com");

        // Locate the form element by its ID or any other suitable selector
        WebElement form = driver.findElement(By.id("yourFormId"));

        // Submit the form
        form.submit();

        // Close the browser
        driver.quit();
    }
}
