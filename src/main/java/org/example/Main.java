package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {

    // Chrome
    static final String DRIVER_TYPE = "webdriver.chrome.driver";
    static final String DRIVER_FILE = "./drivers/chromedriver_v101.exe";

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello Selenium World.");

        String css;
        String id;
        String tagname;
        String xpath;
        WebElement webElement;

        // Chrome
        System.setProperty(DRIVER_TYPE, DRIVER_FILE);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("start-maximized");
        ChromeDriver driver = new ChromeDriver(options);

        // Yahoo
        driver.get("https://datalaget.anal.nu/");
        System.out.println(driver.getTitle());
        //driver.manage().deleteAllCookies();
        // This may result in a different web page, since cookies are now deleted.
        //driver.get("https://datalaget.anal.nu/");

        // Here is a list of the selector types you can use:
        // ID
        // Name
        // Class Name
        // Tag Name
        // Link Text
        // Partial Link Text
        // XPath
        // CSS Selector

        Thread.sleep(200);
        xpath = "//*[@id=\"1920-text\"]";

        driver.findElement(By.xpath(xpath)).click();

        Thread.sleep(200);
        // xpath = "//div[@innertext='Logga in']";
        // driver.findElement(By.xpath(xpath)).click();
        css = "#coronaTime";
        driver.findElement(By.cssSelector(css)).click();


        Thread.sleep(200);
        xpath= "/html/body/div/header/div/div[1]/div[2]/h1/a";
        webElement = driver.findElement(By.xpath(xpath));
        webElement.click();
        // xpath = "//html[@id='Stencil']//a[@id='createacc']";
        // driver.findElement(By.xpath(xpath)).click();

        Thread.sleep(200);
        xpath= "//*[@id=\"Arbetspass\"]/div";
        webElement = driver.findElement(By.xpath(xpath));
        webElement.click();

        Thread.sleep(200);
        xpath= "//*[@id=\"menu\"]/div";
        webElement = driver.findElement(By.xpath(xpath));
        webElement.click();
        Thread.sleep(200);
        xpath= "//*[@id=\"menu-item-61\"]/a";
        webElement = driver.findElement(By.xpath(xpath));
        webElement.click();

        Thread.sleep(200);
        xpath= "//*[@id=\"andra\"]";
        webElement = driver.findElement(By.xpath(xpath));
        webElement.click();


        Thread.sleep(200);
        xpath= "//*[@id=\"fjärde\"]";
        webElement = driver.findElement(By.xpath(xpath));
        webElement.click();

        Thread.sleep(200);
        xpath= "//*[@id=\"första\"]";
        webElement = driver.findElement(By.xpath(xpath));
        webElement.click();
        Thread.sleep(200);

        xpath= "//*[@id=\"tredje\"]";
        webElement = driver.findElement(By.xpath(xpath));
        webElement.click();

        Thread.sleep(2000);
        // I disabled the following so that I don't actually create a Yahoo account
        // xpath = "//html[@id='Stencil']//button[@id='reg-submit-button']";
        // driver.findElement(By.xpath(xpath)).click();

        // Clean up manually
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }
}