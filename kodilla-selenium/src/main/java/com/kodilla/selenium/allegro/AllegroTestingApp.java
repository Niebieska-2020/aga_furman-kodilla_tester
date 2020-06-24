package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllegroTestingApp {

    public static final String ACCEPT_CONSENT_XPATH = "//button[@data-role=\"accept-consent\"]";
    public static final String ELECTRONICS_CATEGORY_A_XPATH = "(//div[@data-box-name='departments']/div/div/a)[1]";
    public static final String SEARCH_INPUT_XPATH = "//input[@type='search']";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://allegro.pl/");

        WebElement acceptConsentButton = driver.findElement(By.xpath(ACCEPT_CONSENT_XPATH));
        acceptConsentButton.click();

        WebElement electronicsCategoryA = driver.findElement(By.xpath(ELECTRONICS_CATEGORY_A_XPATH));
        electronicsCategoryA.click();

        WebElement inputField = driver.findElement(By.xpath(SEARCH_INPUT_XPATH));
        inputField.sendKeys("Mavic mini");
        inputField.submit();
    }
}
