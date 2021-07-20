package com.a.testaddressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class FirstTest {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\senlacourse\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://a.testaddressbook.com/sign_in");
        driver.findElement(By.id("session_email")).sendKeys("zlobina_test@mail.ru");
        driver.findElement(By.id("session_password")).sendKeys("7777777password");
        driver.findElement(By.xpath("//input [@value = 'Sign in']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(@href,'/addresses') ]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(@href,'/addresses/new') ]")).click();
        Thread.sleep(1000);


        driver.findElement(By.name("address[first_name]")).sendKeys("Kris");
        Thread.sleep(1000);
        driver.findElement(By.name("address[last_name]")).sendKeys("Zlobina");
        Thread.sleep(1000);
        driver.findElement(By.name("address[address1]")).sendKeys("Texas, The USA");
        Thread.sleep(1000);
        driver.findElement(By.name("address[address2]")).sendKeys("Texas, The USA");
        Thread.sleep(1000);
        driver.findElement(By.name("address[city]")).sendKeys("Корпус-Кристи");
        Thread.sleep(1000);

        Select state = new Select(driver.findElement(By.name("address[state]")));
        Thread.sleep(1000);
        state.selectByVisibleText("Texas");
        Thread.sleep(1000);

        driver.findElement(By.name("address[zip_code]")).sendKeys("78336");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input [@value = 'us']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("address_birthday")).sendKeys("16/03/1994");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input [@value = '#000000']")).sendKeys("#C71585");
        Thread.sleep(1000);
        driver.findElement(By.name("address[age]")).sendKeys("27");
        Thread.sleep(1000);
        driver.findElement(By.name("address[website]")).sendKeys("https://www.youtube.com/");
        Thread.sleep(1000);
        driver.findElement(By.name("address[phone]")).sendKeys("29-345-76-45");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input [@id = 'address_interest_dance']")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("address[note]")).sendKeys("Some notes about me");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input [@value = 'Create Address']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(@href,'/addresses') ]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[contains(@href,'/addresses/5716/edit') ]")).click();
        Thread.sleep(1000);

        driver.findElement(By.name("address[first_name]")).clear();
        Thread.sleep(1000);
        driver.findElement(By.name("address[last_name]")).clear();
        Thread.sleep(1000);
        driver.findElement(By.name("address[first_name]")).sendKeys("Bob");
        Thread.sleep(1000);
        driver.findElement(By.name("address[last_name]")).sendKeys("Grams");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input [@type = 'submit']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(@href,'/addresses') ]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a [@data-confirm = 'Are you sure?']")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(@href,'/sign_out') ]")).click();
        Thread.sleep(1000);

       driver.close();
       driver.quit();
    }


}
