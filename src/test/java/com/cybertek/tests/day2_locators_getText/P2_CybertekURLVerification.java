package com.cybertek.tests.day2_locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekURLVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com");
        String expectedUrl = "cybertekschool";
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl.contains(expectedUrl)?"pass":"fail");

        String expectedTitle = "Practice";
        String actualTitle =driver.getTitle();
        System.out.println(actualTitle.equals(expectedTitle)?"pass":"fail");

        driver.quit();
    }
}
