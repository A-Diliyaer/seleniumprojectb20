package com.cybertek.tests.day2_locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationsAndTitleVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        driver.findElement(By.linkText("Gmail")).click();
        System.out.println(driver.getTitle().contains("Gmail")?"pass":"fail");

        driver.navigate().back();
        System.out.println(driver.getTitle().equals("Google")?"pass":"fail");

        driver.quit();
    }
}
